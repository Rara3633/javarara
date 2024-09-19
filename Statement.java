public class Statement {

    public static void main(String[] args){
        int num = 5;

        if(num>0){
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
        }
    }
}