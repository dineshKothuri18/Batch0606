import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Items {

    public static void main(String[] args) {


        HashMap<String, String> b1 = new HashMap<>();
        b1.put("name", "handbag");
        b1.put("price", "$261,000");
        b1.put("brand", "chanel diamond forever");
        b1.put("discount", "30");
        b1.put("colour", "white");

        HashMap<String, String> b2 = new HashMap<>();
        b2.put("name", "watch");
        b2.put("price", "5800");
        b2.put("brand", "titan");
        b2.put("discount", "20");
        b2.put("colour", "gold");

        HashMap<String, String> b3 = new HashMap<>();
        b3.put("name", "ring");
        b3.put("price", "28000");
        b3.put("brand", "24 carat");
        b3.put("discount", "10");
        b3.put("colour", "gold");

        HashMap<String, String> b4 = new HashMap<>();
        b4.put("name", "shirt");
        b4.put("price", "3500");
        b4.put("brand", "bighello");
        b4.put("discount", "10");
        b4.put("colour", "green");

        ArrayList<HashMap<String, String>> itemslist;
        itemslist = new ArrayList<>();
        itemslist.add(b1);
        itemslist.add(b2);
        itemslist.add(b3);
        itemslist.add(b4);

        for (HashMap<String, String> s : itemslist) {
            System.out.println("name : " + s.get("name"));
            System.out.println("price : " + s.get("price"));
            System.out.println("brand : " + s.get("brand"));
            System.out.println("discount : " + s.get("discount"));
            System.out.println("colour : " + s.get("colour"));
            System.out.println("---------------------------------");

        }
    }
}
