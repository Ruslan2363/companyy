package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;


public class Car extends Engine
{
 public String маркаАвтомобіля;
 public String класАвтомобіля;

 public int вага;

    public String getКласАвтомобіля() {
        return класАвтомобіля;
    }
    public void setКласАвтомобіля(String класАвтомобіля) {
        this.класАвтомобіля = класАвтомобіля;
    }

    public String getМаркаАвтомобіля() {
        return маркаАвтомобіля;
    }

    public void setМаркаАвтомобіля(String маркаАвтомобіля) {
        this.маркаАвтомобіля = маркаАвтомобіля;
    }


    public int getВага() {
        return вага;
    }

    public void setВага(int вага) {
        this.вага = вага;
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
public Car(int потужність,String виробник,String маркаАвтомобіля,String класАвтомобіля,int вага ){
     super(потужність,виробник);
     this.маркаАвтомобіля=маркаАвтомобіля;
     this.класАвтомобіля=класАвтомобіля;
     this.вага=вага;


}


    @Override
    public String toString() {
        return "Car{" +
                "маркаАвтомобіля='" + маркаАвтомобіля + '\'' +
                ", класАвтомобіля='" + класАвтомобіля + '\'' +
                ", вага=" + вага +
                ", потужність=" + потужність +
                ", виробник='" + виробник + '\'' +
                '}';
    }
}




