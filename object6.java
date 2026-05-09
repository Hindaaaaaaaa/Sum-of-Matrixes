public class object6 {
    public static void main(String[] args) {
        // we re doing sums first
        int [][] X = { {1,2,3},{3,4,5},{7,6,0} };
        int [][] Y = { {1,2,1},{3,3,3},{6,5,7} };
        int [][] Z = new int [3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Z [i][j]= X[i][j]+Y[i][j];
            }
            
        }
        System.out.println("The sum of Matrices X and Y is :");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(Z[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

     //we re doing subtraction now.

 int [][] D = { {2,3,4},{4,5,6},{8,9,0}};
 int [][] E = { {3,4,2},{7,7,7},{8,8,8}};
 int [][] F = new int[3][3];

 for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        F[i][j]=D[i][j]-E[i][j];
    }
 }
  System.out.println("The Subtraction of Matrices D and E :");
  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.print(F[i][j]+" ");
    }
        System.out.println(); 
    }
    System.out.println();

    //we re doing Multiplication now.

    int [][] A = { {2,2,2},{1,2,3},{3,4,5} };
    int [][] B = { {3,3,3},{4,5,6},{7,8,9} };
    int [][] multipli = new int [3][3];

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            multipli[i][j]=0;
            for(int k=0;k<3;k++){
                multipli[i][j] += A[i][k]*B[k][j];
            }
        }
    }
System.out.println("Multiplication (dot product) of Matrices A and B is:");
for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(multipli[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    // we re doing tranpose now.
int [][] G = { {1,1,1},{2,2,2,},{3,3,3} };
int [][] trans = new int [3][3];

for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        trans[i][j] = G[j][i];
    }

}
System.out.println("Transpose of a Matrix G is :");
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        System.out.print(trans[i][j]+" ");
    }
    System.out.println();
}

        
    }
}
    

