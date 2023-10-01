package com.pun.jol.dataaccess.service;

import com.pun.jol.dataaccess.entity.Topic;
import com.pun.jol.dataaccess.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired private TopicRepository repository;

    public List<Topic> getTopics() {
        return repository.findAll();
    }
}
