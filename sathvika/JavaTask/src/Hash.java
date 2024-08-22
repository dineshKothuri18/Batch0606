import java.util.*;

public class Hash {
    public static void main(String[] args){
        HashMap<String,Integer> Fooditems=new HashMap<>();
        Fooditems.put("Idly",20);
        Fooditems.put("Dosa",25);
        Fooditems.put("puri",30);
        Fooditems.put("bhaji",35);
        Fooditems.put("pungulu",15);
        Fooditems.put("Idly",23);
        Fooditems.put("puri",30);
        for(String v : Fooditems.keySet()){
            System.out.println(v+" -" +Fooditems.get(v));
        }
    }
}