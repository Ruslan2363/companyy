package com.company.vehicles;
import  com.company.vehicles.Car;
public class Lorry extends Car{
    public String  вантажопідйомністюКузова;

    public Lorry(String ПІБ, String статть, int вік, int номерТелефону, int стажВодіння, int потужність, String виробник, String маркаАвтомобіля, String класАвтомобіля, int вага) {
        super(ПІБ, статть, вік, номерТелефону, стажВодіння, потужність, виробник, маркаАвтомобіля, класАвтомобіля, вага);
        this.вантажопідйомністюКузова=вантажопідйомністюКузова;
    }
}
