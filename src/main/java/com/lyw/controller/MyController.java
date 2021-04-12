package com.lyw.controller;

import com.lyw.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Value("${person.name:李四}")
  private String name;

  @Value("${os.name}")
  String osName;

  @Autowired
  Person person;

  @GetMapping("/")
  public Person hello() {
    return person;
  }

  /*@GetMapping("/")
  public String hello() {
    return osName;
  }*/


}
