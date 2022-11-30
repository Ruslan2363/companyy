package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
     public int стажВодіння;

    public Driver(String ПІБ, String статть, int вік, int номерТелефону, int стажВодіння, int потужність, String виробник) {
        super(ПІБ, статть, вік, номерТелефону);
        this.стажВодіння=стажВодіння;
    }
}

