package homework.seminar_6;

public class Laptop {
    private String brand; // бренд
    private String model; // модель
    private String OS; // оепрационная система
    private int ram; // память
    private int hdSize; // размер жесткого диска
    public Laptop(String brand, String model, String OS, int ram, int hdSize) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.ram = ram;
        this.hdSize = hdSize;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getOS() {
        return OS;
    }
    public int getRam() {
        return ram;
    }
    public int getHdSize() {
        return hdSize;
    }
}