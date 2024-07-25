import java.util.*;

public class hashmap {
    public static HashMap<String,Integer> m=new HashMap<>();
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        m.put("dosa",30);
        m.put("chapathi",40);
        m.put("idly",20);
        m.put("onion dosa",40);
        m.put("upma",20);
        m.put("utapa",50);
        m.put("puri",30);
        m.put("poha idly",60);
        for(String i:m.keySet())
            System.out.println(i+"-"+m.get(i));
        System.out.println("Enter your choice ");
        System.out.println("1.additems");
        System.out.println("2.updatetheitems");
        System.out.println("3.deleteitems");
        int a=sc.nextInt();
        switch(a){
            case 1 :
                m.put("AAlu parota",70);
                System.out.println(m);
                break;
            case 2:
                m.replace("dosa",30,50);
                System.out.println(m);
                break;

            case 3:
                m.remove("chapathi");
                System.out.println(m);
                break;
            default :
                System.out.println("Invalid choice");
        }
    }
}
