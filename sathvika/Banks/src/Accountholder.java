import java.util.ArrayList;
import java.util.Scanner;
public class Accountholder extends Cons{
        Scanner sc=new Scanner(System.in) ;
        public String customername;
        public String phonenumber;
        public String emailid;
        public int age;
        public String address;
        public String gender;
        public String pancard;
        public String adharcardnumber;


        public Accountholder(String bankname1,String branchname1,String customername, String phonenumber, String emailid, int age, String address,String gender, String pancard,String adhaarcardnumber)
        {
            this.bankname=bankname1;
            this.branchname=branchname1;
            this.name=name;
            this.phonenumber=phonenumber;
            this.emailid=emailid;
            this.age=age;
            this.gender=gender;
            this.pancard=pancard;
            this.adharcardnumber=adharcardnumber;
            this.address=address;
        }

        public void customer(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the Customer Name: ");
            name = sc.nextLine();
            System.out.println("enter the phonenumber:");
            phonenumber = sc.nextLine();
            System.out.println("enter your age:");
            age=sc.nextInt();
            System.out.println("enter your gender ");
            gender=sc.nextLine();
            System.out.println("enter your emailid");
            emailid= sc.nextLine();
            System.out.println("enter your pancard number");
            pancard=sc.nextLine();
            System.out.println("enter your adharcard number");
            adharcardnumber=sc.nextLine();
            System.out.println("enter your address");
            address=sc.nextLine();
        }

    }

