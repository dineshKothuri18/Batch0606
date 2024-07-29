import java.util.*;
public class Main1 {
    public static void main(String[]args){

        Bank B=new Bank();
            B.bankname = "SBI BANK";
            B.branches = new ArrayList<>();

            Branch b1 = new Branch();
            b1.Branchname = "Ameerpet";
            b1.Ifsc = "ALLA0211956";
            b1.location = "Hyderbad";
            b1.Staffs = new ArrayList<>();

            Branch b2 = new Branch();
            b2.Branchname = "Kphb";
            b2.Ifsc = "ALLA0211957";
            b2.location = "Hyderbad";
            b2.Staffs = new ArrayList<>();

            Branch b3 = new Branch();
            b3.Branchname = "Bhavanipuram";
            b3.Ifsc = "ALLA0211958";
            b3.location = "Vijayawada";
            b3.Staffs = new ArrayList<>();

            Staff e1 = new Staff();
            e1.employeename = "sathvika";
            e1.employeeid = "601";
            e1.desigination = "Manager";
            e1.salary = "500000";
            b1.Staffs.add(e1);

            Staff e2 = new Staff();
            e2.employeename = "SaiKumar";
            e2.employeeid = "602";
            e2.desigination = "Assiant manger";
            e2.salary = "45000";
            b1.Staffs.add(e2);

            Staff e3 = new Staff();
            e3.employeename = "Rahul";
            e3.employeeid = "603";
            e3.desigination = "Cashier";
            e3.salary = "35000";
            b1.Staffs.add(e3);


        e1 = new Staff();
        e1.employeename = "sumanth";
        e1.employeeid = "701";
        e1.desigination = "Manager";
        e1.salary = "500000";
        b2.Staffs.add(e1);

        e2 = new Staff();
        e2.employeename = "Deepa";
        e2.employeeid = "702";
        e2.desigination = "Assiant manger";
        e2.salary = "45000";
        b2.Staffs.add(e2);

        e3 = new Staff();
        e3.employeename = "Suvarchala";
        e3.employeeid = "703";
        e3.desigination = "manager of accountant";
        e3.salary = "35000";
        b2.Staffs.add(e3);

        e1 = new Staff();
        e1.employeename = "kavya";
        e1.employeeid = "801";
        e1.desigination = "Manager";
        e1.salary = "500000";
        b3.Staffs.add(e1);

        e2 = new Staff();
        e2.employeename = "vijaya";
        e2.employeeid = "802";
        e2.desigination = "Assiant manger";
        e2.salary = "45000";
        b3.Staffs.add(e2);

        e3 = new Staff();
        e3.employeename = "Mohith";
        e3.employeeid = "803";
        e3.desigination = "loan officer";
        e3.salary = "55000";
        b3.Staffs.add(e3);
            B.branches.add(b1);
            B.branches.add(b2);
            B.branches.add(b3);

            for(int i = 0;i<B.branches.size();i++){
                System.out.println("   welcome to SBI Bank");
                System.out.println("Employee of Branch "+(i+1));
                System.out.println("Branchname :"+B.branches.get(i).Branchname);
                System.out.println("IFSC Code :"+B.branches.get(i).Ifsc);
                System.out.println("Location :"+B.branches.get(i).location);;
                System.out.println();
                for(int j = 0;j<B.branches.get(i).Staffs.size();j++) {
                    System.out.println("employee name: "+B.branches.get(i).Staffs.get(j).employeename);;
                    System.out.println("employee id: "+B.branches.get(i).Staffs.get(j).employeeid);
                    System.out.println("employee desigination : "+B.branches.get(i).Staffs.get(j).desigination);
                    System.out.println("employee salary: "+B.branches.get(i).Staffs.get(j).salary);
                    System.out.println("*********************************************");

                }
                System.out.println();
            }




}
}

