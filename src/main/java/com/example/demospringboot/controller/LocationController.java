package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Location;
import com.example.demospringboot.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public String getAllLocations(Model model)
    {
        model.addAttribute("locations", locationService.getAllLocations());
        return "locations";
    }

    @RequestMapping(value = "/locations/{id}")
    public Location getLocationById(@PathVariable String id) {
        return locationService.getLocationById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }

    @DeleteMapping(value = "/locations/{id}")
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }

    @PutMapping(value = "/locations/{id}")
    public void updateLocation(@PathVariable String id, @RequestBody Location location) {
        locationService.updateLocation(id, location);
    }

    @RequestMapping(value = "/locations/name/{name}")
    public List<Location> getLocationByName(@PathVariable String name) {
        return locationService.getLocationsByName(name);
    }
}
