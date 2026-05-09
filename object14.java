//import java.util.Scanner;
public class object14 {
    static void prime(int n){
if(n>1){ 


boolean isprime= true;
  for(int i=2;i<n;i++){
    if(n % i == 0){
        isprime=false; 
    }
}
if(isprime){
    System.out.println(n+" is a prime number");
}else{System.out.println(n+" is not a prime number");}

    } else System.out.println("0 ,1 and numbers smaller than 0 cant be considered as prime numbers.");
}

  public static void main(String[] args){
   // Scanner sc =new Scanner (System.in);
   // System.out.print("Enter a number");
    //int number= sc.nextInt();
    int number=17;
    prime(number);
  }
  
 }
    

