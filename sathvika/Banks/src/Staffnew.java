import java.util.*;
public class Staffnew extends Cons{



        public String employeeid;
        public String Designation;
        public int Salary;


        public Staffnew(String bankname,String branchname,String name1, String employeeid1,String Designation1,int Salary1)
        {

            this.name=name1;
            this.employeeid=employeeid1;
            this.Designation=Designation1;
            this.Salary=Salary1;


        }

        public void staf(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the employee Name: ");
            name = sc.nextLine();
            System.out.println("Enter the employeeid");
            employeeid = sc.nextLine();
            System.out.println("Enter employee Desigantion");
            Designation = sc.nextLine();
            System.out.println("Enter employee Salary:");
            Salary = sc.nextInt();
        }
    }

