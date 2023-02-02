import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
Car car1=new Lorry("Ford","D4",4543,"USA",2345,"6300kg","Олег Миколайович Вишня","Transit 2.0 TDCi");
Car car2=new SportCar("Peugeot","C",1000,"France",1200,"340km/h","Михайло Андрійович Остапенко","Peugeot 308 2.0hdi");
Driver driver1 =new Driver("Олег Миколайович Вишня","Чоловіча ",59,482736,25,"Lorry");
Driver driver2=new Driver("Михайло Андрійович Остапенко","чоловіча",35,74618,13,"Sport");
        System.out.println(driver1);
        System.out.println(driver2);
System.out.println(car1);
System.out.println(car2);
        car1.start();
        car2.turnLeft();
        car1.turnRight();
        car2.stop();

    }
}