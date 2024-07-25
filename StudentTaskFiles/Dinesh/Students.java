public class Studentdetails {
    public static void main(String[] args) {
        String[] stname = {"suvarchala", "deepa", "siva", "sai kiran", "mohit sai", "narasimha", "aparna", "chaitanya", "hemanth", "rahul", "sai kumar", "sumanth", "sathwika", "akila", "karishma", "kavya", "sai charan", "vijaya", "raghu"};
        int[] rollnumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        String[] batchname = {"cse", "ece", "cse", "cse", "cse", "cse", "ece", "ece", "cse", "cse", "eee", "eee", "eee", "bsc", "cse", "ece", "ece", "ece", "ece"};
        int[] java_marks = {99, 70, 20, 30, 20, 20, 30, 40, 50, 60, 70, 70, 60, 40, 44, 55, 6, 77, 8};
        int[] html_marks = {98, 90, 80, 70, 20, 30, 30, 80, 50, 20, 60, 80, 50, 40, 44, 55, 7, 77, 8};
        int[] sql_marks = {97, 70, 80, 60, 20, 30, 30, 80, 50, 60, 60, 90, 40, 40, 49, 54, 8, 57, 6};
        int[] javascript_marks = {96, 90, 80, 50, 40, 30, 20, 70, 80, 60, 50, 40, 20, 20, 14, 75, 60, 77, 5};
        System.out.printf("%-10s %-10s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %5s %-5s%n", "Name", "Roll No", "Batch", "Java", "HTML", "SQL", "JS", "sum", "Avg", "Min", "Max", "Percent","pass/fail");
            for(int i=0;i<stname.length;i++) {
                int d=Math.min(java_marks[i],html_marks[i]);
                int e=Math.min(sql_marks[i],javascript_marks[i]);
                int mini=Math.min(d,e);
                int g=Math.max(java_marks[i],html_marks[i]);
                int h=Math.max(sql_marks[i],javascript_marks[i]);
                int maxi=Math.max(g,h);
                int sumofmarkse=java_marks[i]+html_marks[i]+sql_marks[i]+javascript_marks[i];
                int averageofmarkse=sumofmarkse/4;
                float percent=(((float)sumofmarkse)*100)/400;
                if(java_marks[i]>=35 && html_marks[i]>=35 && sql_marks[i]>=35 && javascript_marks[i]>=35) {

                    System.out.printf("%-10s %-10s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %5s     %-5s%n", stname[i], rollnumbers[i], batchname[i], java_marks[i], html_marks[i], sql_marks[i], javascript_marks[i], sumofmarkse, averageofmarkse, mini, maxi, percent,"pass");
                }
                else{
                    System.out.printf("%-10s %-10s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %-5s %5s     %-5s%n", stname[i], rollnumbers[i], batchname[i], java_marks[i], html_marks[i], sql_marks[i], javascript_marks[i], sumofmarkse, averageofmarkse, mini, maxi, percent,"fail");
                }
            }


    }
}