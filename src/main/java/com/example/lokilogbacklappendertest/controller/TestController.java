package com.example.lokilogbacklappendertest.controller;

import com.example.lokilogbacklappendertest.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        log.info("test controller");
        return ResponseEntity.ok(testService.test());
    }
}
