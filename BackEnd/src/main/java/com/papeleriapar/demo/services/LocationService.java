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
        // Trae todas las ubicaciones
        return (ArrayList<LocationModel>) usuarioRepository.findAll();
    }

    public LocationModel createLocation(LocationModel location) {
        // Crea una ubicacion. Si se especifica el id, se actualiza la ubicacion de dicho id.
        return usuarioRepository.save(location); 
    }
    
    public Optional<LocationModel> getLocationById(Long id) {
        // Obtener una ubicacion especificando el id.
        return usuarioRepository.findById(id);
    }
    
    public boolean deleteLocation(Long id) {
        // Eliminar una ubicacion especificando el id.
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
