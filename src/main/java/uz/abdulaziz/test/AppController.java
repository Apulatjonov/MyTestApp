package uz.abdulaziz.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/version")
    public String version() {
        return "v1";
    }
}