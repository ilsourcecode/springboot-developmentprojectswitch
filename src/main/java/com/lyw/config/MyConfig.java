package com.lyw.config;

import com.lyw.beans.Boss;
import com.lyw.beans.Worker;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {

  /*@Bean
  @Profile("test")
  @ConfigurationProperties(prefix = "person")
  public Boss boss() {
    return new Boss();
  }

  @Bean
  @Profile("prod")
  @ConfigurationProperties(prefix = "person")
  public Worker Worker() {
    return new Worker();
  }*/
}
