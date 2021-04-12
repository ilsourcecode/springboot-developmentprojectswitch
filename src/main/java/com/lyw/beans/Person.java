package com.lyw.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Data
//@Component
//@ConfigurationProperties(prefix = "person")
public interface Person {

//  private String name;
//  private Integer age;
  String getName();
  Integer getAge();
}
