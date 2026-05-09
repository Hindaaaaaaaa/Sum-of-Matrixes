import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class productwise {
    public static void main(String[] args) {
        String[] arr = new String[5];
        String[] products = {"A", "B", "C", "D"};  
        double[] totals = {0, 0, 0, 0};              

        try {
            File f1 = new File("C:\\Users\\hajra\\uni programs\\SalesEVESession.txt");
            Scanner sc = new Scanner(f1);
            String data = sc.nextLine();

            while (sc.hasNextLine()) {               
                data = sc.nextLine();
                arr = data.split("\t");
                double u = Double.parseDouble(arr[2]);
                double q = Double.parseDouble(arr[3]);
                double revenue = u * q;

                for (int i = 0; i < products.length; i++) {  
                    if (arr[0].equals(products[i])) {
                        totals[i] += revenue;
                    }
                }
            }
            for (int i = 0; i < products.length; i++) {      
                System.out.println(products[i] + "\tRevenue\t" + totals[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}