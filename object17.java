import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class object17 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\Users\\hajra\\uni programs\\countries.txt");
            Scanner sc = new Scanner(f1);

            String line = sc.nextLine();
            System.out.println(line); // print header

            while (sc.hasNextLine()) { // changed: safer than line.trim().length()>0
                line = sc.nextLine();
                System.out.println(line);

                String[] parts = line.trim().split("\\s+"); // changed: \\s+ for spaces/tabs

                String name = parts[0];
                long population = Long.parseLong(parts[1]); // changed: country fields
                double area = Double.parseDouble(parts[2]);
                String continent = parts[3];

                double density = population / area; // changed: operation

                System.out.println("Density: " + density);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path.");
        }
    }
} 
    

