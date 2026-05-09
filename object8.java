public class object8 {
    public static void main(String [] args){
        int [][] H = { {2,7,6},
                       {9,5,1},
                       {4,3,8} };
        int i,j;
        // to prove its a magic square we need to add rows columnsad diagonal.
        // first we are adding rows.
int sumr1=0;
        for(i=0;i<3;i++){ 
            for(j=0;j<1;j++){
sumr1 += H[i][j];
            }
          }  System.out.println("sumr1 : " +sumr1);

        int sumr2 = 0;
        for(i=0;i<3;i++){
            for(j=1;j<2;j++){ 
            sumr2 += H[i][j]; }
            
        }
        System.out.println("sumr2 : " +sumr2);

        int sumr3=0;
        for(i=0;i<3;i++){
            for(j=2;j<3;j++)
            sumr3 += H[i][j];
        }
        System.out.println("sumr3 : "+sumr3); 
        int sumc1=0,sumc2=0,sumc3=0;

        for (j=0;j<3;j++){
            for(i=0;i<1;i++)
            sumc1 += H[j][i];
}
System.out.println("sumc1 : "+sumc1);
            
  for (j=0;j<3;j++){
            for(i=1;i<2;i++)
            sumc2 += H[j][i];
}
System.out.println("sumc2 : "+sumc2);
            
  for (j=0;j<3;j++){
            for(i=2;i<3;i++)
            sumc3 += H[j][i];
}
System.out.println("sumc3 : "+sumc3);

int sumd1=0,sumd2=0;

for(i=0;i<3;i++)
sumd1 += H[i][i];
System.out.println("sumd1 : "+sumd1);
            
int n=3;
for(i=0;i<3;i++)
sumd2 += H[i][n-1-i];
System.out.println("sumd2 : "+sumd2);
            
        


if(sumr1 == sumr2 && sumr1 == sumr3 && sumr1 == sumc1 && 
sumr1 == sumc2 && sumr1 == sumc3 && sumr1 == 
sumd1 && sumr1 == sumd2){ 
System.out.println("ITS A MAGIC SQUARE!!!");}else{ 
System.out.println("its not a magic square.");}

    }
}
