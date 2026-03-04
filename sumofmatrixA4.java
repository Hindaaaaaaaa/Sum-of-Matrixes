import java.util.Scanner;

public class sumofmatrixA4 {
    public static void main(String[] args){
        Scanner wow = new Scanner(System.in);
        int n;
        int diagonal=0;
        int revdiagonal=0;

        System.out.println("Enter the size of the matrix ( must be n x n):");
        n = wow.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] sum = new int[n][n];
         
        System.out.println("Enter values of Matrix A':");
        for(int i=0; i<n;i++) {
            for(int j=0; j<n; j++)
            A[i][j]= wow.nextInt();

        }
        
         System.out.println("Enter values of Matrix B:");
        for(int i=0; i<n;i++) {
            for(int j=0; j<n; j++)
            B[i][j]= wow.nextInt();

        }
        for(int i=0; i<n;i++){  
            for(int j=0; j<n; j++)
            sum[i][j]=A[i][j]+B[i][j];
        }

        System.out.println("Sum of Matrixes A and B =");
        for(int i=0; i<n;i++){  
            for(int j=0; j<n; j++)
            System.out.print("  "+sum[i][j]);
        }
         System.out.println();
        
         for(int i=0; i<n; i++){
            diagonal += A[i][i];
            revdiagonal += A[i][n-1-i];
         }

        System.out.println();
         System.out.println("sum of diagonal = " + diagonal);
         System.out.println();
         System.out.println("sum of revdiagonal = " + revdiagonal);
         System.out.println();




    wow.close();

        
        

        }

    }
        

        
        



    
    

