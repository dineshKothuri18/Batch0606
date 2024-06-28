/* calculate 
	1.basicSalary(40% of CTC)
	2.HRA (50% of basic)
	3.PF(12% of basic)  */


import java.util.Scanner;
public class Payslip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter employee Name:");
      String ename=sc.nextLine();
         System.out.println("Enter employee Age:");
      String eage=sc.nextLine();
         System.out.println("Enter employee Email:");
      String eemail=sc.nextLine();
         System.out.println("Enter employee Address:");
      String eaddress=sc.nextLine();
         System.out.println("Enter employee Phone:");
      String ephone=sc.nextLine();
         System.out.println("Enter employee Designation:");
      String edesignation=sc.nextLine();
         System.out.println("Enter employee company Name:");
      String ecompanyname=sc.nextLine();
         System.out.println("Enter employee DOJ:");
      String edoj=sc.nextLine();
      System.out.println("Enter CTC: ");
      double ctc=sc.nextDouble();
      double basicsalary=ctc*0.4;//for 40% of ctc[40/100=0.4]
      double hra=basicsalary*0.5;//for 50% of hra[50/100=0.5]
      double pf=basicsalary*0.12;//for 12% of pf[12/100=0.12]
       
     
        System.out.println("..................................................");
        System.out.println("        EMPLOYEE DETAILS");
        System.out.println("Name: "+ename);
        System.out.println("Age: "+eage);
        System.out.println("Email: "+eemail);
        System.out.println("Address: "+eaddress);
        System.out.println("Phone: "+ephone);
        System.out.println("Designation: "+edesignation);
        System.out.println("Company Name: "+ecompanyname);
        System.out.println("Date of Joined: "+edoj);
        System.out.println("CTC: "+ctc);
        System.out.println("Basic Salary: "+basicsalary);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
    }
}


        