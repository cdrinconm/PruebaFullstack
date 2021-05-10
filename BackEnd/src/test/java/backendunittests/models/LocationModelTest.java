package backendunittests.models;

import com.papeleriapar.demo.models.LocationModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LocationModelTest {
    
    LocationModel newLocation = new LocationModel();
            
    @Test
    void getId(){
        Assertions.assertEquals(0,newLocation.getId());
        newLocation.setId(10);
        Assertions.assertEquals(10, newLocation.getId());
    }
    
    @Test
    void setId() {
        newLocation.setId(10);
        Assertions.assertEquals(10, newLocation.getId());
    }
    
    @Test
    void getName(){
        Assertions.assertNull(newLocation.getName());
        newLocation.setName("Bogota");
        Assertions.assertEquals("Bogota", newLocation.getName());
    }
    
    @Test
    void setName() {
        newLocation.setName("Bogota");
        Assertions.assertEquals("Bogota", newLocation.getName());
    }
    
    @Test
    void getArea_m2(){
        Assertions.assertEquals(0,newLocation.getArea_m2());
        newLocation.setArea_m2(500);
        Assertions.assertEquals(500, newLocation.getArea_m2());
    }
    
    @Test
    void setArea_m2() {
        newLocation.setArea_m2(500);
        Assertions.assertEquals(500, newLocation.getArea_m2());
    }
    
    @Test
    void getParentloc(){
        Assertions.assertEquals(0,newLocation.getParentloc());
        newLocation.setParentloc(3);
        Assertions.assertEquals(3, newLocation.getParentloc());
    }
    
    @Test
    void setParentloc() {
        newLocation.setParentloc(3);
        Assertions.assertEquals(3, newLocation.getParentloc());
    }
}
