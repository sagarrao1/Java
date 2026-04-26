package com.telusko.SpringbootLoggerDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private Igreeting greeting;

    @RequestMapping("/")
    public ResponseEntity<String> home() {
        log.trace("HomeController log level trace");
        log.debug("HomeController log level debug");
        log.info("HomeController log level info");
        log.warn("HomeController log level warn");
        log.error("HomeController log level error");

        String body =greeting.greet();
        return new ResponseEntity<>(body, HttpStatus.OK);
    }


}
