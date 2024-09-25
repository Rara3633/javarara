import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

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

    }

}
