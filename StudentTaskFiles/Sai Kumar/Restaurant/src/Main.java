//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.format("%40s", "-----WELCOME KERALA RESTAURANT WITH AUTHENTIC TELUGU FOOD----");
        System.out.println();

        String[] breakfast_items = {"Idli", "Dosa", "Vada", "Puri Bhaji", "Upma", "Poha", "Paratha", "Chole Bhature", "Aloo Puri", "Masala Dosa", "Pongal", "Uttapam", "Pesarattu", "Misal Pav", "Thepla"};
        int[] breakfast_costs = {40, 50, 35, 45, 30, 25, 50, 60, 40, 55, 35, 40, 50, 60, 30};
        int[] breakfastmenu = new int[breakfast_items.length];
        int stopcondi=1;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menu Intake");
            System.out.println("2. View Cart")
            System.out.println("3. Proceed to Buy");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Menuintake(breakfast_items, breakfast_costs, breakfastmenu);
                    break;
                case 2:
                    Viewcart(breakfast_items, breakfast_costs, breakfastmenu);
                    break;
                case 3:
                    procced_to_buy(breakfast_items, breakfast_costs, breakfastmenu);
                    stopcondi=0;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (stopcondi > 0);
    }
    public static void Menuintake(String[] Menu,int[] Cost,int[] menuintake) {
        System.out.format("%-7s | %-20s | %-10s","index", "Items", "Cost");
        System.out.println();
        System.out.println("---------------------------");
        for (int i = 0; i < Menu.length; i++) {
            System.out.format("%-7d | %-20s | %-10d",i, Menu[i], Cost[i]);
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a order you want using index");
        int i = 1;
        while (i > 0) {
            System.out.println("Please a enter a index of your order");
            int a = scan.nextInt();
            System.out.println("please enter no of items you want to order");

            int b = scan.nextInt();
            menuintake[a] += b;
            System.out.println("if you want anything to order");
            System.out.println("enter 1 if yes");
            int c = scan.nextInt();
            if (c == 1) {
                continue;
            } else {
                i = 0;
            }


        }
    }
    public static  void Viewcart(String[] Menu,int[] Cost,int[] menuintake){
            System.out.format("%-20s | %-10s  |  %-12s","Items","Cost","Total Cost");
            System.out.println();
            System.out.println("------------------------------------------------");
            int totalcost=0;
            for(int i=0;i<Menu.length;i++){
                if (menuintake[i]>0) {
                    System.out.format("%-20s | %-10d  | %-12d", Menu[i], Cost[i],menuintake[i]*Cost[i]);
                    System.out.println();
                    totalcost+=menuintake[i]*Cost[i];
                }
            }
            System.out.println("Total cost:"+totalcost);


    }
    public static  void procced_to_buy(String[] Menu,int[] Cost,int[] menuintake){
        System.out.format("%-20s | %-10s  |  %-12s","Items","Cost","Total Cost");
        System.out.println();
        System.out.println("------------------------------------------------");
        int totalcost=0;
        for(int i=0;i<Menu.length;i++){
            if (menuintake[i]>0) {
                System.out.format("%-20s | %-10d  | %-12d", Menu[i], Cost[i],menuintake[i]*Cost[i]);
                System.out.println();
                totalcost+=menuintake[i]*Cost[i];
            }
        }
        System.out.println("Total cost:"+totalcost);
        float taxes=(totalcost*18)/100.f;
        System.out.println("taxes: "+taxes);
        System.out.println("Total cost with Taxes is: "+(totalcost+taxes));


    }






}