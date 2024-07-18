import java.util.*;
public class Item {
    public static HashMap<String,Integer>items;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                items = new HashMap<>();
                items.put("Dosa",35);
                items.put("Idly",30);
                items.put("Vada",45);
                for(String i:items.keySet()) {
                    System.out.println(items.get(i) + "-" + i);
                }
        System.out.println("Enter yor choice");
        System.out.println("1.Remove item");
        System.out.println("2.Add item");
        int a=sc.nextInt();
                    switch (a){
                        case 1:
                            items.remove("Dosa");
                            System.out.println("updated iems : "+items);
                            break;
                        case 2 :
                            items.put("Allu parota",100);
                            System.out.println(items);
                            break;

                        default :
                            System.out.println("Inavalid");
                    }
    }
}
