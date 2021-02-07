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

    /**
     * The name of the switch (clear, brown, red, speed silver, etc.)
     */
    private String name;

    // Possibly a link to an image of the switch?
    private String image;

    private String brand;
}
