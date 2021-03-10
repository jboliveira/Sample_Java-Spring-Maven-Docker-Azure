package com.jboliveira.springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @GetMapping
  public String hello() {
    return "Hello World! Building via Azure Pipelines!";
  }
}