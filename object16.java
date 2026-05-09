import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class object16 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\Users\\hajra\\uni programs\\sales.txt");
            Scanner sc = new Scanner(f1);

            String line = sc.nextLine();
            System.out.println(line); // print header

            while (line.trim().length() > 0) {
                line = sc.nextLine();
                System.out.println(line);

                String[] parts = line.split(" ");

                

                double price    = Double.parseDouble(parts[1]);
                double qty      = Double.parseDouble(parts[2]);
                double revenue  = price * qty;

                System.out.println("Revenue: " + revenue);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path.");
        }
    }
}