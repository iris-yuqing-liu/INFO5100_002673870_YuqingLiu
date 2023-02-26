public class Pen {
    private int id;
    private String brand;
    private String color;
    private double tipSize;
    private boolean isBallpoint;
    private boolean isGel;
    private boolean isRetractable;
    private boolean isRefillable;

    public Pen(int id, String brand, String color, double tipSize, boolean isBallpoint, boolean isGel, boolean isRetractable, boolean isRefillable) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.tipSize = tipSize;
        this.isBallpoint = isBallpoint;
        this.isGel = isGel;
        this.isRetractable = isRetractable;
        this.isRefillable = isRefillable;
        System.out.println("Created a new pen with id: " + id);
    }

    public void write() {
        System.out.println("text");
    }

    public void cap() {
        System.out.println("Capping the pen.");
    }

    public void uncap() {
        System.out.println("Uncapping the pen.");
    }
}