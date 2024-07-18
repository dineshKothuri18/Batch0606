import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTopic {

    private static String customerName;
    public static String customerAddress;

    public static String customerPhone;

    public static ArrayList<String> customerCart;

    public static ArrayList<String> itemsArray;
    public static ArrayList<Integer> costArray;

    public static Scanner sc;
    public static  void main(String[] args){
        sc = new Scanner(System.in);
        showMenu();
        getUserItem();

    }

    public static void getUserItem(){
        System.out.println("Please Select 1.." + (itemsArray.size()));
        int userItem = sc.nextInt();

        if(userItem>itemsArray.size()){
            System.out.println("Please select a valid number");
            showMenu();
            getUserItem();
        }else {
            System.out.println("USer Selected item is " + itemsArray.get(userItem-1));
        }
    }

    public static void prepareMenu(){
        itemsArray = new ArrayList<>();
        costArray = new ArrayList<>();
        itemsArray.add("Idly");
        itemsArray.add("Dosa");
        itemsArray.add("Upma");
        itemsArray.add("Poori");
        itemsArray.add("Chapathi");

        costArray.add(50);
        costArray.add(60);
        costArray.add(70);
        costArray.add(80);
        costArray.add(90);
        costArray.add(100);
    }

    public static void showMenu(){
        prepareMenu();
        System.out.println("Please Choose the item Number");
        for (int i = 0; i < itemsArray.size(); i++) {
            System.out.println((i+1) + "." + itemsArray.get(i) + "-" + costArray.get(i));
        }

    }

    public static void removeUserCart(){
        System.out.println("Please Slect  item Number to delete");

        int userItem = sc.nextInt();

        if(userItem>customerCart.size()){
            System.out.println("Please select a valid number");
            removeUserCart();
        }else {
            customerCart.remove((userItem-1));
        }
    }

}
