import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Watch {
  public static ArrayList<HashMap<String, String>> watchItemsList;
  public static Scanner sc;

  public static void main(String[] args) {
    watchItemsList = new ArrayList<>();
    sc = new Scanner(System.in);

    
    HashMap<String, String> watchItem1 = new HashMap<>();
    watchItem1.put("name", "Fastrack");
    watchItem1.put("price", "4000");
    watchItem1.put("color", "blue");
    watchItemsList.add(watchItem1);

    HashMap<String, String> watchItem2 = new HashMap<>();
    watchItem2.put("name", "Fossil");
    watchItem2.put("price", "6000");
    watchItem2.put("color", "green");
    watchItemsList.add(watchItem2);

    HashMap<String, String> watchItem3 = new HashMap<>();
    watchItem3.put("name", "Titan");
    watchItem3.put("price", "6000");
    watchItem3.put("color", "green");
    watchItemsList.add(watchItem3);

    printItems();
    displayOptions();
  

    

  }
  public static void printItems() {
    for (HashMap<String, String> item : watchItemsList) {
      System.out.println(item.get("name") + " " + item.get("price") + " " + item.get("color"));
    }
  }

  public static void displayOptions() {
    System.out.println("Personal Details:");
    System.out.println("Name: ");
    String name = sc.nextLine();
    System.out.println("Phone: "); 
    String phone = sc.nextLine();
    System.out.println("Address: ");
    String address = sc.nextLine();
  }
}
   