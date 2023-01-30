import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
Car car1=new Lorry("Ford","E",445,"USA",1500,"Остап Мирославович Вишня","чоловіча",49,947238423,20,"LorryCar","4500kg");
Car car2=new SportCar("BMW","D",610,"Germany",1000,"Михайло Володомирович Шарга","чоловіча",37,432325,17,"sport","480km/h");
System.out.println(car1);
System.out.println(car2);
        car1.start();
        car2.turnLeft();
        car1.turnRight();
        car2.stop();

    }
}