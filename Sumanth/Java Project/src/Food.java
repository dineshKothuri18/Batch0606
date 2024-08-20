import java.util.*;
public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("1.menu");
        System.out.println("2.Add to cart");
        System.out.println("Enter the option");

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.printf("%45s%n", "Welcome to our Hotel");
                System.out.printf("%45s%n","Aaku Paku Karvepaku restaurant");
                System.out.println("_");
                System.out.printf("%38s%n", "ICE CREAMS");
                System.out.printf("%25s   %12s%n", "Vanilla", "  --30/-");
                System.out.printf("%25s   %12s%n", "Cookies & Cream", "  --50/-");
                System.out.printf("%25s   %12s%n", "Butter-scotch", "  --60/-");
                System.out.printf("%25s   %12s%n", "Kulfi", "  --25/-");
                System.out.println("");
                System.out.printf("%38s%n", "JUICES");
                System.out.printf("%25s   %12s%n", "Carrot Juice", "  --30/-");
                System.out.printf("%25s   %12s%n", "Grape Juice", "  --50/-");
                System.out.printf("%25s   %12s%n", "Orange Juice", "  --60/-");
                System.out.printf("%25s   %12s%n", "Banana juice", "  --25/-");
                System.out.println("");
            case 2:
                additems();

        }

    }

    public static void additems() {
        Scanner sc = new Scanner(System.in);
        String[] items = {"icecreams", "jucies"};
        ArrayList<String> itemsselected = new ArrayList<String>();
        ArrayList<Integer> itemsselectedcost = new ArrayList<Integer>();


        String[] icecreams = {"Vanilla", "Cookies & Cream", "Butter-scotch", "Kulfi"};
        String[] icecreamcost = {"30", "50", "60", "25",};
        String[] juices = {"Carrot Juice", "Grape Juice", "Orange Juice", "Banana juice"};
        String[] juicescost = {"30", "50", "60", "25"};
        for (int i = 0; i < items.length; i++) {

            System.out.println(i + 1 + "." + items[i]);
        }
        System.out.print("select the category number:  ");
        int category = sc.nextInt();
        if (category == 1) {
            for (int i = 0; i < icecreams.length; i++) {
                System.out.println(i + 1 + "." + icecreams[i]);
            }
            System.out.print("select the icecream number :");
            int d = sc.nextInt();
            for (int i = 0; i < icecreams.length; i++) {
                if ((i + 1) == d) {
                    System.out.println(icecreams[i] + "      --" + icecreamcost[i] + "/-");
                    itemsselected.add(icecreams[i] + "   --" + icecreamcost[i]);
                }
            }
        } else if (category == 2) {
            for (int i = 0; i < juices.length; i++) {
                System.out.println(i + 1 + "." + juices[i]);
            }
            System.out.print("select the juices number :");
            int f = sc.nextInt();
            for (int i = 0; i < juices.length; i++) {
                if ((i + 1) == f) {
                    System.out.println(juices[i] + "      --" + juices[i] + "/-");
                    itemsselected.add(juices[i] + "   --" + juicescost[i]);
                }
            }
        }
    }
}