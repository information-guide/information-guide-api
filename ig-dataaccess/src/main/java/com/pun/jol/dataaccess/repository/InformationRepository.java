package com.pun.jol.dataaccess.repository;

import com.pun.jol.dataaccess.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
    public List<Information> findByTopicId(int topicId);

    @Query("select i from Information i where i.topicId = :topicId and (i.question like %:searchText% or i.answer like %:searchText%)")
    public List<Information> findBySearchText(@Param("topicId") int topicId, @Param("searchText") String searchText);
}
