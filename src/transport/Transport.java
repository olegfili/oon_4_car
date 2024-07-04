package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport (String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel () {
        return model;
    }
    public void setModel (String model){
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume () {
        return engineVolume;
    }
    public void setEngineVolume (double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void start (){
        System.out.println("Начать движение");
    }
    public void stop(){
        System.out.println("Закончить движение");
    }

}
