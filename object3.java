public class object3 {
    public static void main(String[] args){
        int [][] arr1=  { {4,5,6},{5,8,9},{1,2,3}};

        int [][] arr2= { {3,4,4},{2,2,2},{2,1,1} };
        
        int [][] product= new int [3][3];
        

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                product [i][j]=0;
                for(int k=0;k<3;k++){

                
                product [i][j] += arr1[i][k]*arr2[k][j]; 
            }
            }
        }
        System.out.println("The Product of two matrices is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(product [i][j]+" ");
            }
            System.out.println();
        }



                        
    }
    
}
