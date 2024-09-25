import java.util.function.Predicate;

public class LambdaExample {
    
    public static void main(String[] args) {
        Predicate<Integer> isGPredicateThanThen = (num) -> num > 10;
        int number = 15;
        int newNum = 9;

        if (isGPredicateThanThen.test(number)){
            System.out.println(number + " is greater than 10");
        } else {
            System.out.println(number + " is less than 10");
        }

        if (isGPredicateThanThen.test(newNum)){
            System.out.println(newNum + " is greater than 10");
        } else {
            System.out.println(newNum + " is less than 10");
        }

    }
}
