public class object1 {
    public static void main(String[] args) {
        int[][] A = { {1,2,3},
                      {4,5,6},
                      {7,8,9} };
        int[][] B = { {8,7,6},
                      {2,3,4},
                      {5,6,7} };
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++) { // changed <= to <
            for (int j = 0; j < 3; j++) { // changed <= to <
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of Matrixes A and B is:");
        for (int i = 0; i < 3; i++) { // changed <= to <
            for (int j = 0; j < 3; j++) { // changed <= to <
                System.out.print(sum[i][j] + " "); // added space for readability
            }
            System.out.println();
        }
    }
}
