public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double i= Math.pow(this.side, 2);
        return i;
    }

    @Override
    public double calculatePerimeter() {
        double j= this.side*4;
        return j;
    }
}