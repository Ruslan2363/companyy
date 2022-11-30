package com.company.vehicles;

public class SportCar extends Car{
    public String граничнаШвидкість;
    public SportCar(String ПІБ, String статть, int вік, int номерТелефону, int стажВодіння, int потужність, String виробник, String маркаАвтомобіля, String класАвтомобіля, int вага) {
        super(ПІБ, статть, вік, номерТелефону, стажВодіння, потужність, виробник, маркаАвтомобіля, класАвтомобіля, вага);
        this.граничнаШвидкість=граничнаШвидкість;
    }
}
