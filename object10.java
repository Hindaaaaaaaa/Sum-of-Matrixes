public class object10 {
    
    static double avg(int a,int b,int c){
        return (a+b+c)/3 ; // one function returns one value.
        
    }

    static double add(int a,int b,int c){
double  sum=a+b+c;
return sum; // to print sum we made another program for it.


    }
    public static void main(String[] args){  

    int x=5,y=4,z=2;
    double result=avg(x,y,z); 
    double result2=add(x,y,x);
    System.out.println("Avg Of 3 numbers is : "+result);
System.out.println("sum of three numbers id :"+result2);
    
}
}
    

