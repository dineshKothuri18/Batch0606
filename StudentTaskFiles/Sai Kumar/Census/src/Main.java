
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static HashMap<String,HashMap<String,String>> User;


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        User=new HashMap<>();
        System.out.println("1");
        Adduser();
        int terminarte=1;
        do {
            view();
            System.out.println("choose a option: ");
            System.out.println("Add new user-1");
            System.out.println("Edit details of a User-2");
            System.out.println("Delete a User-3");
            System.out.println("Exit-4");
            System.out.println("Enter the option:");
            int i=scan.nextInt();
            switch (i){
                case 1:
                    Adduser();
                    break;
                case 2:
                    Edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    terminarte=0;
                default:
                    System.out.println("Choose the crct option");
            }

        }while(terminarte>0);


    }

    public static void Adduser(){
        HashMap<String,String> Details=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter user details");
        System.out.println("Enter the aadhar number");
        String aadhar=scan.nextLine();
        if(aadhar.length()!=12){
            System.out.println("The aadhar number has 12 digits please check the entered number and reenter");
            Adduser();
            return ;
        }
        System.out.println("Enter the frist name");
        String fName=scan.nextLine();
        Details.put("fName",fName);
        System.out.println("Enter the last name ");
        String LName=scan.nextLine();
        Details.put("LName",LName);
        System.out.println("Enter the Email:");
        String email=scan.nextLine();
        boolean f= false;
        while(! f){
            f=Validation(1,email);
            if(!f){
                System.out.println("Enter the correct mail:");
                email=scan.nextLine();
            }
        }
        Details.put("email",email);
        System.out.println("Enter the phone number:");
        String phone=scan.nextLine();
        f= false;
        while(! f){
            f=Validation(2,phone);
            if(!f){
                System.out.println("Enter the correct phone number:");
                phone=scan.nextLine();
            }
        }
        Details.put("phone",phone);
        System.out.println("Enter Address:");
        String address=scan.nextLine();
        Details.put("address",address);
        System.out.println("Enter the occupation:");
        String Occupation=scan.nextLine();
        Details.put("Occupation",Occupation);
        System.out.println("Enter the age");
        String age=scan.nextLine();
        f= false;
        while(! f){
            f=Validation(3,age);
            if(!f){
                System.out.println("Enter the correct age:");
                age=scan.nextLine();
            }
        }
        Details.put("age",age);
        System.out.println("Enter the gender");
        String gender=scan.nextLine();
        f= false;
        while(! f){
            f=Validation(4,gender);
            if(!f){
                System.out.println("Enter the correct gender:");
                gender=scan.nextLine();
            }
        }
        Details.put("gender",gender);

        if(User.containsKey(aadhar)){
            System.out.println("The details of your aadhar is in database Please choose the option edit details or delete option:");

        }
        else{
            User.put(aadhar,Details);
        }




    }

    public static void Edit(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Aadhar number you want to Edit ");
        String aadhar=scan.nextLine();
        boolean f= false;
        if(User.containsKey(aadhar)){
            int i=1;
            do{
                System.out.println("Please choose the option who want to edit");
                System.out.println("1   -    Frist Name");
                System.out.println("2   -    Last Name");
                System.out.println("3   -    email");
                System.out.println("4   -    phone number");
                System.out.println("5   -    Address");
                System.out.println("6   -    Occupation");
                System.out.println("7   -    age");
                System.out.println("8   -    gender");
                System.out.println("9   -    break");
                int case1=scan.nextInt();
                switch (case1){
                    case 1:
                        System.out.println("Enter new Fristname");
                        scan.nextLine();
                        String fName=scan.nextLine();
                        User.get(aadhar).replace("fName",User.get(aadhar).get("fName"),fName);
                        break;
                    case 2:
                        System.out.println("Enter new Last name");
                        scan.nextLine();

                        String lName=scan.nextLine();
                        User.get(aadhar).replace("LName",User.get(aadhar).get("LName"),lName);
                        break;
                    case 3:
                        System.out.println("Enter new Email");
                        scan.nextLine();

                        String email=scan.nextLine();

                        while(! f){
                            f=Validation(1,email);
                            if(!f){
                                System.out.println("Enter the correct mail:");
                                email=scan.nextLine();
                            }
                        }
                        User.get(aadhar).replace("email",User.get(aadhar).get("email"),email);
                        f=false;
                        break;
                    case 4:
                        System.out.println("Enter new phone number");
                        scan.nextLine();

                        String phone=scan.nextLine();

                        while(! f){
                            f=Validation(2,phone);
                            if(!f){
                                System.out.println("Enter the correct Phone number of 10digits:");
                                phone=scan.nextLine();
                            }
                        }
                        User.get(aadhar).replace("phone",User.get(aadhar).get("phone"),phone);
                        f=false;

                        break;
                    case 5:
                        System.out.println("Enter new address");
                        scan.nextLine();

                        String address=scan.nextLine();
                        User.get(aadhar).replace("address",User.get(aadhar).get("address"),address);
                        break;
                    case 6:
                        System.out.println("Enter new Occupation");
                        scan.nextLine();

                        String Occupation=scan.nextLine();
                        User.get(aadhar).replace("Occupation",User.get(aadhar).get("Occupation"),Occupation);
                        break;
                    case 7:
                        System.out.println("Enter new age");
                        scan.nextLine();

                        String age=scan.nextLine();
                        f= false;
                        while(! f){
                            f=Validation(3,age);
                            if(!f){
                                System.out.println("Enter the correct age:");
                                age=scan.nextLine();
                            }
                        }
                        User.get(aadhar).replace("age",User.get(aadhar).get("age"),age);
                        f=false;

                        break;
                    case 8:
                        System.out.println("Enter new gender");
                        scan.nextLine();

                        String gender=scan.nextLine();
                        f= false;
                        while(! f){
                            f=Validation(4,gender);
                            if(!f){
                                System.out.println("Enter the correct gender:");
                                gender=scan.nextLine();
                            }
                        }
                        User.get(aadhar).replace("gender",User.get(aadhar).get("gender"),gender);
                        f=false;

                        break;

                    case 9:
                        i=0;
                        break;

                    default:
                        System.out.println("choose the crct  option:");

                }

            }while (i>0);
        }
        else{
            System.out.println("Enter correct the aadhar number:");
            Edit();
        }
    }

    public static void delete(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Aadhar number you want to delete ");
        String aadhar=scan.nextLine();
        if(User.containsKey(aadhar)){
            User.remove(aadhar);
        }
        else{
            System.out.println("Entered aadhar number not in the database");
        }

    }

    public  static  void view(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n","S.No","First Name","Last Name","Email","Phone Number","Address","Occupation","Age","Gender","Aadhar");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int i = 1;
        for (String Name: User.keySet()) {
            System.out.format("|%-5d|%-25s|%-25s|%-30s|%-15s|%-20s|%-20s|%-8s|%-10s|%-25s|\n",(i++),User.get(Name).get("fName"),User.get(Name).get("LName"),User.get(Name).get("email"),User.get(Name).get("phone"),User.get(Name).get("address"),User.get(Name).get("Occupation"),User.get(Name).get("gender"),User.get(Name).get("age"),Name);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static boolean Validation(int i,String Data){
        boolean flag=false;
        switch (i){
            case 1:
                String[] Emailsets={"gmail.com","hotmail.com","yahoo.com","outlook.com"};
                String[] Array1=Data.split("@");

                if (Array1.length==2) {
                    flag = Arrays.stream(Emailsets).anyMatch(N -> N.equals(Array1[1]));

                }
                else{
                    flag=false;
                }
                break;
            case 2:
                if(Data.length()==10){
                    flag=true;
                }
                else{
                    flag=false;
                }
                break;

            case 3:
                try {
                    int val = Integer.parseInt(Data);
                    if (val<100){
                        flag=true;
                    }
                    else{
                        flag=false;
                    }
                }
                catch (NumberFormatException e) {

                    // This is thrown when the String
                    // contains characters other than digits
                    System.out.println("Invalid String");
                    flag=false;
                }


                break;
            case 4:
                String data1=Data.toLowerCase();
                if (data1.equals("male") || data1.equals("female")){
                    flag=true;
                }
                else{
                    flag=false;
                }
                break;




        }
        return flag;
    }
}