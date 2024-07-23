
import java.util.*;

public class Hello {
    public static HashMap<String,String> countries;

    public static void main(String[] args){

        countries = new HashMap<>();

        countries.put("IND","INDIA");
        countries.put("PAK","PAKISTAN");
        countries.put("AUS","AUSTRALIA");
        countries.put("MAL","MALAYSIA");
        countries.put("USA","UNITED STATES OF AMERICA");

        System.out.println(countries.keySet());
        System.out.println(countries.values());

        System.out.println(countries.get("IND"));



        for(String k : countries.keySet()){
            System.out.println(countries.get(k) + " - " + k);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,1,1,1,2,3,4,4,6,7,7,7);
        System.out.println(numbers);


        HashSet<Integer> numSet = new HashSet<>(numbers);
        System.out.println(numSet);

    }
}
