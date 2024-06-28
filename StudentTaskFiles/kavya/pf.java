/*  Payslip Breakdown:
Base Salary: 70%
Employer PF: 9% of Base
Employee PF: 9% of Base
HRA : 50% of Base
LTA : 20%
Health Insurance : 10%

The Home = Base Salary+HRA+LTA-HI-Employee PF-Employer PF */



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
      double basicsalary=ctc*0.7;//for 70% of ctc[70/100=0.7]
      double hra=basicsalary*0.5;//for 50% of hra[50/100=0.5]
      //double pf=basicsalary*0.12;//for 12% of pf[12/100=0.12]
     double employeepf=basicsalary*0.09;//for 9% of PF[9/100=0.09]
      double employerpf=basicsalary*0.09;//for 9% of PF[9/100=0.09]
      double lta=ctc*0.2;//for 20% of PF[20/100=0.2]
      double hi=ctc*0.1;//for 10% of PF[10/100=0.1]
     
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
        //System.out.println("PF: "+pf);
        System.out.println("Employee PF: "+employeepf);
        System.out.println("Employer PF: "+employerpf);
        System.out.println("LTA: "+lta);
        System.out.println("Health Insurance: "+hi);
        System.out.println("The Home: "+(basicsalary+lta-employeepf-employeepf-hi));
    }
}


        //calculate 
		//1.basicSalary(40% of CTC)
		//2.HRA (50% of basic)
		//3.PF(12% of basic)
