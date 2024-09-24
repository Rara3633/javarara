import java.util.Scanner;

public class StudentScoreSystem {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentScore[] students = new StudentScore[5]; // Array to hold 5 students
    

    //Loop to populate the array of students
    for (int i = 0; i < StudentScore.length; i++) {
        System.out.println("Enter student name " + (i + 1) + ":");

        String name = scanner.nextLine();
        }

        System.out.println("Enter scores for Math, Science and English :");
        String[] scoreInputs = scanner.nextLine().split("null");
        int[] scores = new int [3];

        for (int j = 0; j < scores.length; j++);

        student[i] = new student(name, scores); // create a new student and add to array
    }


}
