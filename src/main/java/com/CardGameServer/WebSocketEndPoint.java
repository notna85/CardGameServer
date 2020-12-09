package com.CardGameServer;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ServerEndpoint("/ws")
public class WebSocketEndPoint {

    //private Map<String, String> usernames = new HashMap<String, String>();
    private Lobby lobby = new Lobby();

    @OnOpen
    public void open(Session session) throws IOException, EncodeException {


        //session.getBasicRemote().sendText("(Server): Welcome to the chat room. Please state your username to begin.");

    }


    @OnClose
    public void close(Session session) throws IOException, EncodeException {

        /*String userId = session.getId();
        if (usernames.containsKey(userId)) {
            String username = usernames.get(userId);
            usernames.remove(userId);
            for (Session peer : session.getOpenSessions())
                peer.getBasicRemote().sendText("(Server): " + username + " left the chat room.");
        }*/

    }

    @OnMessage
    public void handleMessage(String message, Session session) throws IOException, EncodeException {
        String Success;
        Success = lobby.handleMessage(session.getId(), message);

        //Code used to simulate feedback messages to client
        if(Success.equals("True")){
            session.getBasicRemote().sendText("Room created!");
            for (Session peer : session.getOpenSessions())
                for(Room room : RoomHandler.rooms)
                    peer.getBasicRemote().sendText(room.getRoomName());
        }
        else
            session.getBasicRemote().sendText("Roomname already exists!");

        /*String userId = session.getId();
        if (usernames.containsKey(userId)) {
            String username = usernames.get(userId);
            for (Session peer : session.getOpenSessions())
                peer.getBasicRemote().sendText("(" + username + "): " + message);
        } else {
            if (usernames.containsValue(message) || message.toLowerCase().equals("server"))
                session.getBasicRemote().sendText("(Server): That username is already in use. Please try again.");
            else {
                usernames.put(userId, message);
                session.getBasicRemote().sendText("(Server): Welcome, " + message + "!");
                for (Session peer : session.getOpenSessions())
                    if (!peer.getId().equals(userId))
                        peer.getBasicRemote().sendText("(Server): " + message + " joined the chat room.");
            }
        }*/

    }
}
