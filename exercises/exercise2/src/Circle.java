public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double i = Math.pow(this.radius, 2) * Math.PI; //Math.PI=3.141592653589793
        return i;
    }

    @Override
    public double calculatePerimeter() {
        double j= 2 * this.radius * Math.PI;
        return j;
    }
}