public class object2 {
    public static void main(String[] args) {
        int[][] A = { {3,4,5},
                      {9,8,7},
                      {2,3,3} };
        int[][] B = { {5,5,5},
                      {3,4,5},
                      {3,3,3} };
        int[][] subtract = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                subtract[i][j]= A[i][j]- B[i][j];
            }
        }
         
        System.out.println("Subtraction of two matrices is :");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(subtract[i][j]+" ");
            }
        
            System.out.println(); }

    }
    
}
