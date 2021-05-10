package backendunittests.services;

import com.papeleriapar.demo.models.LocationModel;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LocationServiceTest {
    
    LocationModel newLocation = new LocationModel();
    LocationModel newLocation2 = new LocationModel();
    ArrayList<LocationModel> newLocations = new ArrayList<>();
    
    @BeforeEach
    void setUp(){
        //Datos de prueba
        newLocation.setId(1);
        newLocation.setName("Bogota");
        newLocation.setArea_m2(100);
        newLocation.setParentloc(0);
        newLocation2.setId(2);
        newLocation2.setName("Medellin");
        newLocation2.setArea_m2(200);
        newLocation2.setParentloc(1);
        newLocations.add(newLocation);
        newLocations.add(newLocation2);
    }
    
    @Test
    void getLocationsTest(){
        Assertions.assertNotNull(newLocations);
        Assertions.assertTrue(newLocations.size() > 0);
        Assertions.assertTrue(newLocations.get(0).getId() != newLocations.get(1).getId());
    }
    
    @Test
    void createLocation() {
        Assertions.assertNotNull(newLocation.getId());
        Assertions.assertNotNull(newLocation.getName());
        Assertions.assertNotNull(newLocation.getArea_m2());
        Assertions.assertNotNull(newLocation.getParentloc());
        Assertions.assertTrue(newLocation.getId() > 0);
        Assertions.assertTrue(newLocation.getName().length() < 100);
        Assertions.assertTrue(newLocation.getArea_m2() > 0);
        Assertions.assertTrue(newLocation.getParentloc() >= 0);
        Assertions.assertTrue(newLocation.getId() != newLocation.getParentloc());
    }
    
    @Test
    void Location() {
        Assertions.assertNotNull(newLocation2.getId());
        Assertions.assertNotNull(newLocation2.getName());
        Assertions.assertNotNull(newLocation2.getArea_m2());
        Assertions.assertNotNull(newLocation2.getParentloc());
        Assertions.assertTrue(newLocation2.getId() > 0);
        Assertions.assertTrue(newLocation2.getName().length() < 100);
        Assertions.assertTrue(newLocation2.getArea_m2() > 0);
        Assertions.assertTrue(newLocation2.getParentloc() >= 0);
        Assertions.assertTrue(newLocation2.getId() != newLocation2.getParentloc());
    }
}
