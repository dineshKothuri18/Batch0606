import java.util.*;
public class food {
    Scanner sc = new Scanner(System.in);
    public static HashMap<String, Integer> order = new HashMap<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        order.put("Idly", 20);
        order.put("Dosa", 25);
        order.put("puri", 30);
        order.put("punuglu", 40);
        order.put("vada", 45);
        order.put("vada pav", 40);
        for (String c : order.keySet()) {
            System.out.println(c + "-" + order.get(c));
        }
        System.out.println("1.Add the items");
        System.out.println("2. Update the items");
        System.out.println("3.Delete the items");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                order.put("bonda", 56);
                System.out.println(order);
                break;
            case 2:
                order.replace("dosa", 25, 30);
                System.out.println();
                break;
            case 3:
                order.remove("vada pav");
                System.out.println("order");
                break;
            default:
                System.out.println("your order is invalid");
        }
    }




        }

