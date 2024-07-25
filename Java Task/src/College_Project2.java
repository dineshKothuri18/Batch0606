import java.util.ArrayList;
import java.util.Scanner;

public class College_Project2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<College_Project>collegeProjects  = new ArrayList<>();

        while (true) {
            College_Project college = new College_Project();
            System.out.println("Enter the name of the College : ");
            college.NameofCollege = sc.nextLine();
            System.out.println("Enter the area of the college : ");
            college.AreaofCollege = sc.nextLine();
            System.out.println("Enter the no.of count of branches : ");
            college.CountofBranches = sc.nextLine();
            System.out.println("Enter the address of the college");
            college.AddressofCollege = sc.nextLine();
            System.out.println("Enter the code of the college");
            college.CodeofCollege = sc.nextLine();
            System.out.println("-----------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------");
            collegeProjects.add(college);
            System.out.println("if you want to enter many college details select(Y/N)");
            String options = sc.nextLine();
            if(options.equals("Y")){
                continue;
            }
            else {
                break;
            }
        }
        for(int i=0;i<collegeProjects.size();i++) {
            College_Project college = collegeProjects.get(i);
            System.out.println("Name : " + college.NameofCollege);
            System.out.println("Area of the College : " + college.AreaofCollege);
            System.out.println("Address of the College : " + college.AddressofCollege);
            System.out.println("Total no.of count of branches in college : " + college.CountofBranches);
            System.out.println("Code of the college to get admission : " + college.CodeofCollege);
            System.out.println("---------------------------------------------------------------------");

            college.CollegeStartingday();
            college.CollegeEndingday();
            college.CollegeFunctions();
            college.Examination();
            System.out.println("#########################################################################");
            System.out.println("Your Preferred College Details is Successfully added to the ArrayList ");
        }
    }
}

