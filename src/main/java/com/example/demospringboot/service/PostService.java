package com.example.demospringboot.service;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.entity.Post;
import com.example.demospringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Lagos"),
            "Jany@gmail.com");

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Asaba"),
            "Jadon@gmail.com");

    Post post1 = new Post(
            "p1",
            "01-Jan-19",
            user1,
            "Its good to love and be loved");

    Post post2 = new Post(
            "p2",
            "02-Jan-19",
            user2,
            "We all need someone");
    private List<Post> posts = Arrays.asList(post1, post2);

    public List<Post> getAllPosts() {
        return posts;
    }
}
