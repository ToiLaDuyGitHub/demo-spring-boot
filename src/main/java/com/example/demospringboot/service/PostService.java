package com.example.demospringboot.service;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.entity.Post;
import com.example.demospringboot.entity.User;
import com.example.demospringboot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }

    public Post getPostById(String id) {
        return postRepository.findById(id).orElse(null);
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void updatePost(String id, Post post) {
        postRepository.save(post);
    }

    public void deletePost(String id) {
        postRepository.deleteById(id);
    }

    public List<Post> getPostsByUser(String userId) {
        List<Post> posts = new ArrayList<>();
        postRepository.findByUserId(userId).forEach(posts::add);
        return posts;
    }
}
