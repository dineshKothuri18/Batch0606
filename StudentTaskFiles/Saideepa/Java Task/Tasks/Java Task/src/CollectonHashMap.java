import java.util.HashMap;

public class CollectonHashMap {
    public static HashMap<String, Integer>Fooditems;
    public static void main(String[] args){
        Fooditems =new HashMap<>();
        System.out.println("                         The list of menu of Briyanis");
        Fooditems.put("Chicken Biryani",250);
        Fooditems.put("Mutton Biryani",250);
        Fooditems.put("Prawns Biryani",250);
        Fooditems.put("Egg.Biryani",250);
        Fooditems.put("Veg.Biryani",250);
        Fooditems.put("Special Mandi",1250);
        menu();
    }
    public static void menu(){
        for(String items: Fooditems.keySet()){
            System.out.println(items+"-"+Fooditems.get(items)+"/-");
        }
    }
}
