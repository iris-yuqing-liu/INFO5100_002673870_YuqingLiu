public class Bird {
    private int id;
    private String species;
    private String color;
    private int age;
    private double weight;
    private boolean canFly;
    private boolean isEndangered;
    private boolean isPet;

    public Bird(int id,String eagle, String brown, int i, double v, boolean b, boolean b1, boolean b2) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.canFly = canFly;
        this.isEndangered = isEndangered;
        this.isPet = isPet;
        System.out.println("Created a new bird with id: " + id);
    }

    public void eat() {
        System.out.println("Bird is eating.");
    }

    public void sleep() {
        System.out.println("Bird is sleeping.");
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }

    public static void main(String[] args) {
        Bird bird1 = new Bird(1,"eagle","brown", 5, 3.0,true,true,false);
        Bird bird2 = new Bird(2,"parrot","grey",2, 0.5, true, false, true);
        Bird bird3 = new Bird(3,"penguin","black and white",2,1.5, true,false, false);

    }
}

