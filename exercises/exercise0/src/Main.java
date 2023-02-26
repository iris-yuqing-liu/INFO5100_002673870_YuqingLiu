public class Main {
    public static void main(String[] args) {

        Church church1 = new Church(1, "St. Patrick's Cathedral", "Catholic", "New York City", 2200, true, true, true);
        Church church2 = new Church(2, "Westminster Abbey", "Anglican", "London", 2000, true, true, true);
        Church church3 = new Church(3, "Sagrada Familia", "Catholic", "Barcelona", 8000, false, false, true);

        Debt debt1 = new Debt(1, "Bank A", "John Smith", 5000.0, 0.1, false, "2022-01-01", "2022-06-30");
        Debt debt2 = new Debt(2, "Credit Card B", "Jane Doe", 2000.0, 0.15, false, "2021-12-01", "2022-12-01");
        Debt debt3 = new Debt(3, "Loan C", "Bob Johnson", 10000.0, 0.08, false, "2021-05-01", "2023-05-01");

        Bird bird1 = new Bird(1,"eagle","brown", 5, 3.0,true,true,false);
        Bird bird2 = new Bird(2,"parrot","grey",2, 0.5, true, false, true);
        Bird bird3 = new Bird(3,"penguin","black and white",2,1.5, true,false, false);

        Flower flower1 = new Flower(1, "Rose", "Red", 10.0, 5.0, true, false, true);
        Flower flower2 = new Flower(2, "Lily", "White", 12.0, 6.0, true, true, false);
        Flower flower3 = new Flower(3, "Sunflower", "Yellow", 15.0, 8.0, false, false, true);

        Ring ring1 = new Ring(1, "gold", "yellow", 7.5, true, false, false, false);
        Ring ring2 = new Ring(2, "platinum", "white", 6.5, false, true, false, true);
        Ring ring3 = new Ring(3, "silver", "silver", 8.0, false, false, true, false);

        Sushi sushi1 = new Sushi(1, "California Roll", "Crab, cucumber, avocado", 8.99, false, true, false, false);
        Sushi sushi2 = new Sushi(2, "Spicy Tuna Roll", "Tuna, spicy mayo", 10.99, false, true, true, true);
        Sushi sushi3 = new Sushi(3, "Vegetable Roll", "Cucumber, avocado, carrot", 6.99, true, true, false, false);

        Dog dog1 = new Dog(1, "Golden Retriever", "golden", 3, 70.5, true, true, false);
        Dog dog2 = new Dog(2, "Poodle", "white", 5, 12.3, true, true, true);
        Dog dog3 = new Dog(3, "German Shepherd", "black and tan", 2, 45.7, false, true, false);

        Cat cat1 = new Cat(1, "Persian", "white", 3, 2.5, true, true, true);
        Cat cat2 = new Cat(2, "Siamese", "brown", 2, 1.0, false, false, false);
        Cat cat3 = new Cat(3, "British Shorthair", "grey", 4, 3.0, true, false, true);

        Pen pen1 = new Pen(1, "Pilot", "blue", 0.7, true, false, true, true);
        Pen pen2 = new Pen(2, "Papermate", "black", 1.0, true, true, true, false);
        Pen pen3 = new Pen(3, "Uni-ball", "red", 0.5, false, true, false, true);

        Car car1 = new Car(1, "Ford", "Camry", 2022, 24999.99, false, false);
        Car car2 = new Car(2, "Tesla", "Model S", 2023, 79999.99, true, true);
        Car car3 = new Car(3, "Audi", "S-Class", 2021, 109999.99, false, true);
    }
}