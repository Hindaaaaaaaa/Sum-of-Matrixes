public class object5 {
    public static void main(String[] args) {
        int [][] A = { {3,4,5},{1,2,3 },{0,0,0}};
        int [][] T = new int [3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) { 
            T [i][j] = A[j][i];
            
            }
            
        }
System.out.println("Transpose of a matrix is:" );
 for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(T[i][j] +" ");
             }
                System.out.println(); 
            }
 }
}
