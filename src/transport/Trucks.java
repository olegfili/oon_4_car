package transport;

public class Trucks extends Transport <DriveC>{

    public Trucks(String brand, String model, double engineVolume, DriveC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 140;
        int theBestTimeMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + theBestTimeMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);
    }

}
