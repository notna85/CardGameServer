package com.Serialization;

import com.Command.Command;
import org.junit.Assert;
import org.junit.experimental.theories.Theories;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Theories.class)
class JSONSerializerTest {

    @Test
    void serialize() {
        Message message = new Message(Command.CreateRoom, "Test room 1", "test player id 1");
        String serializedMessage = "";
        String expected = "{\"command\":\"CreateRoom\",\"roomName\":\"Test room 1\",\"playerID\":\"test player id 1\"}";
        JSONSerializer jsonSerializer = new JSONSerializer();
        try {
            serializedMessage = jsonSerializer.serialize(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("Serialized data: " + serializedMessage);
        Assert.assertEquals(serializedMessage, expected);
    }

    @Test
    void deSerialize() {
        Message expectedMessage = new Message();
        Message message = new Message();
        String serializedMessage = "{\"command\":\"CreateRoom\",\"roomName\":\"Test room 1\"}";
        JSONSerializer jsonSerializer = new JSONSerializer();
        try {
            message = jsonSerializer.deSerialize(serializedMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Assert.assertEquals(message, );
        //System.out.println("Deserialized message object command: " + message.getCommand() + " roomName: " + message.getRoomName());
    }
}
