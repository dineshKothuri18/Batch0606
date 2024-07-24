import java.util.*;
public class HotelUpdated {
    public static HashMap<Integer,String> FoodItems;
    public static HashMap<String,Integer> Selected;
    public static HashMap<String,Integer> Dumm;
    public static int total = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FoodItems = new HashMap<>();
        Selected = new HashMap<>();
        Dumm = new HashMap<>();
        FoodItems = menu();
        addtocart();
        view(Dumm);
        bill();
        boolean flag = false;
        while(!flag) {
            System.out.println("If you wanna Order Anything else Please Enter 1 else 0");
            int r = sc.nextInt();
            if(r == 1){
                FoodItems = menu();
                addtocart();
                view(Dumm);
                bill();
            }
            else if(r == 0){
                System.out.println("Thanks For visiting");
                flag = true;
                break;
            }
            else{
                System.out.println("Please Enter 1 or 0");
            }
        }

    }
    public static String indexValue(HashMap<Integer,String> FoodItems,int itemnumber){
        Set<Integer> keySet = FoodItems.keySet();
        Integer[] keyArray
                = keySet.toArray(new Integer[keySet.size()]);
        Integer key = keyArray[itemnumber - 1];
        return FoodItems.get(key);
    }
    public static HashMap<Integer,String> menu(){
        FoodItems = new HashMap<>();
        FoodItems.put(30,"Idly");
        FoodItems.put(35,"Dosa");
        FoodItems.put(40,"Puri");
        FoodItems.put(45,"Wada");
        FoodItems.put(50,"Pongal");
        System.out.println("   Menu of PR's Kitchen");
        System.out.println("---------------------------");
        System.out.format("|%-5s|%-10s|%-8s|\n","S.No","Item","cost");
        System.out.println("---------------------------");
        int i = 1;
        for(Integer cost: FoodItems.keySet()){
            System.out.format("|%-5d|%-10s|%-8d|\n",(i++),FoodItems.get(cost),cost);
        }
        System.out.println("---------------------------");
        return FoodItems;
    }
    public static void addtocart(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the item number");
        int itemNo = sc.nextInt();
        String Item = indexValue(FoodItems,itemNo);
        System.out.println("Your Selected Item is: " +Item);
        System.out.println("Please Enter the quantity");
        int quantity = sc.nextInt();
        if(Selected.containsKey(Item)){
            Selected.replace(Item,Selected.get(Item),Selected.get(Item)+quantity);
        }
        else {
            Selected.put(Item, quantity);
        }
        if(Dumm.containsKey(Item)){
            Dumm.replace(Item,Dumm.get(Item),Dumm.get(Item)+quantity);
        }
        else{
            Dumm.put(Item,quantity);

        }
        boolean flag = false;
        while(!flag){
            System.out.println("Do you Want Any thing else,Pls Enter Item Number");
            System.out.println("Else Enter 0");
            itemNo= sc.nextInt();
            if(itemNo == 0){
                flag = true;
                System.out.println(" Your Order has been placed Love :> ");
                break;
            }
            Item = indexValue(FoodItems,itemNo);
            System.out.println("Your Selected Item is: " +Item);
            System.out.println("Please Enter the quantity");
            quantity = sc.nextInt();
            if(Selected.containsKey(Item)){
                Selected.replace(Item,Selected.get(Item),Selected.get(Item)+quantity);
            }
            else{
                Selected.put(Item, quantity);
            }
            if(Dumm.containsKey(Item)){
                Dumm.replace(Item,Dumm.get(Item),Dumm.get(Item)+quantity);
            }
            else{
                Dumm.put(Item,quantity);
            }

        }
    }
    public static void view(HashMap<String,Integer>Dup){
        int i = 0;
        System.out.println(Dup);
        System.out.format("|%-5s|%-10s|%-10s|%-8s|\n","S.No","Item","Quantity","Cost");
        for(String item:Dup.keySet()){
            for(int fi : FoodItems.keySet()){
                if((FoodItems.get(fi)).equals(item)){
                    System.out.format("|%-5d|%-10s|%-10d|%-8d|\n",(++i),item,Dup.get(item),Dup.get(item)*fi);
                }
            }
        }
    }
    public static void bill(){
        int i = 0;
        for(String item:Selected.keySet()){
            for(int fi : FoodItems.keySet()){
                if((FoodItems.get(fi)).equals(item)){
                    total = total +(Selected.get(item)*fi);
                }
            }
        }
        Selected.clear();
        System.out.println("Total Amount to be paid: "+total);
    }
}
