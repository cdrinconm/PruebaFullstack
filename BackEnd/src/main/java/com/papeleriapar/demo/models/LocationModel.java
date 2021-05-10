/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriapar.demo.models;

import javax.persistence.*;

@Entity
@Table(name="location")
public class LocationModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private int area_m2;
    private int parentloc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea_m2() {
        return area_m2;
    }

    public void setArea_m2(int area_m2) {
        this.area_m2 = area_m2;
    }
    
    public int getParentloc() {
        return parentloc;
    }

    public void setParentloc(int parentloc) {
        this.parentloc = parentloc;
    }
}
