import java.util.Scanner;
public class object13 {
    static int fact(int n){
       // int i,n;
    int ans=1;
    
        for( int i=n;i>0;i--){ 
        ans= ans*i;}
         return ans;
    }
    public static void main(String[] args){

Scanner sc=new Scanner (System.in);
    System.out.println("Enter A number : ");
    int number = sc.nextInt();
   // int number=5;
    if(number<0){System.out.println("invalid input");
}else
    System.out.println("Factorial of a given number is : "+fact(number) );
    
   
}
    
}
