package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;


public class Car
{
 private String carBrand;
 private String carClass;

 private int weight;
 private Driver driver;
 private Engine engine;


public Car(String carBrand,String carClass,int weight,Driver driver,Engine engine){

this.driver=driver;
this.engine=engine;

    this.carBrand=carBrand;
    this.carClass=carClass;
    this.weight=weight;
}


    public String getCarBrand() {
        return carBrand;
    }





    public int getWeight() {
        return weight;
    }

    public String getCarClass() {
        return carClass;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }



    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }


    public void start(){
        System.out.println("Поїхали");
    }
    public void stop(){
        System.out.println("Зупиняємось");
    }
    public void turnRight(){
        System.out.println("ПоворотНаправо");
    }
    public void turnLeft(){
        System.out.println("ПоворотНаліво");
    }


    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}




