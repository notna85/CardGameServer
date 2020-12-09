package com.CardGameServer;

import java.io.IOException;

public interface Serializer {
    String serialize(Message message) throws IOException;
    Message deSerialize(String serualizedMessage) throws IOException;
}
