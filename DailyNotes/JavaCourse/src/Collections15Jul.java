import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Collections15Jul {

    public static ArrayList<Integer> rollNumbers;
    public static ArrayList<String> stuNames;

    public static HashMap<Integer,String> stuInfo;
    public static void main(String[] args){

        rollNumbers = new ArrayList<>();
        stuNames = new ArrayList<>();
        Collections.addAll(stuNames,"Sai","Kavya","Vijaya");
        Collections.addAll(rollNumbers,618,631,647,624,603,652);


        stuInfo = new HashMap<>();

        stuInfo.put(618,"Sai Kumar");
        stuInfo.put(631,"Kavya");
        stuInfo.put(647,"Vijaya");
        stuInfo.put(624,"Akhila");
        stuInfo.put(603,"Sathvika");
        stuInfo.put(652,"Vamshi");

//        System.out.println("For i loop- Start");
//        for (int i = 0; i < rollNumbers.size(); i++) {
//            System.out.println(rollNumbers.get(i));
//        }
//        System.out.println("For i loop- End");
//
//        System.out.println("For Each loop- Start");
//        for (Integer num: rollNumbers) {
//            System.out.println(num);
//        }
        System.out.println("For Each loop- End");

        System.out.println(stuInfo.keySet());

        for (Integer roll: stuInfo.keySet()) {
            System.out.println(stuInfo.get(roll) + "-" + roll);
        }

    }
    //write a program to take food items and its price store in a HashMap and print all the items using forEachloop

}
