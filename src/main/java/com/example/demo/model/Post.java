package com.example.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Column(nullable = false)
    private int likes;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;

    private String text;

    @Id
    @GeneratedValue
    private Long id;


    public Post() {
    }
    public Post(Long id,String text,Date creationDate) {
        this.text = text;
        this.id = id;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
}
