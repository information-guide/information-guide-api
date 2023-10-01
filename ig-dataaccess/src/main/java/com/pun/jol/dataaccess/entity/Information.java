package com.pun.jol.dataaccess.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "INFORMATION")
@Data
public class Information {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TOPIC_ID")
    private int topicId;

    @Column(name = "QUESTION", length = 4000)
    private String question;

    @Column(name = "ANSWER",  length = 4000)
    private String answer;
}
