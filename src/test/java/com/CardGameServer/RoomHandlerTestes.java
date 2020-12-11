package com.CardGameServer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomHandlerTestes {
    RoomHandler rH = new RoomHandler();

    @Test
    boolean successfullyaddNewRoom(){
        rH.addNewRoom("testroom");
        if(rH.rooms.size() > 0){
            return true;
        }
        return false;
    }

    @Test
    void addNewRoom() {
    }

    @Test
    void returnLobby() {
    }
}
