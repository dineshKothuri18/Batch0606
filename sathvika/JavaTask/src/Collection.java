import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> moblies = new HashMap<>();
        moblies.put("Name", "samsung s24ultra");
        moblies.put("Brandname", "samsung");
        moblies.put("price", "35000");
        moblies.put("colour", "white");
        moblies.put("discount", "10%");

        HashMap<String, String> moblie1 = new HashMap<>();
        moblie1.put("Name", "oppof21");
        moblie1.put("Brandname", "oppo");
        moblie1.put("price", "15000");
        moblie1.put("colour", "black");
        moblie1.put("discount", "12%");

        HashMap<String, String> moblie2 = new HashMap<>();
        moblie2.put("Name", "iphone15pro");
        moblie2.put("Brandname", "apple");
        moblie2.put("price", "450000");
        moblie2.put("colour", "white");
        moblie2.put("discount", "15%");

        HashMap<String, String> moblie3 = new HashMap<>();
        moblie3.put("Name", "googlepixel");
        moblie3.put("Brandname", "google");
        moblie3.put("price", "60000");
        moblie3.put("colour", "Phantom Black, Phantom White, ");
        moblie3.put("discount", "5%");

        HashMap<String, String> moblie4 = new HashMap<>();
        moblie4.put("Name", "Sony Xperia 1 ");
        moblie4.put("Brandname", "sony");
        moblie4.put("price", "67000");
        moblie4.put("colour", "white ,black,purple");
        moblie4.put("discount", "6%");

        HashMap<String, String> moblie5 = new HashMap<>();
        moblie5.put("Name", "Motorola Moto G Power");
        moblie5.put("Brandname", "Motorola");
        moblie5.put("price", "450000");
        moblie5.put("colour", "Ceramic White, Glaze Black");
        moblie5.put("discount", "15%");

        HashMap<String, String> moblie6 = new HashMap<>();
        moblie6.put("Name", "Xiaomi redmi");
        moblie6.put("Brandname", "Xiaomi");
        moblie6.put("price", "560000");
        moblie6.put("colour", "Horizon Blue, Cloud White, Midnight Gray");
        moblie6.put("discount", "20%");

        HashMap<String, String> moblie7 = new HashMap<>();
        moblie7.put("Name", "onepulsnord");
        moblie7.put("Brandname", "onepuls");
        moblie7.put("price", "350000");
        moblie7.put("colour", "Gray Sierra, Blue Haze");
        moblie7.put("discount", "17%");

        HashMap<String, String> moblie8 = new HashMap<>();
        moblie8.put("Name", "realme7");
        moblie8.put("Brandname", "realme");
        moblie8.put("price", "20000");
        moblie8.put("colour", "Booster Black, Pulse White");
        moblie8.put("discount", "19%");

        HashMap<String, String> moblie9 = new HashMap<>();
        moblie9.put("Name", "Honor Magic5 Pro");
        moblie9.put("Brandname", "honor");
        moblie9.put("price", "40000");
        moblie9.put("colour", "Black,Emerald Green");
        moblie9.put("discount", "8%");

        ArrayList<HashMap<String, String>> gadgets = new ArrayList<>();
        gadgets.add(moblies);
        gadgets.add(moblie1);
        gadgets.add(moblie2);
        gadgets.add(moblie3);
        gadgets.add(moblie4);
        gadgets.add(moblie5);
        gadgets.add(moblie6);
        gadgets.add(moblie7);
        gadgets.add(moblie8);
        gadgets.add(moblie9);

        ArrayList<HashMap<String, String>> cart = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            if (true) {
            System.out.println("Select an option:");
            System.out.println("1. View all mobiles");
            System.out.println("2. Add  your mobile to cart");
            System.out.println("3. View cart");
            System.out.println("4. Exit");
            } else {
                System.out.println("please choose correct options :)");
            }
            int a;
            a = scanner.nextInt();
        switch (a) {
            case 1:
                int index = 1;
                for (HashMap<String, String> gadget : gadgets) {
                    System.out.println(index + ". Name: " + gadget.get("Name"));
                    System.out.println("   Brandname: " + gadget.get("Brandname"));
                    System.out.println("   Price: " + gadget.get("price"));
                    System.out.println("   Colour: " + gadget.get("colour"));
                    System.out.println("   Discount: " + gadget.get("discount"));
                    System.out.println("*****************");
                    index++;
                }
                break;
            case 2:
                System.out.println("Enter the number of the mobile you want to add to the cart (1-10):");
                int mobileNumber;
                mobileNumber = scanner.nextInt();
                if (mobileNumber > 0 && mobileNumber <= gadgets.size()) {
                    cart.add(gadgets.get(mobileNumber - 1));
                    System.out.println("Mobile added to cart successfully:))");
                } else {
                    System.out.println("Invalid mobile number!");
                }
                break;
            case 3:
                for (HashMap<String, String> item : cart) {
                    System.out.println("Name: " + item.get("Name"));
                    System.out.println("Brandname: " + item.get("Brandname"));
                    System.out.println("Price: " + item.get("price"));
                    System.out.println("Colour: " + item.get("colour"));
                    System.out.println("Discount: " + item.get("discount"));
                    System.out.println("*****************");
                    System.out.println("Thank you for visiting bye bye :)");
                }
                break;
            case 4:
                flag = false;
                System.out.println("Thank you for visiting bye bye :)");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }
        }
    }





    }
