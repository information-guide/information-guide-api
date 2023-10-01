package com.pun.jol.dataaccess.repository;

import com.pun.jol.dataaccess.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
    public List<Information> findByTopicId(int topicId);
}
