package com.company.vehicles;
import  com.company.vehicles.Car;
import com.company.details.Engine;
public class SportCar extends Car{
   private String limitSpeed;


    public SportCar(String carBrand, String carClass, int power, String producer, int weight, String Name, String sex, int age, int telefon, int drivingExperience, String typeOfCar,String limitSpeed) {
        super(carBrand, carClass, power, producer, weight, Name, sex, age, telefon, drivingExperience, typeOfCar);
        this.limitSpeed=limitSpeed;
    }

    public String getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(String limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "limitSpeed='" + limitSpeed + '\'' +
                "} " + super.toString();
    }
}
