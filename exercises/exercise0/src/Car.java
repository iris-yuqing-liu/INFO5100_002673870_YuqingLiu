public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isElectric;
    private boolean isLuxury;

    public Car(int id, String brand, String model, int year, double price, boolean isElectric, boolean isLuxury) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isElectric = isElectric;
        this.isLuxury = isLuxury;
        System.out.println("Created a new car with id: " + id);
    }

    public void start() {
        System.out.println("Car is starting.");
    }

    public void stop() {
        System.out.println("Car is stopping.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

}
