package dev.creator54.jackson.Activity1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.creator54.jackson.User;

public class Deserialization {
  // JSON ----> Plain Old Java Object(POJO)

  // Deserialize JSON to a Java object of the specified User class
  public User deserializeJson(String json, Class<User> clazz) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(json, clazz);
  }

  public void run() throws JsonProcessingException {
    // TODO 1.1
    // JSON data to deserialize
    String json = "{\"name\":\"Sam\",\"age\":25}";

    // Deserialize the JSON to a User object
    User user = deserializeJson(json, User.class);

    // Print the deserialized data
    System.out.println("Deserialized Data(JSON ---> POJO):");
    System.out.println("Name: " + user.getName());
    System.out.println("Age: " + user.getAge());

    // TODO 1.2
    // JSON data with not matching key names handling using @JsonProperty

    String json2 = "{\"fullName\":\"Jack\",\"age\":30}";

    User user2 = deserializeJson(json2, User.class);

    System.out.println("Deserialized Data(JSON ---> POJO) with proper key handling using @JsonProperty:");
    System.out.println("Name: " + user2.getName());
    System.out.println("Age: " + user2.getAge());
  }
}
