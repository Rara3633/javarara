public class Switch{ // condition - are formal use

    public static void main(String[] args){
int dayoffweek = 3;
String dayName;

switch (dayoffweek) {
    case 1:
    dayName = "Monday";
    break;

    case 2:
    dayName = "Tuesday";
    break;

    case 3:
    dayName = "Wednesday";
    break;
    
    case 4:
    dayName = "Thursday";
    break;

    case 5:
    dayName = "Friday";
    break;

    case 6:
    dayName = "Saturday";
    break;
    
    case 7:
    dayName = "Sunday";
    break;
}

    System.out.println(dayName);   

    }
}