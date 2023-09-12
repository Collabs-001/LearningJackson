package dev.creator54.jackson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import dev.creator54.jackson.Activity2.Serialization;

public class SerializationTest {
  private Serialization serialization;

  @BeforeEach
  void setUp() {
    serialization = new Serialization();
  }

  @Test
  void serializeToJson_Success() throws JsonProcessingException {
    User user = new User("Sam", 25);
    String json = serialization.serializeToJson(user);

    String expectedJson = "{\"age\":25,\"name\":\"Sam\"}";
    assertEquals(expectedJson, json);
  }
}
