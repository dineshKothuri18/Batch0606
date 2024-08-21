
import java.util.HashMap;
import java.util.Scanner;


public class Hotel {
    public static HashMap<String,Integer> Menu;
    public static HashMap<String,Integer> Selected;
    public static Integer Total;
    public static void main(String[] args){
        Menu=new HashMap<>();
        Selected=new HashMap<>();
        Total=0;
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.format("%40s", "-----WELCOME KERALA RESTAURANT WITH AUTHENTIC TELUGU FOOD----");
        System.out.println();
        Menu();

        int stopcondi=1;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menu Intake");
            System.out.println("2. View Cart");
            System.out.println("3. Proceed to Buy");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    view();
                    Orderintake();


                    break;
                case 2:
                    Viewcart();
                    break;
                case 3:
                    bill();
                    stopcondi=0;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (stopcondi > 0);



    }
    public static void Menu(){
        String[] breakfast_items = {"Idli", "Dosa", "Vada", "Puri Bhaji", "Upma", "Poha", "Paratha", "Chole Bhature", "Aloo Puri", "Masala Dosa", "Pongal", "Uttapam", "Pesarattu", "Misal Pav", "Thepla"};
        int[] breakfast_costs = {40, 50, 35, 45, 30, 25, 50, 60, 40, 55, 35, 40, 50, 60, 30};
        for(int i=0;i<breakfast_items.length;i++){
            Menu.put(breakfast_items[i],breakfast_costs[i]);

        }

    }
    public  static void view(){
        System.out.format("%-7s | %-20s | %-10s","index", "Items", "Cost");
        System.out.println();
        int i=0;
        System.out.println("---------------------------");
        for(String Name: Menu.keySet()){
            System.out.format("%-7d | %-20s | %-10d",++i, Name, Menu.get(Name));
            System.out.println();
        }

    }
    public static  void Orderintake(){
        System.out.println("Please enter Item number you want to order");
        Scanner scan =new Scanner(System.in);
        int i=scan.nextInt();
        System.out.println("please qunatity:");
        int j=scan.nextInt();
        String[] food_order=Menu.keySet().toArray(new String[0]);
        if(Selected.containsKey(food_order[i-1])){
            Selected.replace(food_order[i-1], Selected.get(food_order[i-1]),Selected.get(food_order[i-1])+j);
        }
        else {
            Selected.put(food_order[i-1],j);
        }
        Total+=j*Menu.get(food_order[i-1]);
        System.out.println("If you want to order anything press 1:");
        int any_thing_to_order=scan.nextInt();
        if (any_thing_to_order==1){
            view();
            Orderintake();
        }
        else{
            Viewcart();
        }

    }

    public static void bill(){
        System.out.format("%-20s | %-10s  | %-10s | %-12s","Items","Cost","Quantity","Total Cost");
        System.out.println();
        System.out.println("------------------------------------------------");

        for(String Name : Selected.keySet()){
            System.out.format("%-20s | %-10d  | %-10d | %-12d", Name, Menu.get(Name),Selected.get(Name),(Selected.get(Name)*Menu.get(Name)));
            System.out.println();

        }
        System.out.println("Total cost:"+Total);
        float taxes=(Total*18)/100.f;
        System.out.println("taxes: "+taxes);
        System.out.println("Total cost with Taxes is: "+(Total+taxes));

    }
    public static void Viewcart(){
        System.out.format("%-20s | %-10s  | %-10s | %-12s","Items","Cost","Quantity","Total Cost");
        System.out.println();
        System.out.println("------------------------------------------------");

        for(String Name : Selected.keySet()){
            System.out.format("%-20s | %-10d  | %-10d | %-12d", Name, Menu.get(Name),Selected.get(Name),(Selected.get(Name)*Menu.get(Name)));
            System.out.println();

        }

    }

}
