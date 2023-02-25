public class Rectangle extends Shape {
    private double leftSide;
    private double rightSide;
    private double topSide;
    private double bottomSide;
    private double height;


    public Rectangle(String color, double leftSide, double rightSide, double topSide, double bottomSide, double height) {
        super("Rectangle", color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.topSide=topSide;
        this.bottomSide=bottomSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double i= this.bottomSide * this.height;
        return i;
    }

    @Override
    public double calculatePerimeter() {
        double j= this.leftSide + this.rightSide + this.topSide+ this.bottomSide;
        return j;
    }
}