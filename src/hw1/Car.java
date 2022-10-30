package hw1;

public class Car {
    private String carBrand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public String getBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Car(String carBrand, String model, double engineVolume, String color, int productionYear,String productionCountry){
        this.carBrand=carBrand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.productionYear=productionYear;
        this.productionCountry=productionCountry;
    }
    public Car(){
    }
    public String toString() {
        return "carBrand " + carBrand +
                ". Model= " + model +
                ". engineVolume= " + engineVolume +
                ". Color= " + color+
                ". productionYear= "+ productionYear+
                ". productionCountry= " + productionCountry+".";

    }
}
