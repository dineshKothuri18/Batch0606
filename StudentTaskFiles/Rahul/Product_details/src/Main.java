import java.util.*;
public class Main {
    public static ArrayList<Products> products_List = new ArrayList<>();

    public static void main(String[] args) {
        products_List.add(new Products("Iphone 15", "A16 Bionic chip", 79600, 171, "147.6*71.6*7.9", 0, 3349));
        products_List.add(new Products("Samsung galaxy s23 ultra", "Snapdragon 8 gen 2", 109999, 234, "163.4*78.1*8.9", 2, 5000));
        products_List.add(new Products("OnePlus 11 5G", "Snapdragon 8 gen 2", 64999, 205, "163.1*74.1*8.5", 2, 5000));
        boolean flag = true;
        while(flag) {
            System.out.println("Choose any one of the services Provided");
            System.out.println("1. Add a new Product");
            System.out.println("2. Display");
            System.out.println("3. Display (in cm)");
            System.out.println("4. Compare two products");
            System.out.println("5. Exit");
            int p = user_input_int();
            switch (p) {
                case 1:
                    addProducts();
                    view();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    view_cm();
                    break;
                case 4:
                    int l = 1,i,j;
                    for (Products k : products_List) {
                        System.out.println((l++) + ". " + k.product_Name);
                    }
                    System.out.println("Choose any two products from above list to compare");
                    System.out.println("Enter the index of the product");
                    System.out.print("Enter your 1st product index: ");
                    i = user_input_int();
                    System.out.print("Enter your 2nd product index: ");
                    j = user_input_int();
                    while(i>products_List.size() || j>products_List.size()){
                        System.out.println("Please Enter valid indexes to compare");
                        System.out.print("Enter your 1st product index: ");
                        i = user_input_int();
                        System.out.print("Enter your 2nd product index: ");
                        j = user_input_int();
                    }
                    compare(i - 1, j - 1);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Please Enter Valid Input");
            }
        }
    }

    public static void addProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Following Details:");
        System.out.println("Enter the Product Name ");
        String productName = sc.nextLine();
        System.out.println("Enter the Processor Type");
        String processor = sc.nextLine();
        System.out.println("Enter Price");
        int price = user_input_int();
        System.out.println("Enter Weight in gm");
        float weight = user_input_float();
        System.out.println("Enter dimensions of the Phone");
        System.out.println("Enter Height of your product (in mm)");
        float height = user_input_float();
        System.out.println("Enter length of your product (in mm)");
        float length = user_input_float();
        System.out.println("Enter depth of your product (in mm)");
        float depth = user_input_float();
        String dimensions = String.valueOf(height)+"*"+String.valueOf(length)+"*"+String.valueOf(depth);
        System.out.println("Enter total number of SIM slots");
        int simSlots = user_input_int();
        System.out.println("Enter the battery capacity in mAh");
        int batteryCapacity = user_input_int();
        Products product = new Products(productName, processor, price, weight, dimensions, simSlots, batteryCapacity);
        products_List.add(product);
    }

    public static void view() {
        System.out.println("Displaying all product details:");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-30s|%-20s|%-10s|%-20s|%-20s|%-15s|%-18s|","S.No","Product Name","Processor","Price","weight (in grams)","Dimensions(H*L*D)","Sim slots","Battery Capacity");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        int j = 1;
        for (Products p : products_List) {
            System.out.format("|%-5s|%-30s|%-20s|%-10s|%-20s|%-20s|%-15s|%-18s|",(j++),p.product_Name,p.processor,p.Price,p.weight,p.dimensions,p.simslots,p.battery);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void view_cm() {
        System.out.println("Displaying all product details:");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-30s|%-20s|%-10s|%-20s|%-20s|%-15s|%-18s|","S.No","Product Name","Processor","Price","weight (in grams)","Dimensions(H*L*D)","Sim slots","Battery Capacity");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        int j = 1;
        for (Products p : products_List) {
            String[] ar = p.dimensions.split("\\*");
            float h = Float.parseFloat(ar[0])/10;
            float l = Float.parseFloat(ar[1])/10;
            float d = Float.parseFloat(ar[2])/10;
            String dim = String.valueOf(h)+"*"+String.valueOf(l)+"*"+String.valueOf(d);
//            System.out.println(dim);
            System.out.format("|%-5s|%-30s|%-20s|%-10s|%-20s|%-20s|%-15s|%-18s|",(j++),p.product_Name,p.processor,p.Price,p.weight/10,dim,p.simslots,p.battery);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static float user_input_float() {
        Scanner sc = new Scanner(System.in);
        float p = 0f;
        boolean valid = false;

        while (!valid) {
            try {
                p = sc.nextFloat();
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer only.");
                sc.nextLine();
            }
        }
        return p;
    }

    public static void compare(int i, int j){
        System.out.println("Comparing the two products");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.format("|%-30s|%-30s|%-30s|\n","Product name",products_List.get(i).product_Name,products_List.get(j).product_Name);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.format("|%-30s|%-30s|%-30s|\n","Processor",products_List.get(i).processor,products_List.get(j).processor);
        System.out.format("|%-30s|%-30s|%-30s|\n","Price",products_List.get(i).Price,products_List.get(j).Price);
        System.out.format("|%-30s|%-30s|%-30s|\n","Price",products_List.get(i).weight,products_List.get(j).weight);
        System.out.format("|%-30s|%-30s|%-30s|\n","Price",products_List.get(i).dimensions,products_List.get(j).dimensions);
        System.out.format("|%-30s|%-30s|%-30s|\n","Number of sim slots",products_List.get(i).simslots,products_List.get(j).simslots);
        System.out.format("|%-30s|%-30s|%-30s|\n","Battery capacity",products_List.get(i).battery,products_List.get(j).battery);
        System.out.println("----------------------------------------------------------------------------------------------");



    }

    public static int user_input_int() {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        boolean valid = false;

        while (!valid) {
            try {
                p = sc.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer only.");
                sc.nextLine();
            }
        }
        return p;
    }
}