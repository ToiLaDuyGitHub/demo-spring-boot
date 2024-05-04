package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, String> {
    public List<Location> findByName(String name);
}
