package com.company.vehicles;
import  com.company.vehicles.Car;
import com.company.details.Engine;
public class Lorry extends Car{
    private String  carryingCapacityBody;

    public Lorry(String carBrand, String carClass, int power, String producer, int weight,String  carryingCapacityBody,String driver,String engine) {
        super(carBrand, carClass, power, producer, weight,driver,engine);
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

