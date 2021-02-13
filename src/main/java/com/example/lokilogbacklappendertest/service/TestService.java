package com.example.lokilogbacklappendertest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {

    public String test(){
        log.info("test service");
        return "test";
    }
}
