public class Flower {
    private int id;
    private String species;
    private String color;
    private double height;
    private double width;
    private boolean hasFragrance;
    private boolean isEdible;
    private boolean isPerennial;

    public Flower(int id, String species, String color, double height, double width, boolean hasFragrance, boolean isEdible, boolean isPerennial) {
        this.id = id;
        this.species = species;
        this.color = color;
        this.height = height;
        this.width = width;
        this.hasFragrance = hasFragrance;
        this.isEdible = isEdible;
        this.isPerennial = isPerennial;
        System.out.println("Created a new flower with id: " + id);
    }

    public void bloom() {
        System.out.println("Flower is blooming.");
    }

    public void wilt() {
        System.out.println("Flower is wilting.");
    }

    public void attractBees() {
        System.out.println("Flower is attracting bees.");
    }
}