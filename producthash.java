import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;  

public class producthash {
    public static void main(String[] args) {
        String[] arr = new String[5];
        HashMap<String, Double> map = new HashMap<>();  

        try {
            File f1 = new File("C:\\Users\\hajra\\uni programs\\SalesEVESession.txt");
            Scanner sc = new Scanner(f1);
            sc.nextLine();

            while (sc.hasNextLine()) {
                arr = sc.nextLine().split("\t");
                String product = arr[0];
                double revenue = Double.parseDouble(arr[2]) * Double.parseDouble(arr[3]);

                if (map.containsKey(product)) {
                    map.put(product, map.get(product) + revenue);  
                } else {
                    map.put(product, revenue);  
                }
            }

            
            for (String key : map.keySet()) {
                System.out.println(key + "\tRevenue\t" + map.get(key));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}