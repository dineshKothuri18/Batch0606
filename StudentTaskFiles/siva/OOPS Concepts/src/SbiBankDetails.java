import java.util.ArrayList;

public class SbiBankDetails {
    public static void main(String[]args){
        System.out.println();
        System.out.println("           STATE BANK OF INDIA     ");
        System.out.println();

        BranchNames branchName = new BranchNames();
        branchName.name1="EdlapaduBranch";
        branchName.name2 ="ChilakaluripetBranch";
        branchName.name3 = "NarasaravpetBranch";

        branchName.branchDetail=new ArrayList<>();

        //EDLAPADU BRANCH DETAILS
        BranchDetails branchDetails1=new BranchDetails();
        branchDetails1.ifscCode="SBIN0003726";

        branchDetails1.address=new ArrayList<>();
        BranchAddress branchAddress1 =new BranchAddress();
        branchAddress1.city="Edlapadu";
        branchAddress1.colony="Baipas Road";
        branchAddress1.flatNo="1-2-67";
        branchAddress1.pinCode=522233;

        branchDetails1.employee = new ArrayList<>();
        EmployeDetails employee1 = new EmployeDetails();
        employee1.name="Sai Kiran";
        employee1.id="Sbi123";
        employee1.designation="Manager";
        employee1.salary="20000";

        employee1.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail1= new EmployeeAddressDetail();
        addressDetail1.villageName="Edlapadu";
        addressDetail1.houseNo="12-10";
        addressDetail1.pinCode="522233";



        EmployeDetails employee2 = new EmployeDetails();
        employee2.name="Shiva";
        employee2.id="Sbi1328";
        employee2.designation="Accountend";
        employee2.salary="15000";

        employee2.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail2 = new EmployeeAddressDetail();
        addressDetail2.villageName="Guntur";
        addressDetail2.houseNo="27-10-1";
        addressDetail2.pinCode="522001";

        branchName.branchDetail.add(branchDetails1);
        branchDetails1.address.add(branchAddress1);
        branchDetails1.employee.add(employee1);
        employee1.address.add(addressDetail1);

        branchDetails1.employee.add(employee2);
        employee2.address.add(addressDetail2);

        //CHILAKALURIPET BRNACH DETAILS
        BranchDetails branchDetails2=new BranchDetails();
        branchDetails2.ifscCode="SBIN0020507";

        branchDetails2.address=new ArrayList<>();
        BranchAddress branchAddress2 =new BranchAddress();
        branchAddress2.city="Chilakaluripet";
        branchAddress2.colony="NRT Center";
        branchAddress2.flatNo="1-0";
        branchAddress2.pinCode=522616;

        branchDetails2.employee = new ArrayList<>();
        EmployeDetails employee3 = new EmployeDetails();
        employee3.name="Sai Deepa";
        employee3.id="Sbi1053";
        employee3.designation="Manager";
        employee3.salary="50000";

        employee3.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail3= new EmployeeAddressDetail();
        addressDetail3.villageName="Timmapuram";
        addressDetail3.houseNo="27-1";
        addressDetail3.pinCode="522233";



        EmployeDetails employee4 = new EmployeDetails();
        employee4.name="Sai Kiran";
        employee4.id="Sbi128";
        employee4.designation="Cash Manager";
        employee4.salary="17000";

        employee4.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail4 = new EmployeeAddressDetail();
        addressDetail4.villageName="Boyapalem";
        addressDetail4.houseNo="10-1";
        addressDetail4.pinCode="522233";

        branchName.branchDetail.add(branchDetails2);
        branchDetails2.address.add(branchAddress2);
        branchDetails2.employee.add(employee3);
        employee3.address.add(addressDetail3);

        branchDetails2.employee.add(employee4);
        employee4.address.add(addressDetail4);

        //NARASARAOPET BRANCH DETAILS
        BranchDetails branchDetails3=new BranchDetails();
        branchDetails3.ifscCode="SBIN0000884";

        branchDetails3.address=new ArrayList<>();
        BranchAddress branchAddress3 =new BranchAddress();
        branchAddress3.city="Nrasaropet";
        branchAddress3.colony="Saradhamma Cinema Hall Frent Line";
        branchAddress3.flatNo="27-30";
        branchAddress3.pinCode=522601;

        branchDetails3.employee = new ArrayList<>();
        EmployeDetails employee5 = new EmployeDetails();
        employee5.name="Suvarchala";
        employee5.id="Sbi502";
        employee5.designation="Manager";
        employee5.salary="50000";

        employee5.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail5= new EmployeeAddressDetail();
        addressDetail5.villageName="Ganapavaram";
        addressDetail5.houseNo="27-1";
        addressDetail5.pinCode="522234";

        EmployeDetails employee6 = new EmployeDetails();
        employee6.name="Sathvika";
        employee6.id="SBIN188";
        employee6.designation="Assistent Manager";
        employee6.salary="18000";

        employee6.address=new ArrayList<>();
        EmployeeAddressDetail addressDetail6 = new EmployeeAddressDetail();
        addressDetail6.villageName="Vijayawada";
        addressDetail6.houseNo="10-32-8";
        addressDetail6.pinCode="520001";

        branchName.branchDetail.add(branchDetails3);
        branchDetails3.address.add(branchAddress3);
        branchDetails3.employee.add(employee5);
        employee5.address.add(addressDetail5);

        branchDetails3.employee.add(employee6);
        employee6.address.add(addressDetail6);

        System.out.println("Branch Details ::");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Branch Name      :"+branchName.name1);
        System.out.println("Branch IFSC code :"+branchName.branchDetail.get(0).ifscCode);
        System.out.println("Address :"+branchDetails1.address.get(0).flatNo+","+branchDetails1.address.get(0).colony+","+branchDetails1.address.get(0).city+","+branchDetails1.address.get(0).pinCode);
        System.out.println();
        System.out.println(branchName.name1+" "+ "EmployeDetails   :" );
        System.out.println("#Employee 1");
        System.out.println("Name        :"+branchDetails1.employee.get(0).name);
        System.out.println("Id          :"+branchDetails1.employee.get(0).id);
        System.out.println("Designation :"+branchDetails1.employee.get(0).designation);
        System.out.println("Salary      :"+branchDetails1.employee.get(0).salary+"/-");
        System.out.println("Employee Address :"+employee1.address.get(0).houseNo+","+employee1.address.get(0).villageName+","+employee1.address.get(0).pinCode);
//        System.out.println("Village Name  :"+employee1.address.get(0).villageName);
//        System.out.println("House No      :"+employee1.address.get(0).houseNo);
//        System.out.println("PinCode       :"+employee1.address.get(0).pinCode);
        System.out.println();
        System.out.println("#Employee 2");
        System.out.println("Name        :"+branchDetails1.employee.get(1).name);
        System.out.println("Id          :"+branchDetails1.employee.get(1).id);
        System.out.println("Designation :"+branchDetails1.employee.get(1).designation);
        System.out.println("Salary      :"+branchDetails1.employee.get(1).salary+"/-");
        System.out.println("Employee Address :"+employee2.address.get(0).houseNo+","+employee2.address.get(0).villageName+","+employee2.address.get(0).pinCode);
        System.out.println();
//        System.out.println("Village Name :"+employee2.address.get(0).villageName);
//        System.out.println("House No :"+employee2.address.get(0).houseNo);
//        System.out.println("PinCode :"+employee2.address.get(0).pinCode);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println();
        System.out.println("Branch Name      :"+branchName.name2);
        System.out.println("Branch IFSC code :"+branchName.branchDetail.get(1).ifscCode);
        System.out.println("Address          :"+branchDetails2.address.get(0).flatNo+","+branchDetails2.address.get(0).colony+","+branchDetails2.address.get(0).city+","+branchDetails2.address.get(0).pinCode);
        System.out.println();
        System.out.println(branchName.name2+" "+ "EmployeDetails   :" );
        System.out.println("#Employee 1");
        System.out.println("Name             :"+branchDetails2.employee.get(0).name);
        System.out.println("Id               :"+branchDetails2.employee.get(0).id);
        System.out.println("Designation      :"+branchDetails2.employee.get(0).designation);
        System.out.println("Salary           :"+branchDetails2.employee.get(0).salary+"/-");
        System.out.println("Employee Address :"+employee3.address.get(0).houseNo+","+employee3.address.get(0).villageName+","+employee3.address.get(0).pinCode);

        System.out.println();
        System.out.println("#Employee 2");
        System.out.println("Name        :"+branchDetails2.employee.get(1).name);
        System.out.println("Id          :"+branchDetails2.employee.get(1).id);
        System.out.println("Designation :"+branchDetails2.employee.get(1).designation);
        System.out.println("Salary      :"+branchDetails2.employee.get(1).salary+"/-");
        System.out.println("Employee Address :"+employee4.address.get(0).houseNo+","+employee4.address.get(0).villageName+","+employee4.address.get(0).pinCode);
        System.out.println();

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>>");


        System.out.println();
        System.out.println("Branch Name      :"+branchName.name3);
        System.out.println("Branch IFSC code :"+branchName.branchDetail.get(2).ifscCode);
        System.out.println("Address          :"+branchDetails3.address.get(0).flatNo+","+branchDetails3.address.get(0).colony+","+branchDetails3.address.get(0).city+","+branchDetails3.address.get(0).pinCode);
        System.out.println();
        System.out.println(branchName.name3+" "+ "EmployeDetails   :" );
        System.out.println("#Employee 1");
        System.out.println("Name             :"+branchDetails3.employee.get(0).name);
        System.out.println("Id               :"+branchDetails3.employee.get(0).id);
        System.out.println("Designation      :"+branchDetails3.employee.get(0).designation);
        System.out.println("Salary           :"+branchDetails3.employee.get(0).salary+"/-");
        System.out.println("Employee Address :"+employee5.address.get(0).villageName+","+employee5.address.get(0).houseNo+","+employee5.address.get(0).pinCode);

        System.out.println();
        System.out.println("#Employee 2");
        System.out.println("Name        :"+branchDetails3.employee.get(1).name);
        System.out.println("Id          :"+branchDetails3.employee.get(1).id);
        System.out.println("Designation :"+branchDetails3.employee.get(1).designation);
        System.out.println("Salary      :"+branchDetails3.employee.get(1).salary+"/-");
        System.out.println("Employee Address :"+employee6.address.get(0).houseNo+","+employee6.address.get(0).villageName+","+employee6.address.get(0).pinCode);




    }
}
