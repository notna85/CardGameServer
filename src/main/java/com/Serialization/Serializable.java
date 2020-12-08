package com.Serialization;

public interface Serializable {

    String serialize(Message m);
    Message deSerialize(String s);
}
