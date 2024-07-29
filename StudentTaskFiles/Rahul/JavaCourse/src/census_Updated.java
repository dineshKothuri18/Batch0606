import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class census_Updated {
    public static ArrayList<HashMap<String, String>> census;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        details();
        boolean flag = true;
        while (flag) {
            System.out.println("Do you want make any changes choose one options below:");
            System.out.println("1. Delete");
            System.out.println("2. Update");
            System.out.println("3. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please Enter the Aadhaar number of the person");
                    sc.nextLine();
                    String s = sc.nextLine();
                    int i = FindIndex(s);
                    if (i == -1) {
                        System.out.println("Record not found");
                    } else {
                        delete_record(i);
                        view();
                    }
                    break;
                case 2:
                    System.out.println("Please Enter the Aadhaar number of the person to be upated");
                    sc.nextLine();
                    String s1 = sc.nextLine();
                    int i1 = FindIndex(s1);
                    if (i1 == -1) {
                        System.out.println("Record not found");
                    } else {
                        update_record(i1);
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please Enter a valid Input");
                    break;
            }
        }
    }

    public static int validate(int i, String s) {
        switch (i) {
            case 1:
                int z = 0;
                int l = s.length();
                for (z = 0; z <= l - 1; z++) {
                    if (String.valueOf(s.charAt(z)).equals(String.valueOf("@"))) {
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
            case 2:
                if (s.length() == 10) {
                    return 1;
                }
                return -1;
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

    public static void delete_record(int i) {
        HashMap<String, String> hm = census.get(i);
        String s = hm.get("Aadhaar_number");
        census.remove(i);
        System.out.println("The record with Aadhaar number " + s + " is deleted");
    }

    public static void update_record(int i) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = census.get(i);
        boolean flag = true;
        while (flag) {
            System.out.println("Choose what do you wanna update from the following");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Email");
            System.out.println("4. phone number");
            System.out.println("5. Address");
            System.out.println("6. Occupation");
            System.out.println("7. Age");
            System.out.println("8. Gender");
            System.out.println("9. Exit");
            int p = sc.nextInt();
            switch (p) {
                case 1:
                    System.out.println("Existing Item name is: " + hm.get("F_Name"));
                    System.out.println("Please Enter new First Name");
                    sc.nextLine();
                    String F_Name = sc.nextLine();
                    hm.replace("F_Name", hm.get("F_Name"), F_Name);
                    view();
                    break;
                case 2:
                    System.out.println("Existing Last name is: " + hm.get("L_Name"));
                    System.out.println("Please Enter new Last Name");
                    sc.nextLine();
                    String L_Name = sc.nextLine();
                    hm.replace("L_Name", hm.get("L_Name"), L_Name);
                    view();
                    break;
                case 3:
                    System.out.println("Existing Email is: " + hm.get("Email"));
                    System.out.println("Please Enter new Email");
                    sc.nextLine();
                    String Email = sc.nextLine();
                    hm.replace("Email", hm.get("Email"), Email);
                    view();
                    break;
                case 4:
                    System.out.println("Existing phone_number is: " + hm.get("phone_number"));
                    System.out.println("Please Enter new phone_number");
                    sc.nextLine();
                    String phone_number = sc.nextLine();
                    hm.replace("phone_number", hm.get("phone_number"), phone_number);
                    view();
                    break;
                case 5:
                    System.out.println("Existing address is: " + hm.get("address"));
                    System.out.println("Please Enter new address");
                    sc.nextLine();
                    String address = sc.nextLine();
                    hm.replace("address", hm.get("address"), address);
                    view();
                    break;
                case 6:
                    System.out.println("Existing occupation is: " + hm.get("occupation"));
                    System.out.println("Please Enter new occupation");
                    sc.nextLine();
                    String occupation = sc.nextLine();
                    hm.replace("occupation", hm.get("occupation"), occupation);
                    view();
                    break;
                case 7:
                    System.out.println("Existing age is: " + hm.get("age"));
                    System.out.println("Please Enter new age");
                    sc.nextLine();
                    String age = sc.nextLine();
                    hm.replace("age", hm.get("age"), age);
                    view();
                    break;
                case 8:
                    System.out.println("Existing gender is: " + hm.get("gender"));
                    System.out.println("Please Enter new gender");
                    sc.nextLine();
                    String gender = sc.nextLine();
                    hm.replace("gender", hm.get("gender"), gender);
                    view();
                    break;
                case 9:
                    flag = false;
                    view();
                    break;
                default:
                    System.out.println("Please Enter the  valid Input");
                    break;
            }


        }

    }

    public static void details() {
        Scanner sc = new Scanner(System.in);
        census = new ArrayList<>();
        boolean flag = true;
        int i = 0;
        while (flag) {
            System.out.println("Please Enter the " + (++i) + " person details");
            System.out.println("Please Enter Your First Name: ");
            String F_Name = sc.nextLine();
            System.out.println("Please Enter Your Last Name: ");
            String L_Name = sc.nextLine();
            System.out.println("Please Enter Your Email: ");
            String Email = sc.nextLine();
            int val = validate(1, Email);
            while (val == -1) {
                System.out.println("Please Enter a valid Email");
                Email = sc.nextLine();
                val = validate(1, Email);
            }

            System.out.println("Please Enter Your Phone number: ");
            String phone_number = sc.nextLine();
            int valu = validate(2, phone_number);
            while (valu == -1) {
                System.out.println("Please Enter a valid phone number");
                phone_number = sc.nextLine();
                valu = validate(2, phone_number);
            }
            System.out.println("Please Enter Your Address: ");
            String address = sc.nextLine();
            System.out.println("Please Enter Your Occupation: ");
            String occupation = sc.nextLine();
            System.out.println("Please Enter Your Age: ");
            String age = sc.nextLine();
            System.out.println("Please Enter Your Gender: ");
            String gender = sc.nextLine();
            int value = validate(3, gender);
            while (value == -1) {
                System.out.println("Please Enter a valid Gender");
                gender = sc.nextLine();
                value = validate(3, gender);
            }

            System.out.println("Please Enter Your Aadhaar_number: ");
            String Aadhaar_number = sc.nextLine();
            HashMap<String, String> person = new HashMap<>();
            person.put("F_Name", F_Name);
            person.put("L_Name", L_Name);
            person.put("Email", Email);
            person.put("phone_number", phone_number);
            person.put("address", address);
            person.put("occupation", occupation);
            person.put("age", age);
            person.put("gender", gender);
            person.put("Aadhaar_number", Aadhaar_number);
            census.add(person);
            int p = 1;
            while (p == 1) {
                System.out.println("Do you wanna continue (Y/N): ");
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

    public static int FindIndex(String s) {
        for (int i = 0; i < census.size(); i++) {
            HashMap<String, String> hm = census.get(i);
            if (hm.containsValue(s)) {
                return i;
            }
        }
        return -1;
    }

    public static void view() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n", "S.No", "First Name", "Last Name", "Email", "Phone Number", "Address", "Occupation", "Age", "Gender", "Aadhar");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int i = 1;
        for (HashMap<String, String> map : census) {
            System.out.format("|%-5d|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n", (i++), map.get("F_Name"), map.get("L_Name"), map.get("Email"), map.get("phone_number"), map.get("address"), map.get("occupation"), map.get("age"), map.get("gender"), map.get("Aadhaar_number"));
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}

