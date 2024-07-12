import java.util.*;

public class Foodtask {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = 0;
    boolean end = false;
    ArrayList<String> cart = new ArrayList<>();
    String name = " ";
    String phone = " ";
    String address = " ";


    while (!end) {
      System.out.println("************** Welcome tO MOYE MOYE HOTEL**");
      System.out.println("What do you want to order sir.....!?");

      System.out.println("1. Hyderabadi Chicken Biryani = 500");
      System.out.println("2. Hyderabadi Mutton Biryani = 200");
      System.out.println("3. Fish Biryani = 210");
      System.out.println("4. Veg Biryani = 350");
      System.out.println("5. Egg Biryani = 175");
      System.out.println("6. Chicken Jumbo Biryani = 500");
      System.out.println("7. Mutton Jumbo Biryani = 550");
      System.out.println("8. Prawns Biryani = 340");
      System.out.println("9. Chalu le inka");
      System.out.println("10. View Cart");
      System.out.println("11. Enter ur details");
      System.out.println("Em kavalo Cheppu");
      
      System.out.println("-----------------------------------------------------------------");

      int ch = sc.nextInt();

      switch (ch) {
       case 1:
          System.out.println("You have selected Hyderabadi Chicken Biryani");
          System.out.println("Enter the desired quantity:");
          int quantity = sc.nextInt();
          total += quantity * 250;
          cart.add("Hyderabadi Chicken Biryani x " + quantity);
          break;
        case 2:
          System.out.println("You have selected Hyderabadi Mutton Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 350;
          cart.add("Hyderabadi Mutton Biryani x " + quantity);
          break;
        case 3:
          System.out.println("You have selected Fish Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 245;
          cart.add("Fish Biryani x " + quantity);
          break;
        case 4:
          System.out.println("You have selected Veg Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 150;
          cart.add("Veg Biryani x " + quantity);
          break;
        case 5:
          System.out.println("You have selected Egg Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 175;
          cart.add("Egg Biryani x " + quantity);
          break;
        case 6:
          System.out.println("You have selected Chicken Jumbo Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 500;
          cart.add("Chicken Jumbo Biryani x " + quantity);
          break;
        case 7:
          System.out.println("You have selected Mutton Jumbo Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 550;
          cart.add("Mutton Jumbo Biryani x " + quantity);
          break;
        case 8:
          System.out.println("You have selected Prawns Biryani");
          System.out.println("Enter the desired quantity:");
          quantity = sc.nextInt();
          total += quantity * 340;
          cart.add("Prawns Biryani x " + quantity);
          break;
        case 9:
          end = true;
          break;
        case 10:
          System.out.println("Your cart:");
          for (String item : cart) {
            System.out.println(item);
          }
        System.out.println("Total: " + total + "/-");
          break;
        case 11:
       System.out.println("peru cheppandi");
       name = sc.next();
       System.out.println("number cheppu");
       phone = sc.next();
       System.out.println("Address cheppandi last inka");
       address = sc.next();
      
          break;
      }
    }
         System.out.println();
    System.out.println("Your cart:");
    for (String item : cart) {
      System.out.println(item);
    }
    System.out.println("Total: " + total + "/-");

   // System.out.println("Personal Details:");
    //System.out.println("Name: " + name);
    //System.out.println("Phone: " + phone);
    //System.out.println("Address: " + address);

    System.out.print("Do you want to order again? (Y/N):");
    String again = sc.next();

    if (again.equalsIgnoreCase("Y")) {
      main(args);
    } else if (again.equalsIgnoreCase("N")) {
      generateBill(total);
      System.exit(1);
    } else {
      System.out.println("Invalid choice");
    }
  }

  public static void generateBill(int total) {
    System.out.println();
    System.out.println("Your total bill is: " + total + "/-");
    System.out.println("***THANKS FOE VISTING****!");
  }
}