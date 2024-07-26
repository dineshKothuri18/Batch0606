import java.util.ArrayList;
import java.util.Scanner;
public class Persons {
    public static ArrayList<PersonDetails> census;
    public static void main(String[] args) {
        Add_Details();
        System.out.println("Select one from the ");
    }
    public static void Add_Details(){
        census = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i =0;
        boolean flag = true;
        while(flag) {
            PersonDetails person = new PersonDetails();
            System.out.println("Please Enter the " + (++i) + " person details");
            System.out.println("Please Enter Your First Name: ");
            person.F_Name = sc.nextLine();
            System.out.println("Please Enter Your Last Name: ");
            person.L_Name = sc.nextLine();
            System.out.println("Please Enter Your Email: ");
            person.Email = sc.nextLine();
            int val = validate(1, person.Email);
            while (val == -1) {
                System.out.println("Please Enter a valid Email");
                person.Email = sc.nextLine();
                val = validate(1, person.Email);
            }

            System.out.println("Please Enter Your Phone number: ");
            person.Phone_number = sc.nextLong();
            int valu = validate(2, person.Phone_number);
            while (valu == -1) {
                System.out.println("Please Enter a valid phone number");
                person.Phone_number = sc.nextLong();
                valu = validate(2, person.Phone_number);
            }
            System.out.println("Please Enter Your Address: ");
            sc.nextLine();
            person.address = sc.nextLine();
            System.out.println("Please Enter Your Occupation: ");
            person.Occupation = sc.nextLine();
            System.out.println("Please Enter Your Age: ");
            person.Age = sc.nextInt();
            System.out.println("Please Enter Your Gender: ");
            sc.nextLine();
            person.Gender = sc.nextLine();
            int value = validate(3, person.Gender);
            while (value == -1) {
                System.out.println("Please Enter a valid Gender");
                person.Gender = sc.nextLine();
                value = validate(3, person.Gender);
            }
            System.out.println("Please Enter Your Aadhaar_number: ");
            person.Aadhaar = sc.nextLong();
            census.add(person);
            int p = 1;
            while (p == 1) {
                System.out.println("Do you wanna continue (Y/N): ");
                sc.nextLine();
                String option = sc.nextLine();
                switch (option) {
                    case "Y", "y":
                        p = 0;
                        continue;
                    case "N", "n":
                        p = 0;
                        flag = false;
                        view();
                        break;
                    default:
                        System.out.println("Enter Valid Input");
                        break;
                }
            }
        }
    }
    public static void view(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n", "S.No", "First Name", "Last Name", "Email", "Phone Number", "Address", "Occupation", "Age", "Gender", "Aadhar");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int i = 1;
        for(PersonDetails p : census){
            System.out.format("|%-5d|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n", (i++), p.F_Name, p.L_Name, p.Email, p.Phone_number, p.address, p.Occupation, p.Age, p.Age, p.Aadhaar);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static int validate(int i, String s) {
        switch (i) {
            case 1:
                int z;
                int l = s.length();
                for (z = 0; z <= l - 1; z++) {
                    if (String.valueOf(s.charAt(z)).equals("@")) {
                        break;
                    }
                }
                if (z == l) {
                    z = 0;
                }
                String str = s.substring(z, l);
                if (str.equals("@gmail.com") || str.equals("@yahoo.com")) {
                    return 1;
                } else {
                    return -1;
                }
            case 3:
                switch (s) {
                    case "Male", "male", "MALE", "M", "m", "Female", "FEMALE", "F", "f", "female":
                        return 1;
                    default:
                        return -1;
                }
        }
        return 1;
    }
    public static int validate(int i,Long s) {
        switch (i) {
            case 2:
                if ((String.valueOf(s)).length() == 10) {
                    return 1;
                }
                return -1;
        }
        return 1;
    }
}