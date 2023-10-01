package com.pun.jol.controller;

import com.pun.jol.dataaccess.entity.Topic;
import com.pun.jol.dataaccess.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TopicController {

    @Autowired private TopicService service;

    @GetMapping(path = "/topics")
    public ResponseEntity<List<Topic>> getTopics() {
        return ResponseEntity.ok(service.getTopics());
    }
}
