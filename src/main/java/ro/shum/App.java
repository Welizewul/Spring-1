package ro.shum;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.lang3.SerializationUtils;

public class App {

  public static void main(String[] args) throws JsonProcessingException {

    // Создаем объект Person
    Person person = new Person();
    person.setName("John");
    person.setAge(25);

    // Сериализация и десериализация с использованием Jackson.
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(person);
    Person deserializedPerson = objectMapper.readValue(json, Person.class);

    System.out.println("Jackson Serialization and Deserialization:");
    System.out.println("Original: " + person);
    System.out.println("Serialized JSON: " + json);
    System.out.println("Deserialized: " + deserializedPerson);

    // Сериализация и десериализация с использованием Gson
    Gson gson = new Gson();
    String gsonJson = gson.toJson(person);
    Person gsonDeserializedPerson = gson.fromJson(gsonJson, Person.class);

    System.out.println("\nGson Serialization and Deserialization:");
    System.out.println("Original: " + person);
    System.out.println("Serialized JSON: " + gsonJson);
    System.out.println("Deserialized: " + gsonDeserializedPerson);

    // Сериализация и десериализация с использованием Apache Commons Lang
    byte[] serializedBytes = SerializationUtils.serialize(person);
    Person apacheDeserializedPerson = SerializationUtils.deserialize(serializedBytes);

    System.out.println("\nApache Commons Serialization and Deserialization:");
    System.out.println("Original: " + person);
    System.out.println("Serialized Bytes: " + serializedBytes);
    System.out.println("Deserialized: " + apacheDeserializedPerson);
  }
}

