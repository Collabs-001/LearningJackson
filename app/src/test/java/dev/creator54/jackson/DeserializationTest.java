package dev.creator54.jackson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import dev.creator54.jackson.Activity1.Deserialization;

public class DeserializationTest {
  private Deserialization deserialization;

  @BeforeEach
  void setUp() {
    deserialization = new Deserialization();
  }

  @Test
  void deserializeJson_Success() throws JsonProcessingException {
    String json = "{\"name\":\"Sam\",\"age\":25}";

    User user = deserialization.deserializeJson(json, User.class);

    assertNotNull(user);
    assertEquals("Sam", user.getName());
    assertEquals(25, user.getAge());
  }
}
