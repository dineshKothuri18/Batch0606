import java.util.Scanner;

public class College_Project {
    public String NameofCollege;
    public String AreaofCollege;
    public String CountofBranches;
    public String AddressofCollege;
    public String CodeofCollege;
    public static Scanner sc = new Scanner(System.in);

    public void CollegeStartingday(){
        System.out.println("It's my College Starting day");
        System.out.println("                                                                        ");
        System.out.println("Please Select or enter only(firstday)");
        String day = sc.nextLine();
        if(day == "firstday"){
            System.out.println("The classes had been started from June 1st week");
        }
        else{
            System.out.println("Go when ever you want to go bye!........");
        }
    }
    public void CollegeEndingday(){
        System.out.println("It's my College Ending day!");
        System.out.println("                                                                        ");
        System.out.println("If you want to know the Ending of your college. Then only enter(lastday)");
        String day = sc.nextLine();
        if(day.equals("lastday")){
            System.out.println("Hurry!! we are getting holidays from tomorrow__________________");
        }
        else{
            System.out.println("Do you have any Backlogs!..............");
        }
    }
    public void CollegeFunctions(){
        System.out.println("List of activities we have in our College");
        System.out.println("                                             ");
        System.out.println("To know what kind of activiies were going to held in you college please enter (Activites) only");
        String activities = sc.nextLine();
        if (activities.equals("Activities")){
            System.out.println("We are going to celebrate each and every festival of any religion in INDIA");
        }
        else{
            System.out.println("Were you only interested in studies  ");
        }
    }
    public void Examination(){
        System.out.println("Sem Exam Details");
        System.out.println("                                                                            ");
        System.out.println("To know about examination details please enter (Exams) only.. ");
        String select = sc.nextLine();
        if(select == "Exams"){
            System.out.println("No Exams in this college..........just only gain knowledge........");
        }
        else{
            System.out.println("Do you want exams!.................");
        }
    }
}

