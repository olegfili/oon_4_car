import transport.Bus;
import transport.Car;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","Х5",3.0);
        Car car2 = new Car("Mercedes","E-class",3.5);
        Car car3 = new Car("Audi","A4",2.0);
        Car car4 = new Car("Toyota","Camry",2.5);

        Trucks truck1 = new Trucks("Volvo","FH16",12.8);
        Trucks truck2 = new Trucks("Scania","R730",11.8);
        Trucks truck3 = new Trucks("MAN","TGH",12.5);
        Trucks truck4 = new Trucks("Iveco","Stralis",2.8);

        Bus bus1 = new Bus("Volvo","9700",9.4);
        Bus bus2 = new Bus("Mercedes","Strinter",2.4);
        Bus bus3 = new Bus("MAN","Lion's Coach",12.4);
        Bus bus4 = new Bus("Iveco","Crossway",6.4);

        car1.start();
        truck3.start();
        bus2.start();

        car4.stop();
        truck1.stop();
        bus4.stop();


    }
}