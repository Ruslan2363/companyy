package com.company.details;

public class Engine {
    private int power;
    private String producer;
    public Engine (int power,String producer){
        this.power=power;
        this.producer=producer;
    }

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }
}
