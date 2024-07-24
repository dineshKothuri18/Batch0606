import java.util.Arraylist;
import java.util.Hashmap;
import java.util.Scanner;
public class Janabacount{
    public Static void main(Sting[] args){
    while (true)
    System.out.println(1. "ADD DETAILS");
     System.out.println(2. "Delete DETAILS");
      System.out.println(3. " UPDATE DETAILS");
       System.out.println(4."DETAILS DETAILS");
        System.out.println(5. "EXIT");
         System.out.println(7."CHOOSE AN OPTION");
         int option = Integer. parseinteger(Scanner.nextline());
         switch (option) {
                case 1:
                    addPerson(personDetails, scanner);
                    break;
                case 2:
                    updatePerson(personDetails, scanner);
                    break;
                case 3:
                    deletePerson(personDetails, scanner);
                    break;
                case 4:
                    displayPersons(personDetails);
                    break;
                case 5:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid option. Please choose a valid option.");





}
 private static void addPerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE FIRST NAME" :);
        String SC = scanner.nextLine();
        System.out.println("ENTER THE LAST NAME":);
        String SC = scanner.nextLine();
        System.out.println("ENTER PERSON Age":);
         String SC = scanner.nextLine();
         System.out.println("ENTER PERSON AADHAR":);
          String SC = scanner.nextLine();
         System.out.println("ENTER PERSON PHONE NUMBER":);
          String SC = scanner.nextLine();
         System.out.println("ENTER PERSON ADDRESS":);
          String SC = scanner.nextLine();
         System.out.println("ENTER PERSON OCCUPATION":);
          String SC = scanner.nextLine();
          System.out.println("ENTER PERSON GENDER":);
           String SC = scanner.nextLine();

 }
    }
}