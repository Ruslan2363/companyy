package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;
public class SportCar extends Car{
   private String limitSpeed;


    public SportCar(String carBrand, String carClass, int weight,String limitSpeed, Driver driver, Engine engine) {
        super(carBrand, carClass, weight,driver,engine);
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
