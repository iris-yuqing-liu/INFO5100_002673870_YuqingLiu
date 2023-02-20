public class FullTime extends Student {
    double exam1Score;
    double exam2Score;

    public FullTime(String name,double exam1Score, double exam2Score) {
        super(name);
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }
    public double getExam1Score() {
        return exam1Score;
    }

    public double getExam2Score() {
        return exam2Score;
    }

}
