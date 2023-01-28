package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
     public int стажВодіння;
     public String типАвтомобіля;

    public int getСтажВодіння() {
        return стажВодіння;
    }

    public void setСтажВодіння(int стажВодіння) {
        this.стажВодіння = стажВодіння;
    }

    public String getТипАвтомобіля() {
        return типАвтомобіля;
    }

    public void setТипАвтомобіля(String типАвтомобіля) {
        this.типАвтомобіля = типАвтомобіля;
    }

    public Driver(String ПІБ, String статть, int вік, int номерТелефону, int стажВодіння,String типАвтомобіля) {
        super(ПІБ, статть, вік, номерТелефону);
        this.стажВодіння=стажВодіння;
        this.типАвтомобіля=типАвтомобіля;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "стажВодіння=" + стажВодіння +
                ", типАвтомобіля='" + типАвтомобіля + '\'' +
                ", ПІБ='" + ПІБ + '\'' +
                ", статть='" + статть + '\'' +
                ", вік=" + вік +
                ", номерТелефону=" + номерТелефону +
                '}';
    }
}


