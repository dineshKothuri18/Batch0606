import java.util.*;
public class MohithBikes  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> BikeItems = new ArrayList<>();
        Collections.addAll(BikeItems, "GT350","R15","APACHI RTR 310","RX100","TRIMPH","ZAWA");
        ArrayList<Integer> ItemCost = new ArrayList<>();
        Collections.addAll(ItemCost, 399999,259999,349999,349999,299999,799999);
        System.out.format("%35s", "Welcome to JANATHA GARAGE");
        System.out.println(" Ichata Anni Rakala Bikes Ammabadunu");
        System.out.println();
        boolean flag = true;
        ArrayList<Integer> Selected = new ArrayList<>();
        while(flag) {
            System.out.format("|%-5s | %-20s | %-8s|", "S.No", "Bike Items", "Cost");
            System.out.println();
            for (int i = 0; i < BikeItems.size(); i++) {
                System.out.format("|%-5d | %-20s | %-8d|", (i + 1), BikeItems.get(i), ItemCost.get(i));
                System.out.println();
            }

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
                    viewCart(Selected,BikeItems,ItemCost);
                    break;
                case 3:
                    proceedtobuy(Selected,BikeItems,ItemCost);
                    flag = false;
                    break;
            }
        }
    }
    public static ArrayList<Integer> Addtocart(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> selecteditems = new ArrayList<>();
        boolean k = true;
        while(k){
            System.out.println("Please Enter the Bike Items" +
                    " number:");
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
    public static void viewCart(ArrayList<Integer> selected,ArrayList<String> BikeItems,ArrayList<Integer> Itemcosts){

        System.out.println("Selected items are:");
        System.out.println("--------------------------------------------");
        System.out.format("|%-5s|%-15s|%-10s|%-10s|\n","S.no","Item","Quantity","Cost");
        System.out.println("--------------------------------------------");
        int q = 1;
        for(int i=0;i<selected.size();i+=2){
            String l = BikeItems.get(selected.get(i));
            int cost = Itemcosts.get(BikeItems.indexOf(l)) * selected.get(i+1);
            System.out.format("|%-5d|%-15s|%-10s|%-10s|\n",(q++),l,selected.get(i+1),cost);
            System.out.println("--------------------------------------------");
        }
    }
    public static void proceedtobuy(ArrayList<Integer> selected,ArrayList<String> BikeItems,ArrayList<Integer> Itemcosts){
        float total = 0f;
        System.out.println("Selected items are:");
        System.out.println("--------------------------------------------");
        System.out.format("|%-5s|%-15s|%-10s|%-10s|\n","S.no","Item","Quantity","Cost");
        System.out.println("--------------------------------------------");
        int q = 1;
        for(int i=0;i<selected.size();i+=2){
            String l = BikeItems.get(selected.get(i));
            int cost = Itemcosts.get(BikeItems.indexOf(l)) * selected.get(i+1);
            System.out.format("|%-5d|%-15s|%-10s|%-10s|\n",(q++),l,selected.get(i+1),cost);
            System.out.println("--------------------------------------------");
            total += cost  ;
        }
        float tax = total*0.18f;
        System.out.format("%40s\n","SGST 18%: "+tax);
        System.out.format("%40s\n","CGST 18%: "+tax);
        System.out.format("%40s\n","Total: "+(total + 2*tax));
        System.out.println("Discount kavala nayana");
    }
}