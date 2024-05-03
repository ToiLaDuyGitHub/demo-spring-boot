package com.example.demospringboot.repository;

import com.example.demospringboot.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    public List<User> findAllByLocation(String locationId);
}
