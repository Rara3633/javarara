/* import  java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.function.Predicate;

public class StaffAdv {

    public static void main(String[] args) {
        ArrayList<String>staff = new ArrayList();
        Predicate<Integer>iGTT = (bonus) -> bonus > 1000;
        int bonus = 1500;
        int newBonus = 900;

        staff.add("Sabrina");
        staff.add("Syahir");
        staff.add("Anis");
        staff.add("Mai");

        if (iGTT.test(bonus)){
            System.out.println(bonus + "Congratukation Babe :) ");
        } else {
            return;
        }
        
        if (iGTT.test(bonus)){
            System.out.println(newBonus + "Try again next year Babe");
        } else {
            return;
        } 

    }
}

public class DateTimeExample { //
    
    public static void main(String[] args) {
        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String formatteDT = formatter.format(nowT);

        LocalDate birDate = LocalDate.of(1997, 10, 25);
        Period myAge = Period.between(nowD, birDate);

        System.out.println(nowDT);
        System.out.println(nowD);
        System.out.println(nowT);
        System.out.println(formatteDT);
        System.out.println(myAge);

    } */
    import java.util.ArrayList;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;  
    
    public class StaffAdv {
    
        public static void main(String[] args) {
            ArrayList<String> staff = new ArrayList<>();
            staff.add("Sabrina");
            staff.add("Syahirah");
            staff.add("Anis");
            staff.add("Mai");
    
            int[] bonuses = {1500, 900, 1200, 800};
            double[] salaries = {50000, 48000, 52000, 45000}; 
    
            LocalDateTime nowDT = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
            String formattedDT = nowDT.format(formatter);
    
            for (int i = 0; i < staff.size(); i++) {
                String name = staff.get(i);
                int bonus = bonuses[i];
                double salary = salaries[i];
                printBonusMessage(name, bonus, salary, formattedDT);
            }
        }
    
        private static void printBonusMessage(String name, int bonus, double salary, String date) {
            System.out.println("Date: " + date);
            if (bonus > 1000) {
                System.out.println(name);
                System.out.println("Salary: RM " + salary );
                System.out.println("Bonus: " + bonus + " - Congratulations Babe :) ");
                

            } else {
                System.out.println(name);
                System.out.println("Salary: RM " + salary );
                System.out.println("Bonus: " + bonus + " - Try again next year Babe" );
            }
            System.out.println(); 
        } 
    }