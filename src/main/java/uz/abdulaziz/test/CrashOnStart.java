package uz.abdulaziz.test;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CrashOnStart {

    @PostConstruct
    public void init() {
        throw new RuntimeException("Fail startup");
    }
}