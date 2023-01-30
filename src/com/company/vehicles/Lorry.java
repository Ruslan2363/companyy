package com.company.vehicles;
import  com.company.vehicles.Car;
import com.company.details.Engine;
public class Lorry extends Car{
    private String  carryingCapacityBody;

    public Lorry(String carBrand, String carClass, int power, String producer, int weight, String Name, String sex, int age, int telefon, int drivingExperience, String typeOfCar,String  carryingCapacityBody) {
        super(carBrand, carClass, power, producer, weight, Name, sex, age, telefon, drivingExperience, typeOfCar);
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

