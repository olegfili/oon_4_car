import transport.*;
import transport.category.DriveB;
import transport.category.DriveC;
import transport.category.DriveD;
import transport.Bus;
import transport.Car;
//import transport.Competing;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","Х5",3.0,new DriveB("Катунов Артем Викторович",true,7),TypeOfBody.SEDAN);
        System.out.println(car1);
        Car car2 = new Car("Mercedes","E-class",3.5,new DriveB("Водитель",true,8),TypeOfBody.SEDAN);
        System.out.println(car2);
        Car car3 = new Car("Audi","A4",2.0,new DriveB("Водитель",true,8),TypeOfBody.SEDAN);
        System.out.println(car3);
        Car car4 = new Car("Toyota","Camry",2.5,new DriveB("Водитель",true,8),TypeOfBody.SEDAN);
        System.out.println(car4);

        Trucks truck1 = new Trucks("Volvo","FH16",12.8,new DriveC("Водитель",true,8),Weight.N3);
        System.out.println(truck1);
        Trucks truck2 = new Trucks("Scania","R730",11.8,new DriveC("Водитель",true,8),Weight.N1);
        System.out.println(truck2);
        Trucks truck3 = new Trucks("MAN","TGH",12.5,new DriveC("Водитель",true,8),Weight.N2);
        System.out.println(truck3);
        Trucks truck4 = new Trucks("Iveco","Stralis",2.8,new DriveC("Водитель",true,8),Weight.N1);
        System.out.println(truck4);

        Bus bus1 = new Bus("Volvo","9700",9.4,new DriveD("Водитель",true,8),Capacity.MEDIUM);
        System.out.println(bus1);
        Bus bus2 = new Bus("Mercedes","Strinter",2.4,new DriveD("Водитель",true,8),Capacity.SMALL);
        System.out.println(bus2);
        Bus bus3 = new Bus("MAN","Lion's Coach",12.4,new DriveD("Водитель",true,8),Capacity.LARGE);
        System.out.println(bus3);
        Bus bus4 = new Bus("Iveco","Crossway",6.4,new DriveD("Водитель",true,8),Capacity.EXTRA_LARGE);
        System.out.println(bus4);

        printInfo(car1);
        car1.printType();
        printInfo(bus2);
        bus2.printType();
        printInfo(truck4);
        truck4.printType();



    }

    private static void printInfo(Transport <?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " "+ transport.getModel() + " и будет участовать в заезде");
    }
}
