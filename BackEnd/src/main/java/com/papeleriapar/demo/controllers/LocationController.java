/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.controllers;

import java.util.*;
import com.papeleriapar.demo.models.LocationModel;
import com.papeleriapar.demo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    
    @Autowired
    LocationService locationService;
    
    @GetMapping()
    public ArrayList<LocationModel> getLocations(){
        return locationService.getLocations();
    }
    
    @GetMapping( path="/{id}" )
    public LocationModel Location(@PathVariable("id") Integer id){
        return locationService.Location(id);
    }
            
    @PostMapping()
    public LocationModel createLocation(@RequestBody LocationModel usuario){
        return locationService.createLocation(usuario);
    }
}
