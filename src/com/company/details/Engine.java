package com.company.details;

public class Engine {
    public int потужність;
    public String виробник;

    public int getПотужність() {
        return потужність;
    }
    public void setПтужність(int потужність){
        this.потужність=потужність;
    }

    public String getВиробник() {
        return виробник;
    }
    public void setВиробник(String виробник){
        this.виробник=виробник;
    }

    public Engine (int потужність,String виробник){
        this.потужність=потужність;
        this.виробник=виробник;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "потужність=" + потужність +
                ", виробник='" + виробник + '\'' +
                '}';
    }
}
