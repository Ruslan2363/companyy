package com.company.vehicles;
import com.company.professions.Driver;
import  com.company.vehicles.Car;
import com.company.details.Engine;
public class Lorry extends Car{
    private String  carryingCapacityBody;

    public Lorry(String carBrand, String carClass, int weight, String  carryingCapacityBody, Driver driver, Engine engine) {
        super(carBrand, carClass, weight,driver,engine);
        this.carryingCapacityBody=carryingCapacityBody;
    }

    public String getCarryingCapacityBody() {
        return carryingCapacityBody;
    }

    public void setCarryingCapacityBody(String carryingCapacityBody) {
        this.carryingCapacityBody = carryingCapacityBody;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carryingCapacityBody='" + carryingCapacityBody + '\'' +
                "} " + super.toString();
    }
}

