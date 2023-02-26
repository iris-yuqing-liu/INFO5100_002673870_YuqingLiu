public class Cat {
    private int id;
    private String breed;
    private String color;
    private int age;
    private double weight;
    private boolean isIndoor;
    private boolean isNeutered;
    private boolean isPedigree;

    public Cat(int id, String breed, String color, int age, double weight, boolean isIndoor, boolean isNeutered, boolean isPedigree) {
        this.id = id;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.isIndoor = isIndoor;
        this.isNeutered = isNeutered;
        this.isPedigree = isPedigree;
        System.out.println("Created a new cat with id: " + id);
    }

    public void eat() {
        System.out.println("Cat is eating.");
    }

    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void meow() {
        System.out.println("Cat is meowing.");
    }

}

