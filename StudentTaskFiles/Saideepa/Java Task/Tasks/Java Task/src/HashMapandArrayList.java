import java.util.*;

public class HashMapandArrayList {
    public static ArrayList<HashMap<String, String>>productlist;
    public static Scanner sc ;

    public static void main(String[] args){
        System.out.println("           SALE is Live For Below Electronics Gadgets");
        productlist = new ArrayList<>();

        HashMap<String, String>item1 = new HashMap<>();

        item1.put("Name of an item : ", "WirelessBuds");
        item1.put("Model : ","Boult Z40");
        item1.put("Price : ","999");
        item1.put("discount : ","80%");
        item1.put("Color : ","Black");
        item1.put("code : ","414796");


        HashMap<String, String>item2 = new HashMap<>();
        item2.put("Name of an item : ","WirelessBuds");
        item2.put("Model : ","bOAt");
        item2.put("Price : ","899");
        item2.put("discount : ","63%");
        item2.put("Color : ","Olive Green");
        item2.put("code : ","421304");

        HashMap<String, String>item3 = new HashMap<>();
        item3.put("Name of an item : ","realme");
        item3.put("Model : ","realme");
        item3.put("Price : ","1,399");
        item3.put("discount : ","53%");
        item3.put("Color : ","Jazz Blue");
        item3.put("code : ","424287");



        HashMap<String, String>item4 = new HashMap<>();
        item4.put("Name of an item : ","OPPO");
        item4.put("Model : ","OPPO Reno 12 5G, 256GB");
        item4.put("Price : ","32,999");
        item4.put("discount : ","25%");
        item4.put("Color : ","Sunset Peach");
        item4.put("code : ","341932");

        HashMap<String, String>item5 = new HashMap<>();
        item5.put("Name of an item : ","Redmi");
        item5.put("Model : ","Note 13Pro 5g, 128GB");
        item5.put("Price : ","24,999");
        item5.put("discount : ","13%");
        item5.put("Color : ","Midnight Black");
        item5.put("code : ","275481");

        HashMap<String, String>item6 = new HashMap<>();
        item6.put("Name of an item : ","POCO");
        item6.put("Model : ","POCO C65,128GB");
        item6.put("Price : ","6,799");
        item6.put("discount : ","38%");
        item6.put("Color : ","Pastel Blue");
        item6.put("code : ","736223");



        HashMap<String, String>item7 = new HashMap<>();
        item7.put("Name of an item : ","Fastrack");
        item7.put("Model : ","Fastract1 Revolt Fs1");
        item7.put("Price : ","1,099");
        item7.put("discount : ","72%");
        item7.put("Color : ","Black");
        item7.put("code : ","319782");

        HashMap<String, String>item8 = new HashMap<>();
        item8.put("Name of an item : ","Noise");
        item8.put("Model : ","Noise pro 5 Max");
        item8.put("Price : ","4,499");
        item8.put("discount : ","55%");
        item8.put("Color : ","Space Blue");
        item8.put("code : ","426047");

        HashMap<String, String>item9 = new HashMap<>();
        item9.put("Name of an item : ","Fire-boltt");
        item9.put("Model : ","Fire-Boltt Ninja Pro Max Ultra 2BT");
        item9.put("Price : ","1,299");
        item9.put("discount : ","90%");
        item9.put("Color : ","Deep Blue");
        item9.put("code : ","407004");

        productlist.add(item1);
        productlist.add(item2);
        productlist.add(item3);
        productlist.add(item4);
        productlist.add(item5);
        productlist.add(item6);
        productlist.add(item7);
        productlist.add(item8);
        productlist.add(item9);

        ListOfProducts();
        displayoptions();
    }
    public static void ListOfProducts() {
        boolean androidPrinted = false;
        boolean watchesPrinted = false;
        System.out.println("\nList of Products:");
        for (HashMap<String, String> item : productlist) {

            if (item.get("Name of an item : ").equals("OPPO") && !androidPrinted) {
                System.out.println("\nAndroid Mobiles with Special Offers on Weekend Sale is live Now!------------");
                androidPrinted = true;
            } else if (item.get("Name of an item : ").equals("Fastrack") && !watchesPrinted) {
                System.out.println("\nSmart Watches With Special Offers on Weekends The Sale is Live Now!--------------");
                watchesPrinted = true;
            }
            System.out.println("\nName : " + item.get("Name of an item : "));
            System.out.println("Model : " + item.get("Model : "));
            System.out.println("Price : " + item.get("Price : "));
            System.out.println("Discount : " + item.get("discount : "));
            System.out.println("Color : " + item.get("Color : "));
            System.out.println("Code : " + item.get("code : "));
            System.out.println("---------------------------------------------------------------------");
        }
    }

    public static void displayoptions(){
        System.out.println("1.Add an item to the list");
        System.out.println("2.Delete an item from the list");
        sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        String options = sc.next();
        sc.nextLine();
        if(options.equals("2")){
            System.out.println("Please enter the code : ");
            String code = sc.nextLine();
            deleteItem(code);
        }
        else if(options.equals("1")){
            addItem();

        }

    }
    public static void deleteItem(String code) {
        boolean found = false;
        System.out.println("Deleting item with code: " + code);
        for (HashMap<String, String> item : productlist) {
            // System.out.println("Item code: " + item.get("code"));
            if (item.get("code : ").equals(code)) {
                productlist.remove(item);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Item with code " + code + " removed successfully.");
        } else {
            System.out.println("Item with code " + code + " not found.");
        }
    }

    public static void addItem(){
        System.out.println("Add an item to the list");
        HashMap<String, String> newItem = new HashMap<>();
        System.out.println("Enter item details: ");
        System.out.print("Name of an item: ");
        newItem.put("Name of an item", sc.next());
        System.out.print("Model: ");
        newItem.put("Model", sc.next());
        System.out.print("Price: ");
        newItem.put("Price", sc.next());
        System.out.print("discount: ");
        newItem.put("discount", sc.next());
        System.out.print("Color: ");
        newItem.put("Color", sc.next());
        System.out.print("code: ");
        newItem.put("code", sc.next());

        productlist.add(newItem);
        System.out.println("New item has been added.");
    }


}

