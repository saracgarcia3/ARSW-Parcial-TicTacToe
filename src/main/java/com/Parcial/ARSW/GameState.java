package com.Parcial.ARSW;

import java.util.Arrays;

public class GameState {
  public String roomId;
  public String[] board = new String[9];
  public String nextPlayer = "X";
  public String winner = null;
  public boolean draw = false;
  public int[] winningLine = null;
  public GameState(String roomId) { this.roomId = roomId; Arrays.fill(board, null); }
}