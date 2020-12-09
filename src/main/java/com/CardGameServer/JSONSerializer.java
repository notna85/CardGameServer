package com.CardGameServer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

public class JSONSerializer implements Serializer{
    /**
     * @param message
     * @return
     * @throws IOException
     */
    @Override
    public String serialize(Message message) throws IOException {
         JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
            // Only add a property to the JSON if it's not null, if it is null it will just be ignored
            if(message.getCommand() != null){
                jsonObjectBuilder.add("command", message.getCommand().toString());
             }
            if(message.getRoomName() != null){
                jsonObjectBuilder.add("roomName", message.getRoomName());
            }
            if(message.getPlayerID() != null){
                jsonObjectBuilder.add("playerID", message.getPlayerID());
            }
        // Build the JSON string
        JsonObject jsonObj = jsonObjectBuilder.build();
        // Json writer writes to a stream, so we create a string writer and write to that
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = Json.createWriter(stringWriter);
        writer.writeObject(jsonObj);
        writer.close();
        // Get the string we wrote to the buffer
        return stringWriter.getBuffer().toString();
    }

    /**
     * @param serializedMessage The json serialized message
     * @return Message object with the values passed, if a value is not passed it will simply be null.
     * @throws IOException or com.fasterxml.jackson.databind.exc.InvalidFormatException which is an IOException
     */
    @Override
    public Message deSerialize(String serializedMessage) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Message message = mapper.readValue(serializedMessage, Message.class);
        return message;
    }
}
