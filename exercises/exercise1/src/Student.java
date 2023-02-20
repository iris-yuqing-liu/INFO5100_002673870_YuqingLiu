import java.util.ArrayList;

public class Student {
    String name;
    double[] quizScores;
    public Student(String name){
        this.name=name;
        this.quizScores=new double[15];
    }
    public String getName() {
        return name;
    }

    public void setQuizScores(double[] quizScores) {
        this.quizScores = quizScores;
    }
    public double[] getQuizScores() {
        return quizScores;
    }
    public double getAverageQuizScore() {
        double sum = 0.0;
        for (double score : quizScores) {
            sum += score;
        }
        return sum / quizScores.length;
    }
}
