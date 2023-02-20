import java.util.Collections;
import java.util.ArrayList;
public class Session {
    private ArrayList<Student> students;
    public Session(){
        this.students=new ArrayList<Student>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public double getClassAverageQuizScore() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            sum += student.getAverageQuizScore();
            count++;
        }
        return (double)sum / count;
    }
    //Print Quiz Scores in Ascending Order
    public void printQuizScores(){
        ArrayList<Double> averageScores=new ArrayList<>();
        for(Student student: students){
            averageScores.add(student.getAverageQuizScore());
        }
        Collections.sort(averageScores);
        System.out.println("Quiz Scores in Ascending Order"+ averageScores);
    }
    public void printPartTimeStudentNames() {
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.println("Names of Part Time Student: " + student.name);
            }
        }
    }
    public void printFullTimeStudentExamScores(){
        for (Student student : students) {
            if (student instanceof FullTime) {
                System.out.println(((FullTime) student).getName() + ": Exam1=" + ((FullTime) student).getExam1Score() + ", Exam2=" + ((FullTime) student).getExam2Score());
            }
        }
    }
}