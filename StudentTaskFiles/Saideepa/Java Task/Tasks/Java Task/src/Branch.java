import java.util.ArrayList;

public class Branch {

    String branchname;
    String IFSCcode;
    String address;
    ArrayList<Staff> staffs;

    public void branchDetails(){
        System.out.println("Branch Name: "+branchname);
        System.out.println("IFSC : "+IFSCcode);
        System.out.println("Address :"+address);
        System.out.println("                                       ");

        System.out.println("Staffs :");
        for(Staff  staff:staffs){
            staff.StaffDetails();
        }
        System.out.println("                                       ");
    }
}

