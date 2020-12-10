package com.Serialization;

import java.io.IOException;

public class SerializationHandler {
    Serializer serializer = new JSONSerializer();

    public String formatMessage(Message message) throws IOException {
        return serializer.serialize(message);
    }
    public Message deformatMessage(String playerID, String message) throws IOException {
        Message message1 = serializer.deSerialize(message);
        message1.setPlayerID(playerID);
        return message1;
    }
}
