package com.papeleriapar.demo.services;

import java.util.*;
import com.papeleriapar.demo.models.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papeleriapar.demo.repositories.LocationRepository;

@Service
public class LocationService {

    @Autowired
    LocationRepository usuarioRepository;

    public ArrayList<LocationModel> getLocations() {
        return (ArrayList<LocationModel>) usuarioRepository.findAll();
    }

    public LocationModel createLocation(LocationModel location) {
        return usuarioRepository.save(location); // Si se envia el id de location, se actualiza la location.
    }
    
    public LocationModel Location(Integer id) {
        return usuarioRepository.findById(id);
    }
}
