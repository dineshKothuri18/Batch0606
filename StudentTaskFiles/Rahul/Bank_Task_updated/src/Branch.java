import java.util.ArrayList;

public class Branch {
    String Branch_name;
    String IFSC_code;
    String location;
    ArrayList<Employee> employees;
    ArrayList<Customer> customers ;

    Branch(String Branch_name, String IFSC_code, String location){
        this.Branch_name = Branch_name;
        this.IFSC_code = IFSC_code;
        this.location = location;
    }
}

