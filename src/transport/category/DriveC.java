package transport.category;

import transport.Driver;

public class DriveC extends Driver {

    public DriveC(String name, boolean hasDriverLicense, int experienceInYear) {
        super(name, hasDriverLicense, experienceInYear);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");
    }
}
