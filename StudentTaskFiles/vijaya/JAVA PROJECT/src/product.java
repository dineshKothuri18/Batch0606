import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class product {

    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> itemslist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

        itemslist.add(b1);
        itemslist.add(b2);
        itemslist.add(b3);
        itemslist.add(b4);

        displayItems(itemslist);

        while (true) {
            System.out.println("Enter your choice ");
            System.out.println("1. Add items");
            System.out.println("2. Update the items");
            System.out.println("3. Delete items");
            System.out.println("4. Exit");
            int item = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (item) {
                case 1:
                    addItem(itemslist, sc);
                    break;
                case 2:
                    updateItem(itemslist, sc);
                    break;
                case 3:
                    deleteItem(itemslist, sc);
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            displayItems(itemslist);
        }
    }

    public static void displayItems(ArrayList<HashMap<String, String>> itemslist) {
        for (HashMap<String, String> item : itemslist) {
            System.out.println("Name: " + item.get("name"));
            System.out.println("Price: " + item.get("price"));
            System.out.println("Brand: " + item.get("brand"));
            System.out.println("Discount: " + item.get("discount"));
            System.out.println("Colour: " + item.get("colour"));
            System.out.println("---------------------------------");
        }
    }

    public static void addItem(ArrayList<HashMap<String, String>> itemslist, Scanner sc) {
        HashMap<String, String> item = new HashMap<>();
        System.out.println("Enter product name: ");
        item.put("name", sc.nextLine());
        System.out.println("Enter product price: ");
        item.put("price", sc.nextLine());
        System.out.println("Enter brand name: ");
        item.put("brand", sc.nextLine());
        System.out.println("Enter discount: ");
        item.put("discount", sc.nextLine());
        System.out.println("Enter colour name: ");
        item.put("colour", sc.nextLine());
        itemslist.add(item);
    }

    public static void updateItem(ArrayList<HashMap<String, String>> itemslist, Scanner sc) {
        System.out.println("Enter the name of the product to update: ");
        String name = sc.nextLine();
        for (HashMap<String, String> item : itemslist) {
            if (item.get("name").equalsIgnoreCase(name)) {
                System.out.println("Enter new product price: ");
                item.put("price", sc.nextLine());
                System.out.println("Enter new brand name: ");
                item.put("brand", sc.nextLine());
                System.out.println("Enter new discount: ");
                item.put("discount", sc.nextLine());
                System.out.println("Enter new colour name: ");
                item.put("colour", sc.nextLine());
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void deleteItem(ArrayList<HashMap<String, String>> itemslist, Scanner sc) {
        System.out.println("Enter the name of the product to delete: ");
        String name = sc.nextLine();
        itemslist.removeIf(item -> item.get("name").equalsIgnoreCase(name));
    }
}
