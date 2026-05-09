public class object7 {
    public static void main(String[] args) {
        
        int [][] D = { {1,2,9},
                       {4,5,4},
                       {6,10,6} };
        int sumofdiag =0;
        int sumofrevdiag =0;
        int n=3; //n is the size of matrix we could directly use 3 too.
        int bothdiag =0;

         for (int i=0;i<n;i++){ //if we use 3 directly then this program will be limited only for 3x3 matrix.
           
                sumofdiag += D[i][i]; 
                sumofrevdiag += D[i][n-1-i];// n is size of matrix -1 - index.
            
         }
bothdiag += sumofdiag+sumofrevdiag;
         System.out.println("sum of top left to right bottom (main diagonal) is : "+sumofdiag);
         System.out.println("sum of top right to left bottom (reverse diagnoal) is : "+sumofrevdiag);
         System.out.println("sum of both diagonals is : " +bothdiag);
    }
}
    

