import java.util.Scanner;

public class binaryA6b {

    public static int[] BinaryArrayFunc(int num) {

        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        int[] bits = new int[count];

        int index = count - 1;
        while (num > 0) {
            bits[index] = num % 2;
            num = num / 2;
            index--;
        }

        return bits;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] result = BinaryArrayFunc(num);

        System.out.print("Binary: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
    

