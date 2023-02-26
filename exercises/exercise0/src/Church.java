public class Church {
    private int id;
    private String name;
    private String denomination;
    private String location;
    private int capacity;
    private boolean hasBells;
    private boolean hasChoir;
    private boolean isHistoric;

    public Church(int id, String name, String denomination, String location, int capacity, boolean hasBells, boolean hasChoir, boolean isHistoric) {
        this.id = id;
        this.name = name;
        this.denomination = denomination;
        this.location = location;
        this.capacity = capacity;
        this.hasBells = hasBells;
        this.hasChoir = hasChoir;
        this.isHistoric = isHistoric;
        System.out.println("Created a new church with id: " + id);
    }

    public void pray() {

        System.out.println("Prayer is being held in the church.");
    }

    public void sing() {

        System.out.println("Hymns are being sung in the church.");
    }

    public void baptize() {

        System.out.println("Baptism is being conducted in the church.");
    }

    public class Priest {
        private String title;
        private int yearsOfExperience;

        public Priest(String title, int yearsOfExperience) {
            this.title = title;
            this.yearsOfExperience = yearsOfExperience;
        }
    }
    public static class ChurchBuilder {
            private String denomination;
            private String location;

            public ChurchBuilder(String denomination, String location) {
                this.denomination = denomination;
                this.location = location;
            }


        }
    }
