
    
public class object12 {
   static void som( int [][] A , int [][] B){
        int i,j;
       // A [i][j];
       // B [i][j];
       // int n= A.length();
        int [][] add=new int[3][3];
        for( i=0;i<3;i++)
            for( j=0;j<3;j++){  
        
        add [i][j]= A[i][j]+B[i][j];
    }
    System.out.println("sum of matrices is : ");
    for( i=0;i<3;i++){
            for( j=0;j<3;j++){ 
        
        System.out.print(add[i][j]+"   ");}
       System.out.println();
    } 
        //System.out.println();
}
    

public static void main(String[] args){
int [][] a= {{1,2,3},{3,4,5},{5,5,6}};
int [][] b= {{2,1,2},{4,5,7},{9,9,9}};
som(a,b);
}
}


