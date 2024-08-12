package transport;

public class DriveD extends Driver{
    public DriveD(String name, boolean hasDriverLicense, int experienceInYear) {
        super(name, hasDriverLicense, experienceInYear);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто");
    }
}
