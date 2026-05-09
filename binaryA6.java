import java.util.Scanner;

public class binaryA6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            num = num / 2;
            binary = binary + (remainder * place);
            place = place * 10;
        }

        System.out.println("Binary: " + binary);
    }
}
