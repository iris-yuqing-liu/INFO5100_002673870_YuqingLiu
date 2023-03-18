import java.io.*;

public class Triangle extends Shape implements Serializable {
    private double base;
    private double height;
    private double leftSide;
    private double rightSide;

    public Triangle(String color, double base, double height, double leftSide, double rightSide) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double calculateArea() {
        double i = 0.5 * this.base * this.height;
        return i;
    }

    @Override
    public double calculatePerimeter() {
        double j = this.leftSide + this.rightSide + this.base;
        return j;
    }
}
