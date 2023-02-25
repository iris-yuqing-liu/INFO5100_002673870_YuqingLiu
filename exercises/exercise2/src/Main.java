public class Main {
    public static void main(String[] args) {
        //Create a triangle with purple, base 2, height 3, leftSide 4, rightSide 5
        Shape triangle = new Triangle("purple", 2, 3, 4, 5);
        System.out.println("Name: " + triangle.getName());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());

        // Create a rectangle with a length of 6 and width of 4
        //Create a rectangle with black, leftSide 2, rightSide 3, topSide 4, bottomSide 5, height 6
        Shape rectangle = new Rectangle("black", 2, 3, 4, 5, 6);
        System.out.println("Name: " + rectangle.getName());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Create a circle with radius 2
        Shape circle = new Circle("pink", 2);
        System.out.println("Name: " + circle.getName());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a square with side 2
        Shape square = new Square("cherry", 2);
        System.out.println("Name: " + square.getName());
        System.out.println("Color: " + square.getColor());
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}