package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
     private int drivingExperience;
     private String typeOfCar;


    public Driver(String Name, String sex, int age, int telefon,int drivingExperience,String typeOfCar) {
        super(Name, sex, age, telefon);
        this.drivingExperience=drivingExperience;
        this.typeOfCar=typeOfCar;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", typeOfCar='" + typeOfCar + '\'' +
                "} " + super.toString();
    }
}


