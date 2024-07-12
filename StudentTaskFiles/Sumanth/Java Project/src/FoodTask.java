import java.util.*;

public class FoodTask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean check=true;

        System.out.println("_");
        System.out.println("|                   dumdham hotel(100% pure vegetarian)                       |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("                               welcome to our  hotel                             ");
        System.out.println();
        boolean end1 = false;


        System.out.println("1. Menu");
        System.out.println("2. Add items");
        System.out.println();
        System.out.println("enter the option  :");
        int a = sc.nextInt();
        sc.nextLine();

        switch (a) {
            case 1:
                System.out.println("  ___________________________________        ___________________________________");
                System.out.println();
                System.out.println("                                      Menu                                              ");
                System.out.println();
                System.out.println("  ___________________________________        ___________________________________");
                System.out.println(" |              soups                |     |             Biryani's             |");
                System.out.println("  -----------------------------------        -----------------------------------");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.println("  ___________________________________        ___________________________________");
                System.out.println(" |              staters              |     |              chinese              |");
                System.out.println("  -----------------------------------        -----------------------------------");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s     %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.printf(" %-25s %8s      %-25s %8s%n", "| Minestrone ", "-- 200/-  |", "| Veg Fritters", "-- 200/-  |");
                System.out.println("  -----------------------------------        -----------------------------------");
            case 2:
                additems();
                System.out.println("enter the name: ");
                String s1=sc.nextLine();
                System.out.println("enter the phone number: ");
                String s2=sc.nextLine();
                System.out.println("enter the your address: ");
                String s3=sc.nextLine();
                end1=false;
                break;
        }

    }
    public static void additems() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemsselected = new ArrayList<String>();
        ArrayList<Integer> itemsselectedcost = new ArrayList<Integer>();
        String[] items = {"soups", "staters", "biriyani", "chinese", "proceed to check"};
        String[] soupitems = {"Tomato soup", "Pumpkin soup", "Lentil soup", "potato soup"};
        int[] soupitemscost = {250, 200, 230, 270};
        String[] statersitems = {"Cheese balls", "Kakori kebabs", "Aloo bonda", "Paneer tikka", "Chaat"};
        int[] statersitemscost = {250, 200, 230, 270, 340};
        String[] biryaniitems = {"paneer biryani", "aloo biryani", "jackfruit biryani", "kaju biryani", "corn biryani"};
        int[] biryaniitemscost = {3, 4, 5, 7, 9, 2};
        String[] chineseitems = {"Mapo Tofu", "Chow Mein", "Spring Rolls", "Wonton Soup", "Char Siu"};
        int[] chineseitemscost = {340, 420, 530, 720, 950, 230};
        System.out.println("add items");
        boolean end = false;
        while (!end) {

            for (int j = 0; j < items.length; j++) {
                System.out.println(j + 1 + "." + items[j]);
            }
            System.out.print("select the dish category number:  ");
            int dishcategory = sc.nextInt();
            if (dishcategory == 1) {
                for (int j = 0; j < soupitems.length; j++) {
                    System.out.println(j + 1 + "." + soupitems[j]);
                }
                System.out.print("select the dish number :");
                int d = sc.nextInt();
                for (int i = 0; i < soupitems.length; i++) {
                    if ((i + 1) == d) {
                        System.out.println(soupitems[i] + "      --" + soupitemscost[i] + "/-");
                        itemsselected.add(soupitems[i] + "   --" + chineseitemscost[i]);
                        itemsselectedcost.add(soupitemscost[i]);
                    }
                }
            } else if (dishcategory == 2) {
                for (int j = 0; j < statersitems.length; j++) {
                    System.out.println(j + 1 + "." + statersitems[j]);
                }
                System.out.print("select the dish number :");
                int e = sc.nextInt();
                for (int i = 0; i < statersitems.length; i++) {
                    if ((i + 1) == e) {
                        System.out.println(statersitems[i] + "      --" + statersitemscost[i] + "/-");
                        itemsselected.add(statersitems[i] + "   --" + statersitemscost[i]);
                        itemsselectedcost.add(statersitemscost[i]);
                    }
                }
            } else if (dishcategory == 3) {
                for (int j = 0; j < biryaniitems.length; j++) {
                    System.out.println(j + 1 + "." + biryaniitems[j]);
                }
                System.out.print("select the dish number :");
                int f = sc.nextInt();
                for (int i = 0; i < biryaniitems.length; i++) {
                    if ((i + 1) == f) {
                        System.out.println(biryaniitems[i] + "      --" + biryaniitemscost[i] + "/-");
                        itemsselected.add(biryaniitems[i] + "   --" + biryaniitemscost[i]);
                        itemsselectedcost.add(biryaniitemscost[i]);
                    }
                }
            } else if (dishcategory == 4) {
                for (int j = 0; j < chineseitems.length; j++) {
                    System.out.println(j + 1 + "." + chineseitems[j]);
                }
                System.out.print("select the dish number :");
                int f = sc.nextInt();
                for (int i = 0; i < chineseitems.length; i++) {
                    if ((i + 1) == f) {
                        System.out.println(chineseitems[i] + "      --" + chineseitemscost[i] + "/-");
                        itemsselected.add(chineseitems[i] + "   --" + chineseitemscost[i]);
                        itemsselectedcost.add(chineseitemscost[i]);
                    }
                }
            } else if (dishcategory == 5) {
                System.out.println("Items selected: " + itemsselected);
                int totalcost = 0;
                for (int i = 0; i < itemsselectedcost.size(); i++) {
                    totalcost = ((totalcost) + (itemsselectedcost.get(i)));


                }
                System.out.println("Total bill" + " " + totalcost);


                end = true;
            }

        }

    }
}