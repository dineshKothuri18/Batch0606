import java.util.HashMap;

public class HashMaps {
    public static HashMap<String,Integer>fooditems;
    public static void main(String[] args)
    {
        fooditems =new HashMap<>();
        fooditems.put("Dosa",45);
        fooditems.put("Idly",25);
        fooditems.put("Puri",40);
        fooditems.put("Pongal",45);
        fooditems.put("Vada",30);
        fooditems.put("Bonda",40);
        fooditems.put("Omelet",20);
        System.out.println("Total number of items:"+fooditems.size());
        for (String name: fooditems.keySet()){
            System.out.println(name+"-"+fooditems.get(name));
        }
    }
}
