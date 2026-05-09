public class MagicSquareA5 {
    public static void main (String[] args){
        int[][] ms= { {8,1,6},
                      {3,5,7},        
                      {4,9,2} };
        int sumc = 0;    
        int i=0;
        int j=0;
                  
        
       
       for ( j = 0; j < 3; j++){
        for ( i = 0; i < 1; i++)
        sumc += ms[j][i];
       }   
       System.out.println("Sum of Column = " + sumc);

       int sumr = 0;
       
       for( i = 0; i < 3; i++){
        for( j = 0; j < 1; j++)
        sumr += ms[i][j];
       }               
       System.out.println("Sum of rows = " + sumr);

       int sumd = 0;
       
       for( i = 0; i < 3; i++)
        sumd += ms[i][i];  
        System.out.println("Sum of diagonal = " + sumd);
                    

       if (sumc==15 && sumr==15 && sumd==15) {
        System.out.println("wowww!! Its a Magic Square");
    
       }else { System.out.println("oops!!  Its not a Magic Square");

       }




    }
    
}
