/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.papeleriapar.demo.models.LocationModel;

@Repository
public interface LocationRepository extends CrudRepository<LocationModel, Long>{
    public abstract LocationModel findById(Integer id);
}
