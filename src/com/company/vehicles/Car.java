package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;


public class Car
{
 private String carBrand;
 private String carClass;
 private int power;
 private String producer;
 private int weight;
 private String driver;
 private String engine;


public Car(String carBrand,String carClass,int power,String producer,int weight,String driver,String engine){
    this.power=power;
    this.producer=producer;
this.driver=driver;
this.engine=engine;

    this.carBrand=carBrand;
    this.carClass=carClass;
    this.weight=weight;
}
public void setDriver(String driver) {
    this.driver = driver;
}

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public String getEngine() {
        return engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getProducer() {
        return producer;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
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
                ", power=" + power +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                ", driver='" + driver + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}




