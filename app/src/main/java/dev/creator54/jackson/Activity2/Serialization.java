package dev.creator54.jackson.Activity2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.creator54.jackson.User;

public class Serialization {
    // Plain Old Java Object(POJO) ----> JSON

    // Serialize a POJO to JSON
    public String serializeToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

    public void run() throws JsonProcessingException {
        // Create a user object
        User user = new User("Sam", 25);

        // Serialize the user object to JSON
        String json = serializeToJson(user);

        // Print the JSON
        System.out.println("Serialized Data(POJO ---> JSON):");
        System.out.println(json);
    }
}
