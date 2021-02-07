package com.switches.mechswitchapi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Switch {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    // The name of the switch (clear, brown, red, speed silver, etc.)
    private String name;

    // Possibly a link to an image of the switch?
    private String image;

    // Brand of switch (Gateron, kailh, cherry mx, etc)
    private String brand;

    // Type of switch (Clicky, Linear, Tactile)
    private String type;

    // Operating force (measured in cN)
    private String operating_force;

    // activation point (measured in mm sometimes called pretravel)
    private String activation_point;

    // Total travel distance (measured in mm)
    private String travel_distance;

    // lifespan (measured in millions)
    private String lifespan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperating_force() {
        return operating_force;
    }

    public void setOperating_force(String operating_force) {
        this.operating_force = operating_force;
    }

    public String getActivation_point() {
        return activation_point;
    }

    public void setActivation_point(String activation_point) {
        this.activation_point = activation_point;
    }

    public String getTravel_distance() {
        return travel_distance;
    }

    public void setTravel_distance(String travel_distance) {
        this.travel_distance = travel_distance;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }
}
