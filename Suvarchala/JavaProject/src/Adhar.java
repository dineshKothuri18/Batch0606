import java.util.*;

public class Adhar {
    public static ArrayList<HashMap<String,String>> people=new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;

        while(flag){
            System.out.println("1. Add people details\n2. View people details\n3. Delete a person details\n4. edit the person details\n5. Exit");
            System.out.println("select the options :");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("enter the no of people to enter the details: ");
                    int noofpeople = sc.nextInt();
                    int count=0;
                    for (int i = 0; i < noofpeople; i++) {
                        peoplefun();
                        count=count+1;
                        if(count==noofpeople) {
                            break;
                        }
                            System.out.println("select the option: ");
                            System.out.println("1.continue\n2.Exit");

                        int op=sc.nextInt();
                        if(op==2){
                            break;
                        }
                    }
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    referncetoselect();
                    System.out.println("select the person number to delete:  ");
                    int deno = sc.nextInt();
                    deletee(deno-1);
                    break;
                case 4:
                    referncetoselect();

                    System.out.println("select the person number to update: ");
                    int upno = sc.nextInt();

                    HashMap<String, String> people1 = people.get(upno - 1);
                    System.out.println("enter your first name : ");
                    String firstname=sc.nextLine();
                    sc.nextLine();
                    System.out.println("enter your Last name : ");
                    String lastname=sc.nextLine();
                    System.out.println("enter your Email-id : ");
                    String emailid=sc.nextLine();
                    System.out.println("enter your phone number : ");
                    String phonenumber=sc.nextLine();
                    System.out.println("enter your address  : ");
                    String address=sc.nextLine();
                    System.out.println("enter your occupation : ");
                    String occupation=sc.nextLine();
                    System.out.println("enter your Gender : ");
                    String gender=sc.nextLine();
                    System.out.println("enter your age : ");
                    String age=sc.nextLine();
                    System.out.println("enter your Adharnumber : ");
                    String Adharnumber=sc.nextLine();

                    people1.put("firstname:",firstname);
                    people1.put("lastname:",lastname);
                    people1.put("emailid:",emailid);
                    people1.put("phonenumber:",phonenumber);
                    people1.put("address:",address);
                    people1.put("occupation:",occupation);
                    people1.put("gender:",gender);
                    people1.put("age:",age);
                    people1.put("adharnumber:",Adharnumber);

                    people.set(upno - 1, people1);

                    view();
                    System.out.println("your details are updated successfully");
                    System.out.println("_____________________________________________________________________________________");
                    break;
                case 5:
                    flag = false;
                    break;
            }

        }



    }
    public static void peoplefun(){
        Scanner sc1=new Scanner(System.in);
        HashMap<String, String> peoplehashmap = new HashMap<>();
        System.out.println("enter your first name : ");
        String firstname=sc1.nextLine();
        System.out.println("enter your Last name : ");
        String lastname=sc1.nextLine();
        System.out.println("enter your Email-id : ");
        String emailid=sc1.nextLine();
        System.out.println("enter your phone number : ");
        String phonenumber=sc1.nextLine();
        System.out.println("enter your address  : ");
        String address=sc1.nextLine();
        System.out.println("enter your occupation : ");
        String occupation=sc1.nextLine();
        System.out.println("enter your Gender : ");
        String gender=sc1.nextLine();
        System.out.println("enter your age : ");
        String age=sc1.nextLine();
        System.out.println("enter your Adharnumber : ");
        String Adharnumber=sc1.nextLine();

        peoplehashmap.put("firstname:",firstname);
        peoplehashmap.put("lastname:",lastname);
        peoplehashmap.put("emailid:",emailid);
        peoplehashmap.put("phonenumber:",phonenumber);
        peoplehashmap.put("address:",address);
        peoplehashmap.put("occupation:",occupation);
        peoplehashmap.put("gender:",gender);
        peoplehashmap.put("age:",age);
        peoplehashmap.put("adharnumber:",Adharnumber);

        people.add(peoplehashmap);

    }
    public static void view() {
        System.out.println("_______________________________________________________________________________________________");
        int peoplecount = 0;
        for (HashMap<String, String> All : people) {
            System.out.println("**  person number :" + (peoplecount = peoplecount + 1) + "  **");
            System.out.println("firstname-" + All.get("firstname:"));
            System.out.println("lastname-" + All.get("lastname:"));
            System.out.println("emailid-" + All.get("emailid:"));
            System.out.println("phonenumber-" + All.get("phonenumber:"));
            System.out.println("address-" + All.get("address:"));
            System.out.println("occupation-" + All.get("occupation:"));
            System.out.println("gender-" + All.get("gender:"));
            System.out.println("age-" + All.get("age:"));
            System.out.println("adharnumber-" + All.get("adharnumber:"));
            System.out.println();
        }
        System.out.println("_______________________________________________________________________________________________");
    }
    public static void deletee(int dno) {
        people.remove(dno);
        System.out.println("*****  "+"person number: "+dno+"  is deleted successfully  ****");
        System.out.println("_______________________________________________________________________________________________");
    }
    public static void referncetoselect() {
        System.out.println("_______________________________________________________________________________________________");
        int personnumber = 0;
        for (HashMap<String, String> All : people) {
            System.out.println("**  person number :" + (personnumber = personnumber + 1) + "  **");
            System.out.print("Name:" + All.get("firstname:")+" ");
            System.out.print(All.get("lastname:")+" ");
            System.out.println();

        }
        System.out.println("_______________________________________________________________________________________________");
    }
}
