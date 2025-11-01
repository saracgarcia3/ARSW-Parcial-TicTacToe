package com.Parcial.ARSW;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class TicController {
  private final AppService service;
  
  public TicController(AppService s){ this.service=s; }
  @MessageMapping("/room/{roomId}/join") public void join(@DestinationVariable String roomId, JoinMessage msg){
    var state = service.getOrCreate(roomId, state);
  }
  @MessageMapping("/room/{roomId}/move") public void move(@DestinationVariable String roomId, MoveMessage msg){
    var state = service.applyMove(roomId, msg); 
  }
  @MessageMapping("/room/{roomId}/reset") public void reset(@DestinationVariable String roomId){
    var state = service.reset(roomId);
  }
}


