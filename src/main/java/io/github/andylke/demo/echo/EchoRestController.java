package io.github.andylke.demo.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoRestController {

  @GetMapping
  public String getEcho(String message) {
    return message;
  }
}
