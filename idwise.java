import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class idwise {
    public static void main(String[] args) {
        String[] arr = new String[5];
        String[] ids = {"E011", "E012", "E013", "E014"};  
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

                for (int i = 0; i < ids.length; i++) {  
                    if (arr[5].equals(ids[i])) {         
                        totals[i] += revenue;
                    }
                }
            }
            for (int i = 0; i < ids.length; i++) {      
                System.out.println(ids[i] + "\tRevenue\t" + totals[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
