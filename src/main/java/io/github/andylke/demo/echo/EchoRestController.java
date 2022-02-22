package io.github.andylke.demo.echo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/echo")
public class EchoRestController {

  @GetMapping
  public String getEcho(@RequestParam String message) {
    return String.format("%tT: %s", LocalDateTime.now(), message);
  }

  @PostMapping
  public String postEcho(@RequestBody String message) {
    return String.format("%tT: %s", LocalDateTime.now(), message);
  }
}
