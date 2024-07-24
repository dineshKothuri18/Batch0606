

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public  static HashMap<String, HashMap<String,String>> productDetails;
    public static HashMap<String,Integer> cart;


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        productDetails=new HashMap<>();
        cart=new HashMap<>();
        System.out.println("Welcome Brand Store ");
        Cellphone();
        int stopcondi=1;


        do {
            System.out.println("Roles:");
            System.out.println("1.Admin");
            System.out.println("2.customer");
            System.out.println("3.Exit");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    boolean flag = Authenticate();
                    if (flag){
                        Admin_role();
                    }
                    else {
                        break;
                    }
                case 2:
                    break;
                case 3:
                    stopcondi=0;
            }
        } while (stopcondi>0);
    }
    public static void Cellphone(){



                HashMap<String, String> moblies = new HashMap<>();
                moblies.put("Brandname", "samsung");
                moblies.put("price", "35000");
                moblies.put("colour", "white");
                moblies.put("discount", "10%");
                productDetails.put("samsung s24ultra",moblies);


                HashMap<String, String> moblie1 = new HashMap<>();

                moblie1.put("Brandname", "oppo");
                moblie1.put("price", "15000");
                moblie1.put("colour", "black");
                moblie1.put("discount", "12%");
        productDetails.put("oppof21",moblie1);

                HashMap<String, String> moblie2 = new HashMap<>();

                moblie2.put("Brandname", "apple");
                moblie2.put("price", "450000");
                moblie2.put("colour", "white");
                moblie2.put("discount", "15%");
                productDetails.put("iphone15pro",moblie2);

                HashMap<String, String> moblie3 = new HashMap<>();
                moblie3.put("Brandname", "google");
                moblie3.put("price", "60000");
                moblie3.put("colour", "Phantom Black, Phantom White, ");
                moblie3.put("discount", "5%");
                productDetails.put("googlepixel",moblie3);

                HashMap<String, String> moblie4 = new HashMap<>();

                moblie4.put("Brandname", "sony");
                moblie4.put("price", "67000");
                moblie4.put("colour", "white ,black,purple");
                moblie4.put("discount", "6%");
                productDetails.put("Sony Xperia 1",moblie4);

                HashMap<String, String> moblie5 = new HashMap<>();

                moblie5.put("Brandname", "Motorola");
                moblie5.put("price", "450000");
                moblie5.put("colour", "Ceramic White, Glaze Black");
                moblie5.put("discount", "15%");
            productDetails.put("Motorola Moto G Power",moblie5);

                HashMap<String, String> moblie6 = new HashMap<>();

                moblie6.put("Brandname", "Xiaomi");
                moblie6.put("price", "560000");
                moblie6.put("colour", "Horizon Blue, Cloud White, Midnight Gray");
                moblie6.put("discount", "20%");
                productDetails.put("Xiaomi redmi",moblie6);

                HashMap<String, String> moblie7 = new HashMap<>();

                moblie7.put("Brandname", "onepuls");
                moblie7.put("price", "350000");
                moblie7.put("colour", "Gray Sierra, Blue Haze");
                moblie7.put("discount", "17%");
                productDetails.put("onepulsnord",moblie7);

                HashMap<String, String> moblie8 = new HashMap<>();

                moblie8.put("Brandname", "realme");
                moblie8.put("price", "20000");
                moblie8.put("colour", "Booster Black, Pulse White");
                moblie8.put("discount", "19%");
                productDetails.put("realme7",moblie8);

                HashMap<String, String> moblie9 = new HashMap<>();

                moblie9.put("Brandname", "honor");
                moblie9.put("price", "40000");
                moblie9.put("colour", "Black,Emerald Green");
                moblie9.put("discount", "8%");
                productDetails.put("Honor Magic5 Pro",moblie9);

    }

    public static  Boolean Authenticate(){
        System.out.println("To Get access enter:");
        System.out.println("Username:Saikumar");
        System.out.println("Password: 12345678");
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter user name:");
        String username=scan.nextLine();
        System.out.println("Enter password:");
        String password=scan.nextLine();
        if (username.equals("Saikumar") && password.equals("12345678")){
            return Boolean.TRUE;
        }
        else{
            System.out.println("Pls check your entered user name and password ");
            return Authenticate();
        }

    }

    public static void Admin_role(){
        Scanner scan =new Scanner(System.in);
        int terminarte=1;
        do {
            System.out.println("choose a option: ");
            System.out.println("Add new product-1");
            System.out.println("Edit details of a product-2");
            System.out.println("Delete a product-3");
            System.out.println("Exit-4");
            System.out.println("Enter the option:");
            int i=scan.nextInt();
            switch (i){
                case 1:
                    AddNewProduct();
                    break;
                case 2:
                    Edit();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    terminarte=0;
                default:
                    System.out.println("Choose the crct option");
            }
            
        }while(terminarte>0);
        

    }

    public static void AddNewProduct(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter details of the product");
        System.out.println("Enter the name of the product");
        String Name =scan.nextLine();
        HashMap<String, String> moblie = new HashMap<>();
        System.out.println("Enter the Brandname");
        moblie.put("Brandname",scan.nextLine());
        System.out.println("Enter the price:");
        moblie.put("price",scan.nextLine());
        System.out.println("ENter the colour of device");
        moblie.put("colour", scan.nextLine());
        System.out.println("Enter the Discount of the price");
        moblie.put("discount", scan.nextLine());
        productDetails.put(Name,moblie);
        moblie.clear();
    }

    public static void Edit(){

        System.out.println("Choose the Phone  you want the edit");
        int k=1;
        for(String Name:productDetails.keySet()){
            System.out.println((k++)+Name);

        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter index of your phone");
        int j= scan.nextInt();
        String[] Names=productDetails.keySet().toArray(new String[0]);
        String Phone_name=Names[j-1];

        do{
            view();
            System.out.println("Choose the Feature  you want the edit");
            System.out.println("Product Name - 1");
            System.out.println("Brand Name -2");
            System.out.println("Price - 3");
            System.out.println("colour - 4");
            System.out.println("Discount -5");
            System.out.println("Exit- 6");
            System.out.println("Enter you editing options");
            int case1= scan.nextInt();
            switch (case1){
                case 1:
                    System.out.println("Enter the new Phone name:");
                    String Name=scan.nextLine();
                    productDetails.put(Name,productDetails.get(Phone_name));
                    productDetails.remove(Phone_name);
                    Phone_name=Name;
                    break;
                case 2:
                    System.out.println("Enter the new Brand name:");
                    scan.nextLine();
                    String BName=scan.nextLine();
                    productDetails.get(Phone_name).replace("Brandname",productDetails.get(Phone_name).get("Brandname"),BName);
                    break;
                case 3:
                    System.out.println("Enter the new Price:");
                    scan.nextLine();
                    String Price=scan.nextLine();
                    productDetails.get(Phone_name).replace("price",productDetails.get(Phone_name).get("price"),Price);
                    break;
                case 4:
                    System.out.println("Enter the new colour:");
                    scan.nextLine();
                    String colour=scan.nextLine();
                    productDetails.get(Phone_name).replace("colour",productDetails.get(Phone_name).get("colour"),colour);
                    break;
                case 5:
                    System.out.println("Enter the new discount:");
                    scan.nextLine();
                    String discount=scan.nextLine();
                    productDetails.get(Phone_name).replace("discount",productDetails.get(Phone_name).get("discount"),discount);
                    break;

                case 6:
                    k=0;
                    break;

                default:
                    System.out.println("Please enter valid input");


            }

        }while (k>0);
    }

    public static void Delete(){
        int Stop=1;
        System.out.println("Choose the Phone  you want the delete");
        int k=1;
        for(String Name:productDetails.keySet()){
            System.out.println((k++)+Name);

        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter index of your phone");
        int j= scan.nextInt();
        String[] Names=productDetails.keySet().toArray(new String[0]);
        String Phone_name=Names[j-1];
        productDetails.remove(Phone_name);
    }

    public static void view(){
        System.out.format("%-25s | %-20s | %-15s | %-50s | %-20s","Name","Brandname","price","colour","discount");
        System.out.println();
        for(String Name: productDetails.keySet()){
            System.out.format("%-25s | %-20s | %-15s | %-50s | %-20s",Name,productDetails.get(Name).get("Brandname"),productDetails.get(Name).get("price"),productDetails.get(Name).get("colour"),productDetails.get(Name).get("discount"));
            System.out.println();

        }
    }







}