import java.util.ArrayList;

public class Branch {
    String city;
    String branchname;
    String IFSCcode;
    ArrayList<Employee> employees = new ArrayList<Employee>();
    ArrayList<Customer> customers = new ArrayList<Customer>();
    public Branch(String city, String IFSCcode,String branchname){
        this.city = city;
        this.branchname = branchname;
        this.IFSCcode = IFSCcode;

    }

}
