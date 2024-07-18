import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FoodItems {


    public static ArrayList<HashMap<String,String>> itemsList;
    public static Scanner sc;
    public static void main(String[] args){

        sc = new Scanner(System.in);
        itemsList = new ArrayList<>();


        HashMap<String,String> foodItem1 = new HashMap<>();
        foodItem1.put("name","Poori");
        foodItem1.put("price","40");
        foodItem1.put("code","111");

        HashMap<String,String> foodItem2 = new HashMap<>();
        foodItem2.put("name","Dosa");
        foodItem2.put("price","50");
        foodItem2.put("code","112");

        HashMap<String,String> foodItem3 = new HashMap<>();
        foodItem3.put("name","Chapati");
        foodItem3.put("price","30");
        foodItem3.put("code","113");

        itemsList.add(foodItem1);
        itemsList.add(foodItem2);
        itemsList.add(foodItem3);

        pritItems();
    }

    public static void pritItems(){
        for(HashMap<String,String> item : itemsList){
            System.out.println(item.get("code") + " " + item.get("name") + " " + item.get("price"));
        }
        displayOptions();
    }

    public static void displayOptions(){
        System.out.println("1.Add\n2.Delete");
        int option = sc.nextInt();
        if(option == 2){
            System.out.println("Please Enter Item Code");
            sc.nextLine();
            String code = sc.nextLine();

        }

    }

}

/*

Download github desktop and use it
TASK: WAP to create multiple products hashmap and save it in a array list
The hashmape contains
name,brandName,price,discount,color

*/

