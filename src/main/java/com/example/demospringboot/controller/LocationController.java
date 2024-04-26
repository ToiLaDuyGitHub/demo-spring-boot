package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}
