package transport;

import transport.Transport;
import transport.category.DriveB;

public class Car extends Transport <DriveB> {
    private TypeOfBody typeOfBody;


    public Car(String brand, String model, double engineVolume, DriveB driver, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, driver);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printType() {
        if(typeOfBody== null){
            System.out.println("Данных по авто не достаточно");
        } else {
            System.out.println("Тип авто " + typeOfBody);
        }
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
