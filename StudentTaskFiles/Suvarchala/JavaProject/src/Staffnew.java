
import java.util.ArrayList;
import java.util.Scanner;

public class Staffnew
{
    Scanner sc=new Scanner(System.in) ;
    public String employeename;
    public String employeeid;
    public String Designation;
    public int Salary;
    public String bankname;
    public String branchname;
    public int count;


    public Staffnew(String bankname,String branchname,String employeename1, String employeeid1,String Designation1,int Salary1,int count1)
    {


        this.employeename=employeename1;
        this.employeeid=employeeid1;
        this.Designation=Designation1;
        this.Salary=Salary1;
        this.count=count1;
        this.bankname=bankname;
        this.branchname=branchname;
    }

    public void staf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee Name: ");
        employeename = sc.nextLine();

        System.out.println("Enter employee Desigantion");
        Designation = sc.nextLine();
        System.out.println("Enter employee Salary:");
        Salary = sc.nextInt();
        count++;
        System.out.println("your employee id:20fewww"+count);
        System.out.println("your account is successfully created.");


    }
}




