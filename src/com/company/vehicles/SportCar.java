package com.company.vehicles;
import  com.company.vehicles.Car;
import com.company.details.Engine;
public class SportCar extends Car{
    public String граничнаШвидкість;
    public String getГраничнаШвидкість() {
        return граничнаШвидкість;
    }

    public void setГраничнаШвидкість(String граничнаШвидкість) {
        this.граничнаШвидкість = граничнаШвидкість;
    }

    public SportCar( int потужність, String виробник, String маркаАвтомобіля, String класАвтомобіля, int вага,String граничнаШвидкість) {
        super( потужність, виробник, маркаАвтомобіля, класАвтомобіля, вага);
        this.граничнаШвидкість=граничнаШвидкість;
    }


    @Override
    public String toString() {
        return "SportCar{" +
                "граничнаШвидкість='" + граничнаШвидкість + '\'' +
                ", маркаАвтомобіля='" + маркаАвтомобіля + '\'' +
                ", класАвтомобіля='" + класАвтомобіля + '\'' +
                ", вага=" + вага +
                ", потужність=" + потужність +
                ", виробник='" + виробник + '\'' +
                '}';
    }
}
