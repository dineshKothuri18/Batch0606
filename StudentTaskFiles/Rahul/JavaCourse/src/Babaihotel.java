import java.util.*;
public class Babaihotel {
    public static ArrayList<String> FoodItems;
    public static ArrayList<Integer> ItemCost;
    public static ArrayList<Integer> Selected;
    public static boolean flag = true;
    public static void menu(ArrayList<String>FoodItems,ArrayList<Integer> ItemCost){
        System.out.format("|%-5s | %-20s | %-8s|", "S.No", "Food Items", "Cost");
        System.out.println();
        for (int i = 0; i < FoodItems.size(); i++) {
            System.out.format("|%-5d | %-20s | %-8d|", (i + 1), FoodItems.get(i), ItemCost.get(i));
            System.out.println();
        }

    }
    public static void operations(){
        Scanner sc = new Scanner(System.in);
        System.out.format("%36s\n","Please select one from the below");
        System.out.println("---------------------------------------------");
        System.out.format("|%-20s | %-20s|\n","Operation","Action");
        System.out.println("---------------------------------------------");
        System.out.format("|%-20s | %-20s|\n","Add to cart","Okkati Nokkandi(1)");
        System.out.format("|%-20s | %-20s|\n","View Cart","Rendu Nokkandi(2)");
        System.out.format("|%-20s | %-20s|\n","Proceed to buy","Moodu Nokkandi(3)");
        System.out.println("---------------------------------------------");
        int user_input = sc.nextInt();
        switch(user_input){
            case 1:
                Selected = Addtocart();
                break;
            case 2:
                viewCart(Selected,FoodItems,ItemCost);
                break;
            case 3:
                proceedtobuy(Selected,FoodItems,ItemCost);
                flag = false;
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FoodItems = new ArrayList<>();
        ItemCost = new ArrayList<>();
        Collections.addAll(FoodItems, "DOSA","IDLY","PURI","BONDA","VADA");
        Collections.addAll(ItemCost, 1999,1499,2499,2999,2999);
        System.out.format("%35s", "Welcome to Rahul's Elite Hotel");
        System.out.println();
        while(flag) {
            menu(FoodItems, ItemCost);
            operations();
        }


    }
    public static ArrayList<Integer> Addtocart(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> selecteditems = new ArrayList<>();
        boolean k = true;
        while(k){
            System.out.println("Please Enter the food Item number:");
            int itemno = sc.nextInt();
            System.out.println("Please Enter the quantity:");
            int quant = sc.nextInt();
            selecteditems.add(itemno-1);
            selecteditems.add(quant);
            System.out.println("Do you need something else");
            System.out.println("then Enter 1 or Enter 0");
            int s = sc.nextInt();
            if(s == 0){
                k = false;
            }
        }
        return selecteditems;
    }
    public static void viewCart(ArrayList<Integer> selected,ArrayList<String> FoodItems,ArrayList<Integer> Itemcosts){
        if(selected.size() == 0){
            System.out.println("Please select any items");
        }
        else {
            System.out.println("Selected items are:");
            System.out.println("--------------------------------------------");
            System.out.format("|%-5s|%-15s|%-10s|%-10s|\n", "S.no", "Item", "Quantity", "Cost");
            System.out.println("--------------------------------------------");
            int q = 1;
            for (int i = 0; i < selected.size(); i += 2) {
                String l = FoodItems.get(selected.get(i));
                int cost = Itemcosts.get(FoodItems.indexOf(l)) * selected.get(i + 1);
                System.out.format("|%-5d|%-15s|%-10s|%-10s|\n", (q++), l, selected.get(i + 1), cost);
                System.out.println("--------------------------------------------");
            }
        }
    }
    public static void proceedtobuy(ArrayList<Integer> selected,ArrayList<String> FoodItems,ArrayList<Integer> Itemcosts){
        float total = 0f;
        if(selected.size() == 0){
            System.out.println("kali cart ki em pay chestav kani po inka");
        }
        else {
            System.out.println("The items to be paid for are:");
            System.out.println("--------------------------------------------");
            System.out.format("|%-5s|%-15s|%-10s|%-10s|\n", "S.no", "Item", "Quantity", "Cost");
            System.out.println("--------------------------------------------");
            int q = 1;
            for (int i = 0; i < selected.size(); i += 2) {
                String l = FoodItems.get(selected.get(i));
                int cost = Itemcosts.get(FoodItems.indexOf(l)) * selected.get(i + 1);
                System.out.format("|%-5d|%-15s|%-10s|%-10s|\n", (q++), l, selected.get(i + 1), cost);
                System.out.println("--------------------------------------------");
                total += cost;
            }
            float tax = total * 0.18f;
            System.out.format("%40s\n", "SGST 18%: " + tax);
            System.out.format("%40s\n", "CGST 18%: " + tax);
            System.out.format("%40s\n", "Total: " + (total + 2 * tax));
        }
    }
}
