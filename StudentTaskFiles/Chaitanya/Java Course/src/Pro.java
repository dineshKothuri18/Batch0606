import java.util.ArrayList;
import java.util.HashMap;

public class Pro {
    public static void main(String[] args) {
        
        ArrayList<HashMap<String, String>> phones = new ArrayList<>();

        
        HashMap<String, String> prod1 = new HashMap<>();
        prod1.put("name", "iphone");
        prod1.put("brandName", "Apple");
        prod1.put("price", "90000.00");
        prod1.put("discount", "10");
        prod1.put("color", "Silver");
        phones .add(prod1);
        
        
        HashMap<String, String> prod2 = new HashMap<>();
        prod2.put("name", "iphone 15");
        prod2.put("brandName", "Apple");
        prod2.put("price", "95000.00");
        prod2.put("discount", "15");
        prod2.put("color", "Black");
        phones .add(prod2);

        
        HashMap<String, String> prod3 = new HashMap<>();
        prod3.put("name", "redme 13");
        prod3.put("brand Name", "android");
        prod3.put("price", "15999.00");
        prod3.put("discount", "50");
        prod3.put("color", "Blue");
        phones .add(prod3);
        
        HashMap<String, String> prod4 = new HashMap<>();
        prod4.put("name", "one plus");
        prod4.put("brand Name", "android");
        prod4.put("price", "18000.00");
        prod4.put("discount", "40");
        prod4.put("color", "Black");
        phones .add(prod4);
        
        HashMap<String, String> prod5 = new HashMap<>();
        prod5.put("name", "vivo");
        prod5.put("brand Name", "android");
        prod5.put("price", "43500.00");
        prod5.put("discount", "35");
        prod5.put("color", "Light pink");
        phones .add(prod5);
 
        HashMap<String, String> prod6 = new HashMap<>();
        prod6.put("name", "Samsung");
        prod6.put("brand Name", "android");
        prod6.put("price", "28999.00");
        prod6.put("discount", "425");
        prod6.put("color", "Black");
        phones .add(prod6);

        HashMap<String, String> prod7 = new HashMap<>();
        prod7.put("name", "Xiaomi");
        prod7.put("brand Name", "android");
        prod7.put("price", "38999.00");
        prod7.put("discount", "15");
        prod7.put("color", "Blue");
        phones .add(prod7);
        
        HashMap<String, String> prod8 = new HashMap<>();
        prod8.put("name", "Motorola");
        prod8.put("brand Name", "android");
        prod8.put("price", "90000.00");
        prod8.put("discount", "20");
        prod8.put("color", "Black");
        phones .add(prod8);

        HashMap<String, String> prod9 = new HashMap<>();
        prod9.put("name", "Oppo");
        prod9.put("brand Name", "android");
        prod9.put("price", "99999.00");
        prod9.put("discount", "75");
        prod9.put("color", "Black");
        phones .add(prod9);

       HashMap<String, String> prod10 = new HashMap<>();
        prod10.put("name", "Lg");
        prod10.put("brand Name", "android");
        prod10.put("price", "100000.00");
        prod10.put("discount", "45");
        prod10.put("color", "Black");
        phones .add(prod10);

        for (HashMap<String, String> s1 : phones) {
            System.out.println("Phones Details:");
            System.out.println("Name: " + s1.get("name"));
            System.out.println("Brand: " + s1.get("brandName"));
            System.out.println("Price: $" + s1.get("price"));
            System.out.println("Discount: " + s1.get("discount") + "%");
            System.out.println("Color: " + s1.get("color"));
            System.out.println();
            System.out.println("----------------------");

        }
    }
}