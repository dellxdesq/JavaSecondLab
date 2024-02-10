package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {


        List<Post> posts = new ArrayList<>();

        posts.add(new Post("text 1", new Date()));
        posts.add(new Post("text 2", new Date()));
        posts.add(new Post("text 3", new Date()));

        return posts;

    }
}
