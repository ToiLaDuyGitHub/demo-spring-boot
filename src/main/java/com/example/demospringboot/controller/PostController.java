package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Post;
import com.example.demospringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts")
    public String getAllPosts(Model model)
    {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/posts/{id}")
    public Post getPostById(@PathVariable String id) {
        return postService.getPostById(id);
    }

    @PostMapping(value = "/posts")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @DeleteMapping(value = "/posts/{id}")
    public void deletePostById(@PathVariable String id) {
        postService.deletePost(id);
    }

    @PutMapping(value = "/posts/{id}")
    public void updatePostById(@PathVariable String id, @RequestBody Post post) {
        postService.updatePost(id, post);
    }
}
