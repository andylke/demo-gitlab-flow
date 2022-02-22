package io.github.andylke.demo.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoRestController {

  @GetMapping
  public String getEcho(@RequestParam String message) {
    return message;
  }

  @PostMapping
  public String postEcho(@RequestBody String message) {
    return message;
  }
}
