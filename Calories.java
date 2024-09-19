public class Calories {
    public static void main(String[] args) {
        int cal = 1000;
        int incal = 100;
        int dayoffweek = 1; // 1 represents Monday

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
            default:
                dayName = "Invalid Value";
                break;
        }

        System.out.println("Day of the week: " + dayName);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Calories: " + cal);
        }
    }
}
