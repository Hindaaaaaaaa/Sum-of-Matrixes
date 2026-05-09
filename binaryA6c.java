import java.util.Scanner;

public class binaryA6c {

    public static String BinaryStringFunc(int num) {

        String binary = "";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = BinaryStringFunc(num);
        System.out.println("Binary: " + result);
    }
}
