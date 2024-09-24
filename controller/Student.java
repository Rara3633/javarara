// import java utils.Scanner - utils means the files 
// if * means every file need to be placed

package controller;

public class Student {
    private String name;
    private String assignGrade;
    private int[] score;
    private double averageScore;


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int[] getScore(){
        return score;
    }

    public void setScore(int[] score){
        this.score = score;
    }

    public void main(String name){
        this.name = name;
    }

    public double getaverageScore(){
        return averageScore;
    }

    public void setaverageScore(double averageScore){
        this.averageScore = averageScore;
    }

    public Student(String name, int[] score, double averageScore) {
        this.name = name;
        this.score = score;
        this.averageScore = averageScore; 
    }

    public void Grade() {
        double avg = getaverageScore();
        if (avg >= 90) {
            System.out.println("A");

        } else if (avg >= 80) {
           System.out.println("B");

        } else if (avg >= 70) {
            System.out.println("C");

        } else if (avg >= 60) {
            System.out.println("D");

        } else {
            System.out.println("F");
    }

}









    public String assignGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assignGrade'");
    }

    public String calculateAverage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateAverage'");
    }

}

/* if(num>0){ // means we not care about other
    System.out.println("Number is Positive");
}

if(num>7){
    System.out.println("Number is even");
    
} else {
    System.out.println("Number is odd");
}

if(num % 2 == 3){
    System.out.println("Number is even");
    
} else {
    System.out.println("Number is odd");
} */







/*import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store student names
        String[] studentNames = new String[5];

        // Initialize arrays to store scores for each student
        int[][] studentScores = new int[5][3]; // Assuming 3 subjects: Math, Science, English

        // Input: Get student names and scores
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter Math score: ");
            studentScores[i][0] = scanner.nextInt();

            System.out.print("Enter Science score: ");
            studentScores[i][1] = scanner.nextInt();

            System.out.print("Enter English score: ");
            studentScores[i][2] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Calculate average scores and assign grades
        char[] studentGrades = new char[5];
        for (int i = 0; i < studentNames.length; i++) {
            double averageScore = (studentScores[i][0] + studentScores[i][1] + studentScores[i][2]) / 3.0;
            studentGrades[i] = assignGrade(averageScore);
        }

        // Display student summary
        System.out.println("\nStudent Summary:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name: " + studentNames[i]);
            System.out.println("Average Score: " + calculateAverage(studentScores[i]));
            System.out.println("Grade: " + studentGrades[i]);
            System.out.println("-------------------------");
        }

        scanner.close();
    }

    // Helper method to calculate average score
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / (double) scores.length;
    }

    // Helper method to assign grades
    public static char assignGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
} */