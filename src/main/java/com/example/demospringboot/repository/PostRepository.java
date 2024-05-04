package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, String> {
    public List<Post> findByUserId(String userId);
}
