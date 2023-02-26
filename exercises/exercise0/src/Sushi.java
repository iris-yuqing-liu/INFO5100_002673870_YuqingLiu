public class Sushi {
    private int id;
    private String name;
    private String description;
    private double price;
    private boolean isVegetarian;
    private boolean isGlutenFree;
    private boolean hasRawFish;
    private boolean isSpicy;

    public Sushi(int id, String name, String description, double price, boolean isVegetarian, boolean isGlutenFree, boolean hasRawFish, boolean isSpicy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
        this.hasRawFish = hasRawFish;
        this.isSpicy = isSpicy;
        System.out.println("Created a new sushi with id: " + id);
    }

    public void eat() {
        System.out.println("Sushi is being eaten.");
    }

    public void dipInSoySauce() {
        System.out.println("Sushi is being dipped in soy sauce.");
    }

    public void addWasabi() {
        System.out.println("Wasabi is being added to the sushi.");
    }

}

