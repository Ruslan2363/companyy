import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
Car car1=new Lorry("Ford","D4",2345,"6300kg",new Driver("Олег Миколайович Вишня","Чоловіча ",59,482736,25,"Lorry"),new Engine(4543,"USA"));
Car car2=new SportCar("Peugeot","C",1200, "340km/h", new Driver("Віталік Архипович Грушко","Чоловіча ",39,482736,15,"Sport"),new Engine(2323,"France"));


System.out.println(car1);
System.out.println(car2);
        car1.start();
        car2.turnLeft();
        car1.turnRight();
        car2.stop();

    }
}