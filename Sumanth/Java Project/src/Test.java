import java.util.*;

public class Test{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String,String>>list = new ArrayList<>();
        boolean Add = true;
        while (Add){
            HashMap<String,String>sa = new HashMap<>();
            System.out.println("Enter a First name : ");
        sa.put("FName", sc.nextLine());
        System.out.println("Enter a Last name : ");
        sa.put("LName", sc.nextLine());
        System.out.println("Enter a Email : ");
        sa.put("Mail", sc.nextLine());
        System.out.println("Enter Phone Number : ");
        sa.put("Phone", sc.nextLine());
        System.out.println("Enter Address : ");
        sa.put("Address", sc.nextLine());
        System.out.println("Enter Occupation : ");
        sa.put("Occupation",sc.nextLine());
        System.out.println("Enter your age : ");
        sa.put("Age",sc.nextLine());
        System.out.println("Enter Gender : ");
        sa.put("Gender",sc.nextLine());
        System.out.println("Enter Aadhar : ");
        sa.put("Aadhar",sc.nextLine());
            list.add(sa);


            System.out.print("\nDo you want to enter details for another person? (yes/no): ");
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                Add = false;
            }

            System.out.println("---------------------------------");
        }
        System.out.println("\nAll entered details:");

        for (int i = 0; i < list.size(); i++) {
        HashMap<String, String> user = list.get(i);
        System.out.println("\nDetails for Person " + (i + 1) + ":");
            System.out.println("----------------");
        System.out.println("First Name : " + user.get("FName"));
        System.out.println("Last Name : " + user.get("LName"));
        System.out.println("Mail : " + user.get("Mail"));
        System.out.println("Phone : " + user.get("Phone"));
        System.out.println("Address : " + user.get("Address"));
        System.out.println("Occupation : " + user.get("Occupation"));
        System.out.println("Age : " + user.get("Age"));
        System.out.println("Gender : " + user.get("Gender"));
        System.out.println("Aadhar : " + user.get("Aadhar"));
    }

        System.out.println("\nProgram ended. Thank you!");

}
}