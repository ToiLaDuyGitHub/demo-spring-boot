package com.example.demospringboot.service;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        List<Location> locations = new ArrayList<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }

    public Location getLocationById(String id) {
        return locationRepository.findById(id).orElse(null);
    }

    public void addLocation(Location location) {
        locationRepository.save(location);
    }

    public void updateLocation(String id, Location location) {
        locationRepository.save(location);
    }

    public void deleteLocation(String id) {
        locationRepository.deleteById(id);
    }

    //returns list of locations base on a given name
    public List<Location> getLocationsByName(String name) {
        List<Location> locations  = new ArrayList<>();

        locationRepository.findByName(name)
                .forEach(locations::add);

        return locations;
    }
}
