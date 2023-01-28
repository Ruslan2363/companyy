import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Lorry(349,"USA","Ford","Hard",997,"12000kg");
        Car car2 = new SportCar(550,"Italy","Ferrari","B3",400,"680km/h");
        Driver driver1 = new Driver("Морозюк Петро Іванович","чоловік",45,3372111,19,"Lorry");
        Driver driver2 = new Driver("Симоненко Устим Ворофоломійович","чоловік",58,235666543,33,"SportCar");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(driver1);
        System.out.println(driver2);
    }
}