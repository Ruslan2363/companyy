package com.company.entities;

public class Person {
    public String ПІБ ;
    public String статть;
    public int вік;
    public int номерТелефону;

    public String getПІБ() {
        return ПІБ;
    }

    public void setПІБ(String ПІБ) {
        this.ПІБ = ПІБ;
    }

    public String getСтатть() {
        return статть;
    }

    public void setСтатть(String статть) {
        this.статть = статть;
    }

    public int getВік() {
        return вік;
    }

    public void setВік(int вік) {
        this.вік = вік;
    }

    public int getНомерТелефону() {
        return номерТелефону;
    }

    public void setНомерТелефону(int номерТелефону) {
        this.номерТелефону = номерТелефону;
    }

    public Person(String ПІБ, String статть, int вік, int номерТелефону){
        this.вік=вік;
        this.ПІБ=ПІБ;
        this.статть=статть;
        this.номерТелефону=номерТелефону;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ПІБ='" + ПІБ + '\'' +
                ", статть='" + статть + '\'' +
                ", вік=" + вік +
                ", номерТелефону=" + номерТелефону +
                '}';
    }
}


