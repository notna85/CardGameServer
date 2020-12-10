package com.CardGameServer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomFactoryTest extends WebSocketEndPoint {

    RoomFactory roomFac = new RoomFactory();
    Player player = new Player("Jens", "100" );
    @Test
    Room createRoom2() {
       Room room = roomFac.createRoom("ting");
       return room;
    }
    @Test
    void createRoom3() {
        roomFac.createRoom("ting");
    }
}
