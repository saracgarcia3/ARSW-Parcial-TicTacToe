package com.Parcial.ARSW;

import java.util.Map; 
import java.util.Objects; 
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

@Service
public class AppService {
  private final Map<String, GameState> rooms = new ConcurrentHashMap<>();
  public GameState getOrCreate(String roomId) { return rooms.computeIfAbsent(roomId, GameState::new); }
  public GameState reset(String roomId) { rooms.put(roomId, new GameState(roomId)); return rooms.get(roomId); }
  public GameState applyMove(String roomId, MoveMessage move) {
    GameState tic = getOrCreate(roomId);


    if (tic.winner != null || tic.draw) return tic;
    if (!Objects.equals(move.player, tic.nextPlayer)) return tic;
    if (move.index < 0 || move.index > 8) return tic;
    if (tic.board[move.index] != null) return tic;
    tic.board[move.index] = move.player;

    int[][] lines = [
        [0,1,2],
        [3,4,5],
        [6,7,8],
        [0,3,6],
        [1,4,7],
        [2,5,8],
        [0,4,8],
        [2,4,6];
    ];

    for (int[] L: lines) {
      String a = tic.board[L[0]], b = tic.board[L[1]], c = tic.board[L[2]];
      if (a != null && a.equals(b) && a.equals(c)) { tic.winner = a; tic.winningLine = L; return tic; }
    }
    
    boolean filled = true; for (String cell: tic.board) if (cell == null) { filled = false; break; }
    if (filled) { tic.draw = true; return tic; }
    tic.nextPlayer = move.player.equals("X") ? "O" : "X"; return tic;
  }
}



