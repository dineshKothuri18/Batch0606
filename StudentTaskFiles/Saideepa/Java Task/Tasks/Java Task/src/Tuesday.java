import java.util.HashMap;
import java.util.Scanner;

public class Tuesday {
    public static HashMap<String, Integer> items;

    public static void main(String[] args) {
        items = new HashMap<>();
        items.put("Idly", 40);
        items.put("Dosa", 40);
        items.put("Vada", 40);
        items.put("Puri", 40);
        items.put("Bonda", 40);
        items.put("Uthapam", 40);

        while (true) {
            System.out.println("1. Display Menu");
            System.out.println("2. Add an item to the list");
            System.out.println("3. Update an item in the list");
            System.out.println("4. Remove an item from the list");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Menu();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Enter correct data");
                    break;
            }
        }
    }

    public static void Menu() {
        for (String list : items.keySet()) {
            System.out.println(list + " - " + items.get(list));
        }
    }

    public static void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Today's Special Item in our Hotel: ");
        String name = sc.nextLine();
        System.out.println("Enter Price of the Special Item: ");
        int cost = sc.nextInt();
        items.put(name, cost);
        System.out.println("Today's Special Item " + name + " added with price " + cost);
    }

    public static void updateItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Item that needs to be updated: ");
        String name = sc.nextLine();
        if (items.containsKey(name)) {
            System.out.println("Enter new cost: ");
            int cost = sc.nextInt();
            items.put(name, cost);
            System.out.println(name + " updated with new price " + cost);
        } else {
            System.out.println("Item not found in the menu.");
        }
    }

    public static void removeItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item name to delete: ");
        String name = sc.nextLine();
        if (items.containsKey(name)) {
            items.remove(name);
            System.out.println(name + " removed from the menu.");
        } else {
            System.out.println("Item not found in the menu.");
        }
    }

    public static void exit() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }
}

