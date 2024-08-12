package transport;

public class Car extends Transport <DriveB>{

    public Car(String brand, String model, double engineVolume, DriveB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;
        int theBestTimeMin = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах " + theBestTimeMin);
    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);
    }




}
