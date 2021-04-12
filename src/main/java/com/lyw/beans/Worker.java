package com.lyw.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Worker implements Person{
  private String name;
  private Integer age;
}
