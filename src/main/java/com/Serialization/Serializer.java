package com.Serialization;

import java.io.IOException;

public interface Serializer {
    String serialize(Message message) throws IOException;
    Message deSerialize(String serializedMessage) throws IOException;
}
