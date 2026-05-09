
import java.util.Scanner;
public class object11 {
static double resultfunc(double a, double b){
    
    return (a/b)*100;
}
static void grade(double result){
    if(result<100){ //yeh if isliye add kiya ha taky 100 se zayda pe invalid de saky.
    
    if(result >=90){
        System.out.println("YOUR GRADE IS A+");
    }else if(result >=75){
        System.out.println("YOUR GRADE IS A");
    } else if(result >=65){
        System.out.println("YOUR GRADE IS B");
    }else if (result >=55){
        System.out.println("YOUR GRADE IS C");
    }else if(result >=45){System.out.println("YOUR GRADE IS D");}
    else if(result >=35){System.out.println("YOUR GRADE IS E");
}else
        
     { System.out.println("YOU FAILED THE EXAM");
}
    }else{System.out.println("NO GRADE FOR INVALID INPUT");}

}
 public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        double totalmarks=100.00;
        System.out.print("Enter obtained marks (Should be less than or equal to total marks i.e 100) : ");
        double obtmarks= sc.nextDouble();
        if(obtmarks>totalmarks){System.out.println("invalid input");}else

     // System.out.println("Enter total marks");
        //double totalmarks=sc.nextDouble();

        System.out.println("Your Result is   "+resultfunc(obtmarks,totalmarks)+"%");

        double result;
         result=resultfunc(obtmarks,totalmarks);

        //System.out.println(grade(result));
grade(result);
 }
    
}
