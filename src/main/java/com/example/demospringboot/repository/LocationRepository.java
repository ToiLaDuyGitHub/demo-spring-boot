package com.example.demospringboot.repository;

import com.example.demospringboot.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, String> {

}