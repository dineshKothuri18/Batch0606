/*Write a programe to calculate basic payslip of an employee 22-06-2024
	take name,age,email,address,phone,designation,companyname,doj,CTC 

	calculate 
		1.basicSalary(40% of CTC)
		2.HRA (50% of basic)
		3.PF(12% of basic)
*/


import java.util.Scanner;
public class Payslip{
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
            System.out.println("please enter basicsalary");
            String basicsalary = sc.nextLine();
            System.out.println("please enter HRA");
            double  HRA = sc.nextDouble();
            System.out.println("please enter PF");
            double PF = sc.nextDouble();
            
            
            
            
            double basicSalary = CTC * 0.4;
            double hraCalculated = basicSalary * 0.5;
            double pfCalculated = basicSalary * 0.12;
            double totalSalary = basicSalary + hraCalculated + pfCalculated;
            
            
        
		     
		    System.out.println("name:"+Name);
		    System.out.println("age:"+age);
		    System.out.println("email:"+email);
		    System.out.println("address:"+address);
		    System.out.println("mobilenum:"+mobilenum);
		    System.out.println(" designation:"+designation);
		    System.out.println("enter companyname :"+ companyname);
		    System.out.println("doj:"+ doj);
		    System.out.println("CTC:"+ CTC);
		    System.out.println("basicsalary:"+ basicsalary);
		    System.out.println("HRA :"+ HRA);
		    System.out.println("PF :"+ PF);
		    
		   
		 
    
    }

}
