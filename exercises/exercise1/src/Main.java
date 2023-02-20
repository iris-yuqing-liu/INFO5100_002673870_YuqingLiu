import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        // add 10 part-time students
        for (int i = 1; i <= 10; i++) {
            PartTime student = new PartTime("PartTime "+i);
            for (int j = 0; j < 15; j++) {
                student.setQuizScores(new double[]{(double) (Math.random() * 100)});
            }
            session.addStudent(student);
        }

        // add 10 full-time students
        for (int i = 11; i <= 20; i++) {
            FullTime student = new FullTime("FullTime "+i, (double)(Math.random() * 100), (double)(Math.random() * 100));
            for (int j = 0; j < 15; j++) {
                student.setQuizScores(new double[]{(double) (Math.random() * 100)});
            }
            session.addStudent(student);
        }

        // print the average quiz score for the class
        System.out.println("Average Quiz Score for the class: " + session.getClassAverageQuizScore());

        // print the list of quiz scores in ascending order for one session
        session.printQuizScores();

        // print names of part-time students
        session.printPartTimeStudentNames();

        // print exam scores of full-time students
        session.printFullTimeStudentExamScores();
    }
}