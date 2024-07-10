
/*Payslip Breakdown:     21-06-2024
Base Salary: 70%
Employer PF: 9% of Base
Employee PF: 9% of Base
HRA : 50% of Base
LTA : 20%
Health Insurance : 10%
*/
The Home = Base Salary+HRA+LTA-HI-Employee PF-Employer PF

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Name");
            String Name = sc.nextLine();
            System.out.println("Please enter age:");
            String age = sc.nextLine();
            System.out.println("please enter email:");
            String email = sc.nextLine();
            System.out.println("please enter address:");
            String address = sc.nextLine();
            System.out.println("please enter mobilenum :");
            String mobilenum = sc.nextLine();
            System.out.println("please enter designation");
            String designation = sc.nextLine();
            System.out.println("please enter companyname");
            String companyname = sc.nextLine();
            System.out.println("please enter doj");
            String doj = sc.nextLine();
            System.out.println("please enter CTC");
            double  CTC = sc.nextDouble();
            double basicSalary = CTC*0.7;
            double HRA = basicSalary *0.5;
            double EmployerPF = basicSalary *0.09;
            double EmployeePF = basicSalary *0.09;
            double LTA = CTC*0.2;
            double HI = CTC*0.1;
            
    
		    System.out.println("name:"+Name);
		    System.out.println("age:"+age);
		    System.out.println("email:"+email);
		    System.out.println("address:"+address);
		    System.out.println("mobilenum:"+mobilenum);
		    System.out.println("designation:"+designation);
		    System.out.println("enter companyname :"+companyname);
		    System.out.println("doj:"+ doj);
		    System.out.println("CTC:"+ CTC);
		    System.out.println("basicsalary:"+basicSalary);
		    System.out.println("HRA :"+ HRA);
		    System.out.println("Employer PF :"+EmployerPF);
		    System.out.println("Employee PF :"+EmployeePF);
		    System.out.println("LTA :"+LTA);
		    System.out.println("HI:"+HI);
    }
}
	    