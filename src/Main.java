import transport.*;
//import transport.Competing;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","Х5",3.0,new DriveB("Катунов Артем Викторович",true,7));
        System.out.println(car1);
        Car car2 = new Car("Mercedes","E-class",3.5,new DriveB("Водитель",true,8));
        System.out.println(car2);
        Car car3 = new Car("Audi","A4",2.0,new DriveB("Водитель",true,8));
        System.out.println(car3);
        Car car4 = new Car("Toyota","Camry",2.5,new DriveB("Водитель",true,8));
        System.out.println(car4);

        Trucks truck1 = new Trucks("Volvo","FH16",12.8,new DriveC("Водитель",true,8));
        System.out.println(truck1);
        Trucks truck2 = new Trucks("Scania","R730",11.8,new DriveC("Водитель",true,8));
        System.out.println(truck2);
        Trucks truck3 = new Trucks("MAN","TGH",12.5,new DriveC("Водитель",true,8));
        System.out.println(truck3);
        Trucks truck4 = new Trucks("Iveco","Stralis",2.8,new DriveC("Водитель",true,8));
        System.out.println(truck4);

        Bus bus1 = new Bus("Volvo","9700",9.4,new DriveD("Водитель",true,8));
        System.out.println(bus1);
        Bus bus2 = new Bus("Mercedes","Strinter",2.4,new DriveD("Водитель",true,8));
        System.out.println(bus2);
        Bus bus3 = new Bus("MAN","Lion's Coach",12.4,new DriveD("Водитель",true,8));
        System.out.println(bus3);
        Bus bus4 = new Bus("Iveco","Crossway",6.4,new DriveD("Водитель",true,8));
        System.out.println(bus4);

        printInfo(car1);
        printInfo(bus2);
        printInfo(truck4);


    }

    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участовать в заезде");
    }
}
