public class StudentManagementSystem {
    
    private String name;
    private String grade;
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

    public StudentManagementSystem(String name, int[] score, double averageScore) {
        this.name = name;
        this.score = score;
        this.averageScore = averageScore; 
    }

   /* public String Grade(){
        double avg = averageScore();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
    } */ 

}
    
/* System.out.println("\nStudent Summary:");
for (Student student : students) {
    System.out.println("Name: " + student.getName());
    System.out.println("Average Score: " + student.calculateAverage());
    System.out.println("Grade: " + student.assignGrade());
    System.out.println("-------------------------");
} */



    /* private String name;
    private int score;
    private double averageScore;

    public StudentManagementSystem(String n, int s, int a)
    {
        name = n;
        score = s;
        averageScore = a;
    }


} */


 /* public class Student {
    private String name;
    private int[] scores;
    private double averageScore;

    public Student(String name, int[] scores, double averageScore) {
        this.name = name;
        this.scores = scores;
        this.averageScore = averageScore; // Calculate average upon creation
    }
    
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public double getAverageScore(){
        return averageScore;
    }

} */

// Method to assign grade based on average score
/* public String assignGrade() {
    double avg = averageScore();
    if (avg >= 90) {
        return "A";
    } else if (avg >= 80) {
        return "B";
    } else if (avg >= 70) {
        return "C";
    } else if (avg >= 60) {
        return "D";
    } else {
        return "F";
    } */

