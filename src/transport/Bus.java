package transport;

public class Bus extends Transport < DriveD>{
    public Bus(String brand, String model, double engineVolume, DriveD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах " + theBestTimeMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }
}
