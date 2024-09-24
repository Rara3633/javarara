public class StudentScore {
    
    public static int length;
    private String name;
    private int scores [] = {0,0,0};
    private double averageScore;

    // Constructor
    public StudentScore(String name, int[] scores){
        this.name = name;
        this.scores =scores;
        this.averageScore = calculateAverage ();
    }

    public String getName(){
        return name;
    }

    public int[] getScores(){
        return scores;
    }

    public double calculateAverage(){
        int sum = 0;

        for (int score : scores){
           // total = total + scores; 
           sum += score;
        }

        return sum/ (double) scores.length;
    }

    //Method to assign grade 
    public String assignGrade(){
        String grade = "";
        if (averageScore >= 90){
            grade = "A";
        }

        else if (averageScore >= 80) {
            return "B";
        }

        else if (averageScore >= 70){
            return "C";
        }

        else if (averageScore >= 60){
            return "D";
        }

        else {
            return "F";
        }
        return grade;

    }

       //Getter for averageScore
    public double getAverageScore(){
        return averageScore;
    }

}
