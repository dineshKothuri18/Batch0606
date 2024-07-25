import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> selecteditem = new ArrayList<String>();
        ArrayList<Integer> selecteditemcost = new ArrayList<Integer>();
        System.out.println("                  THE Ϡ GEM");
        System.out.println("     WELCOME TO FRESH & TASTY FOOD DELIVERY");
        System.out.println("             Culinary Choices");

        boolean ff=false;

        while(!ff){
            System.out.println("    BIRYANIS");
            System.out.println("    STARTERS");
            System.out.println("    KEBABS");
            System.out.println("    CURRIES");
            System.out.println("    INDIAN BREADS");
            System.out.println("    DESSERTS");
            System.out.println("    BEVERAGES");
            System.out.println("    Exit");
            System.out.println("___________________________________________________");
            System.out.println("    Items available for order:  ");
            String s1= sc.nextLine();
            if(s1.equals("BIRYANIS")){
                String[] list = {"  Chicken Biryani", "  Mutton Biryani", "  Chicken Family Pack", "  Mutton Family Pack", "  Special Chicken Biryani", "  Special Mutton Biryani", "  Supreme Chicken Biryani", "  Supreme Mutton Biryani", "  Egg.Biryani", "  Veg.Biryani", "  Veg.Family Pack", "  Veg.Supreme Pack"};
                int[] cost = {210, 253, 552, 576, 337, 351, 784, 819, 154, 154, 383, 574};
                for (int i = 0; i < list.length; i++) {
                    System.out.println((i) + list[i] + "                       "+"₹"+cost[i]);
                }
                System.out.print("Choose your desired item:-----------------------");
                int subitem1 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list[subitem1]);
                selecteditemcost.add(cost[subitem1]);
                System.out.println("____________________________________________");
            }
            else if(s1.equals("STARTERS")){
                String[] list1 = {"  Chilli Chicken", "  Chicken 65", "  Pepper Chicken", "  Panner 65", "  Veg.Manchurian"};
                int[] cost1 = {264, 264, 264, 196, 189};
                for (int i = 0; i < list1.length; i++) {
                    System.out.println((i + 1) + list1[i] + "                   "+"₹"+cost1[i]);
                }
                System.out.print("Choose your desired item:---------------------------");
                int subitem2 = sc.nextInt();
                sc.nextLine();

                selecteditem.add(list1[subitem2]);
                selecteditemcost.add(cost1[subitem2]);

            }
            else if(s1.equals("KEBABS")){
                String[] list2 = {"  Chicken Tikka Kebab", "  Tandoori Chicken(Half)", "  Tandoori Chicken(Full)", "  Chicken Reshmi Kebab", "  Chicken Garlic Kebab"};
                int[] cost2 = {243, 243, 379, 243, 243};
                for (int i = 0; i < list2.length; i++) {
                    System.out.println((i + 1) + list2[i] + "                   " +"₹"+cost2[i]);
                }
                System.out.print("Choose your desired item:-------------------------");
                int subitems3 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list2[subitems3]);
                selecteditemcost.add(cost2[subitems3]);
            }
            else if(s1.equals("CURRIES")){
                String[] list3 = {"  Butter Chicken Bonless","  Nizami Handi"};
                int [] cost3 = {246,171};
                for(int i=0;i< list3.length;i++){
                    System.out.println((i+1)+list3[i]+"                     "+"₹"+cost3[i]);
                }
                System.out.println("Choose your desired item:--------------------------");
                int subitems4 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list3[subitems4]);
            }
            else if(s1.equals("INDIANBREADS")){
                String[] list4 = {"  Tandoori Roti","  Rumali"};
                int[] cost4 = {40,40};
                for(int i=0;i< list4.length;i++){
                    System.out.println((i+1)+ list4[i]+"                       "+"₹"+cost4[i]);
                }
                System.out.println("Choose your desired item:-------------------------");
                int subitems5 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list4[subitems5]);
            }
            else if(s1.equals("DESERTS")){
                String[] list5 ={"  Qubain Ka Meetha 250Gms","  Double ka Meetha"};
                int[] cost5 = {107,73};
                for(int i=0;i<list5.length;i++){
                    System.out.println((i+1)+list5[i]+"                      "+"₹"+cost5[i]);
                }
                System.out.println("Choose your desired item:------------------------");
                int subitems6 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list5[subitems6]);
            }
            else if(s1.equals("BEVERAGES")){
                String[] list6 = {"  Dite Coke","  Thums Up","  Mineral Water","  Mazza","  Coke Tin","  Coke","  Fanta"};
                int[] cost6 = {75,75,75,75,75,75,75};
                sc.nextLine();
                for(int i=0;i< list6.length;i++){
                    System.out.println((i+1)+ list6[i]+"                    "+"₹"+cost6[i]);
                }
                System.out.println("Choose your desired item:-----------------------");
                int subitems7 = sc.nextInt();
                sc.nextLine();
                selecteditem.add(list6[subitems7]);
            }
            else if(s1.equals("Exit")){
                ff=true;
                break;
            }
            else{
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("Please Select items available in the list ");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            }
        }
        int totalbill = 0;
        int count=0;
        for (int cost : selecteditemcost) {
            totalbill += cost;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total bill: " +"₹"+totalbill*selecteditem.size() + "/-");
        System.out.println("no.of items = "+selecteditem);
        System.out.println("Selected Items:");
        for (int i = 0; i < selecteditem.size(); i++) {
            System.out.println(selecteditem.get(i) + " - "+"₹"+selecteditemcost.get(i) + "/-");
        }

        System.out.println("Payment Type");
        String pay = sc.nextLine();
        System.out.println("Select your Payment Mode: Online (or) Cash on delivery");
        if(pay=="Online"){
            System.out.println("Enter Your Card Details");
            System.out.println(totalbill);
        }
        else if(pay=="Cash on delivery")
            System.out.println("Pay after your received your delivery "+pay);
        System.out.println("*****************************************************************");
        System.out.println("Can you please enter few of the details to place an order :  ");
        System.out.println("*****************************************************************");
        System.out.println("enter your name : ");
        String name = sc.nextLine();
        System.out.println("enter your phone number : ");
        String number = sc.nextLine();
        sc.nextLine();
        System.out.println("enter your food delivery location : ");
        String address = sc.nextLine();
        System.out.println("`~your order have been placed~`");
    }
}

