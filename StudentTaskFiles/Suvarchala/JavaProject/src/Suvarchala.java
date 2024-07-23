import java.util.*;
public class Suvarchala {
    public static ArrayList<HashMap<String, String>> productsarray = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("1. Add a product\n2. View products\n3. Delete a product\n4. Update a product\n5. Exit");
            System.out.println("select the options :");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    HashMap<String, String> producthashmap = new HashMap<>();
                    System.out.println("Enter product details:");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Brand name: ");
                    String brandName = sc.nextLine();
                    System.out.print("Price: ");
                    String price = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Discount: ");
                    String discount = sc.nextLine();

                    producthashmap.put("name", name);
                    producthashmap.put("brandName", brandName);
                    producthashmap.put("price", price);
                    producthashmap.put("color", color);
                    producthashmap.put("discount", discount);

                    productsarray.add(producthashmap);
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    referncetoselect();
                    System.out.println("select the product number to delete:  ");
                    int deno = sc.nextInt();
                    deletee(deno);
                    break;
                case 4:
                    referncetoselect();

                    System.out.println("select the product number to update: ");
                    int upno = sc.nextInt();

                        HashMap<String, String> product1 = productsarray.get(upno - 1);
                        System.out.print("Name: ");
                        String name1 = sc.nextLine();
                        System.out.print("Brand name: ");
                        String brandName1 = sc.nextLine();
                        System.out.print("Price: ");
                        String price1 = sc.nextLine();
                        System.out.print("Color: ");
                        String color1 = sc.nextLine();
                        System.out.print("Discount: ");
                        String discount1 = sc.nextLine();

                        product1.put("name", name1);
                        product1.put("brandName", brandName1);
                        product1.put("price", price1);
                        product1.put("color", color1);
                        product1.put("discount", discount1);

                        productsarray.set(upno - 1, product1);

                        view();
                    System.out.println("your product is updated successfully");
                    System.out.println("_____________________________________________________________________________________");
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
    public static void view() {
        System.out.println("_______________________________________________________________________________________________");
        int productnumber = 0;
        for (HashMap<String, String> All : productsarray) {
            System.out.println("**  product :" + (productnumber = productnumber + 1) + "  **");
            System.out.println("Name:" + All.get("name"));
            System.out.println("Brandname:" + All.get("brandName"));
            System.out.println("price:" + All.get("price"));
            System.out.println("colour:" + All.get("color"));
            System.out.println("discount:" + All.get("discount"));
            System.out.println();
        }
        System.out.println("_______________________________________________________________________________________________");
    }
    public static void referncetoselect() {
        System.out.println("_______________________________________________________________________________________________");
        int productnumber = 0;
        for (HashMap<String, String> All : productsarray) {
            System.out.println("**  product :" + (productnumber = productnumber + 1) + "  **");
            System.out.println("Name:" + All.get("name"));
            System.out.println();

        }
        System.out.println("_______________________________________________________________________________________________");
    }
    public static void deletee(int dno) {
        productsarray.remove(dno - 1);
        System.out.println("*****  your product is deleted successfully  ****");
        System.out.println("_______________________________________________________________________________________________");
    }
}