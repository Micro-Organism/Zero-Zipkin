package com.zero.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Slf4j
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {

    RestTemplate restTemplate;
    @Autowired
    public ZipkinController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("ping")
    public Object ping() {
        log.info("进入ping");
        return "pong study";
    }

    @RequestMapping("log")
    public Object log() {
        log.info("this is info log");
        log.error("this is error log");
        log.debug("this is debug log");
        log.warn("this is warn log");
        log.trace("this is trace log");
        return "123";
    }

    @RequestMapping("http")
    public Object httpQuery() {

        String studyUrl = "http://localhost:8080/zipkin/ping";
        URI studyUri = URI.create(studyUrl);
        String study = restTemplate.getForObject(studyUri, String.class);
        log.info("study:{}", study);

        String floorUrl = "http://localhost:8080/zipkin/log";
        URI floorUri = URI.create(floorUrl);
        String floor = restTemplate.getForObject(floorUri, String.class);
        log.info("floor:{}", floor);

        String roomUrl = "http://localhost:8080/zipkin/ping";
        URI roomUri = URI.create(roomUrl);
        String room = restTemplate.getForObject(roomUri, String.class);
        log.info("room:{}", room);
        return study + "-------" + floor + "-------" + room + "-------";
    }


}