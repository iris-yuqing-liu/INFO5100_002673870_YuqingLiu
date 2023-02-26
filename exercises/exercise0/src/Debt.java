public class Debt {
    private int id;
    private String creditorName;
    private String debtorName;
    private double amount;
    private double interestRate;
    private boolean isPaid;
    private String startDate;
    private String endDate;

    public Debt(int id, String creditorName, String debtorName, double amount, double interestRate, boolean isPaid, String startDate, String endDate) {
        this.id = id;
        this.creditorName = creditorName;
        this.debtorName = debtorName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = isPaid;
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println("Created a new debt with id: " + id);
    }

    public void pay() {
        System.out.println("Debt is paid.");
    }

    public void calculateInterest() {
        System.out.println("Interest to be paid.");
    }

    public void borrow() {
        System.out.println("borrow");
    }
}