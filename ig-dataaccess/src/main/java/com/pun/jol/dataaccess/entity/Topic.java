package com.pun.jol.dataaccess.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "TOPICS")
@Entity
public class Topic {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODE")
    private int code;

    @Column(name = "NAME")
    private String name;
}
