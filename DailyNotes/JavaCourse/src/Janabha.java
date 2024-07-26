import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Janabha {

    public static Scanner sc;
    public static ArrayList<HashMap<String,String>> personList;

    public  static  void main(String[] args){
        sc = new Scanner(System.in);
        personList = new ArrayList<>();

        int option = 1;


        personList.add(scanPersonDetails());
        personList.add(scanPersonDetails());

        printUserDetails();

    }

    public  static HashMap<String,String> scanPersonDetails(){
        HashMap<String,String> personDetails = new HashMap<>();

        System.out.println("Please Enter FirstName");
        String fName = sc.nextLine();
        System.out.println("Please Enter LastName");
        String lName = sc.nextLine();
        System.out.println("Please Enter email");
        String email = sc.nextLine();


        personDetails.put("fName",fName);
        personDetails.put("lName",lName);
        personDetails.put("email",email);


        return  personDetails;
    }

    public static  void printUserDetails(){
        for (HashMap<String ,String> person:
             personList) {
            System.out.println(person.get("fName") + " " + person.get("lName") + " " + person.get("email"));
        }
    }

}
