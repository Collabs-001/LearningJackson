/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dev.creator54.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;

import dev.creator54.jackson.Activity1.Deserialization;
import dev.creator54.jackson.Activity2.Serialization;

public class App {

    public static void main(String[] args) throws JsonProcessingException {

        // TODO1
        Deserialization deserialization = new Deserialization();
        deserialization.run();
        // TODO2
        Serialization serialisation = new Serialization();
        serialisation.run();
    }
}
