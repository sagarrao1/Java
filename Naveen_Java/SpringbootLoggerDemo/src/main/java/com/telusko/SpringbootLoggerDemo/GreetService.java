package com.telusko.SpringbootLoggerDemo;

import com.telusko.SpringbootLoggerDemo.controller.Igreeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetService implements Igreeting {

    Logger log = LoggerFactory.getLogger(GreetService.class);
    
    @Override
    public String greet() {
        log.trace("GreetService log level trace");
        log.debug("GreetService log level debug");
        log.info("GreetService log level info");
        log.warn("GreetService log level warn");
        log.error("GreetService log level error");
        String body=null;

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();

        if(hour>=5 && hour<12){
            body="Good Morning";
        }
        else if(hour>=12 && hour<17){
            body="Good Afternoon";
        }
        else if(hour>=17 && hour<21){
            body="Good Evening";
        }
        else{
            body="Good Night";
        }
        return body;
    }
}
