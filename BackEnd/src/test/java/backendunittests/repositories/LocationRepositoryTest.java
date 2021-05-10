package backendunittests.repositories;

import com.papeleriapar.demo.models.LocationModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LocationRepositoryTest {
    
    LocationModel newLocation = new LocationModel();
    
    @BeforeEach
    void setUp(){
        //Datos de prueba
        newLocation.setId(1);
        newLocation.setName("Bogota");
        newLocation.setArea_m2(100);
        newLocation.setParentloc(0);
    }
    
    @Test
    void findById(){
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
}
