package ro.shum;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Person implements Serializable {

  @JsonProperty
  private String name;

  @JsonProperty
  private int age;


  public void setName(String john) {
  }

  public void setAge(int i) {
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
