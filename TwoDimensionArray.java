public class TwoDimensionArray { //come out in oracle exam

    public static void main(String[] args){
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
        matrix[0][4] = 5; matrix[0][5] = 6; matrix[0][6] = 7; matrix[0][7] = 8;
    

        int[][] matrix2 = {
            (1,2,3,4), 
            (5,6,7,8),
            (9,10,11,12)
        }
           
        

// there are two tipe

        //method number one
        for (int row=0; row<matrix.length; row++){ // to brakdown the number become (1,2,3,4,5)
            for (int col=0; col<matrix[row].length; col++){ //after the matrix change to the row that have been needed
                System.out.printIn(matrix[row][col]);

            }
        }

//------------------------------- separete function ------------------------------------//

        //method number two
        for (int[] number: numbers){
            for (int value: number){
                System.out.printIn(value);
            }
        }
        
    }
//  for (int i = 0; i < 2; i++) {
  //  for (int j = 0; j < 4; j++) {
    //    System.out.println(vehicle[i][j] + ": " + fuel[i][j] + " mpg");
}