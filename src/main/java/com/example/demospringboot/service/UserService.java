package com.example.demospringboot.service;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
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
    private List<User> users = new ArrayList<>(Arrays.asList(user1, user2));

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(String id) {
        User user = users.stream().filter(t -> id.equals(t.getId())).findFirst().get();
        return user;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(String id) {
        users.removeIf(t -> id.equals(t.getId()));
    }

    public void updateUser(String id, User user) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (id.equals(u.getId())) {
                users.set(i, user);
            }
        }
    }
}
