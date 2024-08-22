import java.util.Scanner;

public class Accountholder {
    Scanner sc=new Scanner(System.in) ;
    public String customername;
    public String phonenumber;
    public String emailid;
    public int age;
    public String address;
    public String gender;
    public String pancard;
    public String adharcardnumber;
    public String bank;
    public String branch;
    public int count=0;

    public Accountholder(String bank,String branch,String customername, String phonenumber, String emailid, int age, String address,String gender, String pancard,String adharcardnumber,int count)
    {
        this.customername=customername;
        this.phonenumber=phonenumber;
        this.emailid=emailid;
        this.age=age;
        this.gender=gender;
        this.pancard=pancard;
        this.adharcardnumber=adharcardnumber;
        this.address=address;
        this.count=count;
        this.bank=bank;
        this.branch=branch;
    }

    public void customer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Customer Name: ");
        customername = sc.nextLine();
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
        System.out.println("your account is successfully created.");
        count++;
    }

}
