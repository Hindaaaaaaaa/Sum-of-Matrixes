//import java.util.Scanner;
public class object15 {
    static String[] hammingcods(String[] a){ 
        int n=a.length;
        a[0]="h1";
        a[1]="h2";
        int h=3;
        int pos=4;
while(pos<=n){ a[pos-1]="h"+h;
pos=pos*2;
h++;}
return  a;

 }
 public static void main(String[] args){
   // Scanner sc=new Scanner (System.in);
    //int n=sc.nextInt();

    String[] arr = new String[40];
    for(int i=0;i<40;i++){
        arr[i]="d";
    }
    hammingcods(arr);
    for(int i=0;i<40;i++){
        System.out.print(arr[i]+" ");
    }
 }
    
}
