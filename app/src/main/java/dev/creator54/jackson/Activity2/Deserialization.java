package dev.creator54.jackson.Activity2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.creator54.jackson.User;

public class Deserialization {
  // JSON ----> Plain Old Java Object(POJO)

  public void run() throws JsonProcessingException {
    // JSON data to deserialize
    String json = "{\"name\":\"Sam\",\"age\":25}";

    // Deserialize the JSON to a User object
    User user = deserializeJson(json, User.class);

    // Print the deserialized data
    System.out.println("Deserialized Data(POJO):");
    System.out.println("Name: " + user.getName());
    System.out.println("Age: " + user.getAge());
  }

  // Deserialize JSON to a Java object of the specified User class
  public User deserializeJson(String json, Class<User> clazz) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(json, clazz);
  }
}
