import java.io.OptionalDataException;

public class StudentInfo {
    public static void main(String[] args) {
        String[] studentNames = {"suvarchala", "deepa", "siva", "sai kiran", "mohit sai", "narasimha", "aparna", "chaitanya", "hemanth", "rahul", "sai kumar", "sumanth", "sathwika", "akila", "karishma", "kavya", "sai charan", "vijaya", "raghu"};
        String[] studentDepartment = {"cse", "cse", "bsc", "bsc", "cse", "cse", "ece", "ece", "cse", "cse", "ece", "eee", "cse", "bsc", "cse", "ece", "ece", "cse", "ece"};

        int[] studentRollno = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019};
        int[] javaMarks = {90, 80, 75, 60, 40, 10, 40, 30, 15, 20, 12, 56, 22, 32, 38, 21, 44, 11, 9};
        int[] htmlMarks = {80, 90, 60, 50, 22, 32, 38, 21, 44, 11, 9, 40, 10, 40, 30, 15, 20, 0, 11};
        int[] sqlMarks = {70, 100, 55, 40, 15, 20, 0, 11, 22, 32, 38, 21, 44, 11, 0, 33, 22, 32, 12, 10};
        int[] jsMarks = {100, 70, 90, 70, 10, 40, 30, 15, 20, 11, 40, 10, 40, 30, 15, 20, 12, 56, 22};
        
        System.out.printf("%-9s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s%n", "Roll No", "StudentName", "StudentDept", "JavaMarks", "HtmlMarks", "SqlMarks", "JsMarks", "TotalMarks", "Avarege", "Minimum", "Maximum", "percentage","pass/fail");
        int sum=0;

    for(int i = 0; i<studentNames.length;i++) {

        sum=javaMarks[i]+htmlMarks[i]+sqlMarks[i]+jsMarks[i];
        int average = sum / 4;
        int a = Math.min(javaMarks[i],htmlMarks[i]);
        int b = Math.max(sqlMarks[i],jsMarks[i]);
        int minimum = Math.min(a, b);
        int c = Math.max(javaMarks[i],htmlMarks[i]);
        int d = Math.max(sqlMarks[i],jsMarks[i]);
        int maximum = Math.max(a, b);
        float percentage = (((float)sum)*100)/400;

        if(javaMarks[i]>=27 && htmlMarks[i]>=27 && sqlMarks[i]>=27 &&jsMarks[i]>=27) {

            System.out.printf("%-9s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s%n", studentRollno[i], studentNames[i], studentDepartment[i], javaMarks[i], htmlMarks[i], sqlMarks[i], jsMarks[i], sum, average, minimum, maximum, percentage,"pass");
        }else{

            System.out.printf("%-9s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s%n", studentRollno[i], studentNames[i], studentDepartment[i], javaMarks[i], htmlMarks[i], sqlMarks[i], jsMarks[i], sum, average, minimum, maximum, percentage,"fail");

          }

    }
    

   }
}

