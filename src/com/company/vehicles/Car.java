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
 private int drivingExperience;
 private String typeOfCar;
 private String Name ;
    private String sex;
    private int age;
    private int telefon;
public Car(String carBrand,String carClass,int power,String producer,int weight,String Name , String sex, int age, int telefon,int drivingExperience,String typeOfCar){
    this.power=power;
    this.producer=producer;
    this.Name=Name;
    this.sex=sex;
    this.age=age;
    this.telefon=telefon;
    this.drivingExperience=drivingExperience;
    this.typeOfCar=typeOfCar;
    this.carBrand=carBrand;
    this.carClass=carClass;
    this.weight=weight;
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
    }public String getName() {
    return Name;
}

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
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
                ", drivingExperience=" + drivingExperience +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", Name='" + Name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telefon=" + telefon +
                '}';
    }
}




