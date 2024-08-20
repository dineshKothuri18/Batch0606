import java.util.ArrayList;

public class Total {

    public static void main(String[] args){

        Banks b = new Banks();
        b.bankName="PAISAL BANKUU......";
        b.branches=new ArrayList<>();

            Branch b1 = new Branch();
            b1.branchLocation = "AMMERPET";
            b1.ifsc = "AMPT12345";
            b1.employees = new ArrayList<>();

            Employee e1 = new Employee();
            e1.name = "Sumanth";
            e1.employeeId = "S12312";
            e1.designation = "Manager";
            e1.salary = 200000;
            b1.employees.add(e1);

        Employee e2 = new Employee();
        e2.name = "Akshay";
        e2.employeeId = "Ak12345";
        e2.designation = "Asst.Manager";
        e2.salary = 100000;
        b1.employees.add(e2);




            Branch b2 = new Branch();
            b2.branchLocation = "Kukatpally";
            b2.ifsc = "KPLY12345";
            b2.employees = new ArrayList<>();

            Employee e = new Employee();
            e.name = "Rahul";
            e.employeeId = "Am12345";
            e.designation = "Manger";
            e.salary = 30000;
            b2.employees.add(e);

        Employee e0= new Employee();
        e0.name = "samba";
        e0.employeeId = "SA12345";
        e0.designation = "Asst Manger";
        e0.salary = 30000;
        b2.employees.add(e0);



            b.branches.add(b1);
            b.branches.add(b2);
        for(int i =0;i<b.branches.size();i++){
            System.out.println("                    "+(i+1)+". "+"Name of the bank : "+b.bankName);
            System.out.println("                       Location of bank : "+b.branches.get(i).branchLocation);
            System.out.println("                       IFSC code Branch : "+b.branches.get(i).ifsc);
            System.out.println();
            for(int j=0;j<b.branches.get(i).employees.size();j++){
                System.out.println((j+1)+"."+"Employee Details");
                System.out.println("Name of the Employee : "+b.branches.get(i).employees.get(j).name);
                System.out.println("Employee ID : "+b.branches.get(i).employees.get(j).employeeId);
                System.out.println("Designation of employee : "+b.branches.get(i).employees.get(j).designation);
                System.out.println("Salary : "+b.branches.get(i).employees.get(j).salary);
                System.out.println("------------------------------------");
            }
        }

    }
}
