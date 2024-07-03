package com.example.studentproject.controller;

import com.example.studentproject.model.Location;
import com.example.studentproject.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/getalllocation")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/getlocationbyid/{id}")
    public Location getLocationById(@PathVariable Long id) {
        return locationService.getLocationById(id);
    }

    @PostMapping("/createlocation")
    public Location createLocation(@RequestBody Location location) {
        return locationService.saveLocation(location);
    }

    @PutMapping("/updatelocation/{id}")
    public Location updateLocation(@PathVariable Long id, @RequestBody Location location) {
        Location existingLocation = locationService.getLocationById(id);
        if (existingLocation != null) {
            existingLocation.setName(location.getName());
            existingLocation.setAddress(location.getAddress());
            return locationService.saveLocation(existingLocation);
        } else {
            return null;
        }
    }

    @DeleteMapping("/dellocation/{id}")
    public void deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
    }
}