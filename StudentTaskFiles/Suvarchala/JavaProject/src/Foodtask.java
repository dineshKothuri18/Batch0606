import java.util.*;
public class Foodtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        System.out.println("_______________________________________________________________________________");
        System.out.println("|                                  ll  hotel                                  |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("                               welcome to our  hotel                             ");
        System.out.println();
        boolean end1 = true;
        while (end1) {
            System.out.printf("1. Menu%n2. Additems%nenter the option  :");
            int a =getIntInput(sc);
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("  _________________________________________________________________________________");
                    System.out.println("                                      Menu                                              ");
                    System.out.println("  ___________________________________        ___________________________________");
                    System.out.println(" |              soups                |     |             Biryani's             |");
                    System.out.println("  -----------------------------------        -----------------------------------");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Tomato soup ", "-- 250/-  |", "| Paneer biryani", "-- 200/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Pumpkin soup ", "-- 200/-  |", "| aloo biryani", "-- 300/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Lentil soup ", "-- 230/-  |", "| Jackfruit biryani", "-- 400/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Potato soup ", "-- 270/-  |", "| Kaju biryani", "-- 500/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", " ", " ",    "   | corn biryani", "-- 900/-  |");
                    System.out.println("  ___________________________________        ___________________________________");
                    System.out.println(" |              staters              |     |              chinese              |");
                    System.out.println("  -----------------------------------        -----------------------------------");
                    System.out.printf(" %-25s %8s     %-25s %8s%n ", "| Cheese balls ", "-- 250/-  |", "| Mapo Tofu", "-- 200/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Kakori kebabs ", "-- 200/-  |", "| Chow Mein", "-- 200/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Aloo bonda ", "-- 230/-  |", "| Spring Rolls", "-- 200/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Paneer tikka ", "-- 270/-  |", "| Wonton Soup", "-- 200/-  |");
                    System.out.printf(" %-25s %8s     %-25s %8s%n", "| Chaat ", "-- 300/-  |", "| Char Siu", "-- 200/-  |");
                    System.out.println("  -----------------------------------        -----------------------------------");
                    break;
                case 2:
                    addItems();
                    System.out.println("enter your name: ");
                    String s1 = sc.nextLine();
                    System.out.println("enter your number: ");
                    String s2 = sc.nextLine();
                    System.out.println("enter  your address: ");
                    String s3 = sc.nextLine();
                    System.out.println("*************order confirmed****************");
                    System.out.println();
                    System.out.println("--------------Thank you for visiting-------------");
                    end1 = false;
                    break;
            }
        }
    }
    public static int getIntInput(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                return input;
            }
            else {
                System.out.printf(" Invalid input%n please enter valid data:  ");
                sc.nextLine();
            }
        }
    }
    public static void addItems() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemsSelected = new ArrayList<>();
        ArrayList<Integer> itemsSelectedCost = new ArrayList<>();

        String[] categories = {"Soups", "Starters", "Biryani", "Chinese", "Proceed to checkout"};
        String[][] items = {{"Tomato soup", "Pumpkin soup", "Lentil soup", "Potato soup"}, {"Cheese balls", "Kakori kebabs", "Aloo bonda", "Paneer tikka", "Chaat"}, {"Paneer biryani", "Aloo biryani", "Jackfruit biryani", "Kaju biryani", "Corn biryani"}, {"Mapo Tofu", "Chow Mein", "Spring Rolls", "Wonton Soup", "Char Siu"}};
        int[][] itemCosts = {{250, 200, 230, 270}, {250, 200, 230, 270, 300}, {300, 400, 500, 700, 0}, {340, 420, 530, 720, 950}};
        System.out.println("Add items");
        boolean end = false;
        while (!end) {
            for (int i = 0; i < categories.length; i++) {
                System.out.println((i + 1) + ". " + categories[i]);
            }
            System.out.print("Select the dish category number: ");
            int category = getIntInput(sc);
            if (category >= 1 && category <= 4) {
                int categoryIndex = category - 1;
                for (int i = 0; i < items[categoryIndex].length; i++) {
                    System.out.println((i + 1) + ". " + items[categoryIndex][i]);
                }
                System.out.print("Select the dish number: ");
                int dishnumber = getIntInput(sc);
                if (dishnumber >= 1 && dishnumber <= items[categoryIndex].length) {
                    int dishindex = dishnumber - 1;
                    System.out.println(items[categoryIndex][dishindex] + " -- " + itemCosts[categoryIndex][dishindex] + "/-");
                    itemsSelected.add(items[categoryIndex][dishindex] + " -- " + itemCosts[categoryIndex][dishindex] + "/-");
                    itemsSelectedCost.add(itemCosts[categoryIndex][dishindex]);
                }
            }
            else if (category == 5) {
                System.out.println("Items selected: " + itemsSelected);
                int totalcost=0;
                for(int i=0;i<itemsSelectedCost.size();i++){
                    totalcost=((totalcost)+(itemsSelectedCost.get(i)));
                }
                System.out.println("Total bill: " + totalcost);
                end = true;
            }
        }
    }
}

