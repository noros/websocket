package wserver.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {
  @RequestMapping("/ping")
  public String ping() {
    return "Greetings from echo resource";
  }
}
