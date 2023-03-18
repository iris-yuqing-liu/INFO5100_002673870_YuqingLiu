import java.io.*;
public abstract class Shape implements Serializable{
    private static String name; // static field
    private static String color; // static field

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double calculateArea(); // abstraction
    public abstract double calculatePerimeter(); // abstraction
}


