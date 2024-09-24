public class Finally {
    
    public static void main(String[] args) {
        try{
            int [] numbers = {1,2,3}; // set array in 3
            System.out.println(numbers[5]); // 5 means alot than 3
        } catch (ArrayIndexOutOfBoundsException e){ // if the array not match with the array
            System.out.println("Caught bad" + e.getMessage());
        } finally {
            System.out.println("It will excuted anywhere");
        }
        
        System.out.println("Program is countinue");

        }
}
