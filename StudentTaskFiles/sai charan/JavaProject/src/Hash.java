import java.util.HashMap;

public class Hash{

    public static void main(String[] args){
        System.out.println("MOYE MOYE HOTEL");
        System.out.println("**********************");
        System.out.println("FOOD ITEMS DETAILS");
        HashMap<String,Integer> menucard= new HashMap<>();
        menucard.put("MOYEIDLY",100);
        menucard.put("VADAI",200);
        menucard.put("MOYEDOSA",100);
        menucard.put("MOYEPURI",100);
        System.out.println("FOOD MENU:");
        for(String food: menucard.keySet())
        {
            System.out.println(food + "-" + menucard.get(food));

        }
    }
}
