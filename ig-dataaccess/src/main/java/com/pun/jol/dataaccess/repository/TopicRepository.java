package com.pun.jol.dataaccess.repository;

import com.pun.jol.dataaccess.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    public Topic findByCode(int topicId);
}
