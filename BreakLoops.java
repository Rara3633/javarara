public class BreakLoops { // for example to access the website using pasworrd etc

    public static void main(String[] args){
        System.out.println("using break");

        for (int i=1; i<=5; i++){
            if (i==3){
                break;
            }
        }
    }
}