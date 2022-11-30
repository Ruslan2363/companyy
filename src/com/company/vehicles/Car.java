package com.company.vehicles;

import com.company.professions.Driver;

public class Car extends  Driver {
 public String маркаАвтомобіля;
 public String класАвтомобіля;
    public int потужність;
    public String виробник;
 public int вага;

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
public Car(String ПІБ,String статть,int вік,int номерТелефону,int стажВодіння,int потужність,String виробник,String маркаАвтомобіля,String класАвтомобіля,int вага ){
     super(ПІБ,статть,вік, номерТелефону,стажВодіння,потужність,виробник);
     this.маркаАвтомобіля=маркаАвтомобіля;
     this.класАвтомобіля=класАвтомобіля;
     this.вага=вага;
    this.потужність=потужність;
    this.виробник=виробник;
}
    public String toString() {

        return "Car -" +"ПІБ-"+ПІБ+",статть-"+статть +",вік"+вік+
                ",номерТелефону-"+номерТелефону+",стажВодіння-"+стажВодіння+",потужність-"+
                потужність+"виробник-"+виробник+ ",маркаАвтомобіля-"+маркаАвтомобіля+
                ",класАвтомобіля-"+класАвтомобіля+" вага-"+вага;


    }

}


