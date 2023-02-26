public class Ring {
    private int id;
    private String material;
    private String color;
    private double size;
    private boolean isEngagementRing;
    private boolean isWeddingRing;
    private boolean isPromiseRing;
    private boolean isCustomMade;

    public Ring(int id, String material, String color, double size, boolean isEngagementRing, boolean isWeddingRing, boolean isPromiseRing, boolean isCustomMade) {
        this.id = id;
        this.material = material;
        this.color = color;
        this.size = size;
        this.isEngagementRing = isEngagementRing;
        this.isWeddingRing = isWeddingRing;
        this.isPromiseRing = isPromiseRing;
        this.isCustomMade = isCustomMade;
        System.out.println("Created a new ring with id: " + id);
    }

    public void resize() {
        System.out.println("Resizing the ring to size ");
    }

    public void polish() {
        System.out.println("Polishing the ring.");
    }

    public void engrave() {
        System.out.println("Engraving message. ");
    }

}