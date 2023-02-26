public class Dog {
    private int id;
    private String breed;
    private String color;
    private int age;
    private double weight;
    private boolean isTrained;
    private boolean isFriendly;
    private boolean isHypoallergenic;

    public Dog(int id, String breed, String color, int age, double weight, boolean isTrained, boolean isFriendly, boolean isHypoallergenic) {
        this.id = id;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.isTrained = isTrained;
        this.isFriendly = isFriendly;
        this.isHypoallergenic = isHypoallergenic;
        System.out.println("Created a new dog with id: " + id);
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }

}