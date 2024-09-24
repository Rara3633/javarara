public class OneDimensionArray {

    public static void main(String[] args){
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[3] = 30;
        numbers[4] = 40;
        numbers[5] = 50;

        int[] values = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++){ 
            System.out.println(numbers[i]);

            for (int value: values){ 
                if (value==0){
                    System.out.println(value);
                }
            }
        }
    }
}