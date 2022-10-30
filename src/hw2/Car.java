package hw2;

public class Car {
    private String carBrand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

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
        return "Car brand= " + carBrand +
                ". Model= " + model +
                ". engineVolume= " + engineVolume +
                ". Color= " + color+
                ". productionYear= "+ productionYear+
                ". productionCountry= " + productionCountry+".";

    }
}
