package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @RequestMapping(value = "/locations/{id}")
    public Location getLocationById(@PathVariable String id) {
        return locationService.getLocationById(id);
    }

    @PostMapping(value = "/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }

    @DeleteMapping(value = "/location/{id}")
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }

    @PutMapping(value = "/locations/{id}")
    public void updateLocation(@PathVariable String id, @RequestBody Location location) {
        locationService.updateLocation(id, location);
    }
}
