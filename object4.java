public class object4 {
    public static void main(String [] args){
        int total=0;
        int [][] z = { {2,5,2},{6,3,3},{9,1,1}  };

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

            
            total+= z[i][j];
            }

        }
        System.out.println("Sum of all element is :"+total);
    }
    
}
