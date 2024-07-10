public class Student {
    public static void main(String[] args) {
        String[] studentNames = {"Suvarchala", "Saideepa", "Siva", "Sai kiran", "Mohit sai", "Narasimha", "Aparna", "Chaitanya", "Hemanth", "Rahul", "Sai kumar", "Sumanth", "Sathwika", "Akila", "Karishma", "Kavya", "Sai charan", "Vijaya", "Raghu"};
        int[] idNumbers = {601, 602, 603, 604, 605, 606, 607, 608, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619};
        String[] depatName = {"ECE", "ECE", "BSC", "BSC", "CSE", "CSE", "IT", "CSE", "ECE", "CSE", "ECE", "CSE", "ECE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE"};
        int[] javaMarks = {90, 80, 70, 60, 50, 40, 30, 20, 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20};
        int[] htmlMarks = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 20, 30, 40, 50, 60, 70, 80, 90, 10};
        int[] sqlMarks = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40};
        int[] jsMarks = {50, 40, 30, 20, 10, 50, 40, 30, 20, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50};
        int sum;
        int average;

        double percentage;
        for (int i = 0; i < studentNames.length; i++) {
            sum = javaMarks[i] + htmlMarks[i] + sqlMarks[i] + jsMarks[i];
            average = javaMarks[i] + htmlMarks[i] + sqlMarks[i] + jsMarks[i] / 4;
            percentage = (sum/300.0)*100;
            int d=Math.min(javaMarks[i],htmlMarks[i]);
            int e=Math.min(sqlMarks[i],jsMarks[i]);
            int min=Math.min(d,e);
            int a=Math.max(javaMarks[i],htmlMarks[i]);
            int b=Math.max(sqlMarks[i],jsMarks[i]);
            int max=Math.max(a,b);
              if (javaMarks[i] >= 35 && htmlMarks[i] >= 35 && sqlMarks[i] >= 25 && jsMarks[i] >= 35) {
            System.out.println("Name: "+studentNames[i]);
            System.out.println("Rollnumber: "+idNumbers[i]);
            System.out.println("Department Name: "+depatName[i]);
            System.out.println("JavaMarks: "+javaMarks[i]);
            System.out.println("HTML Marks: "+htmlMarks[i]);
            System.out.println("SQL Marks: "+sqlMarks[i]);
            System.out.println("JavaScript Marks: "+jsMarks[i]);
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Markss: "+average);
            System.out.println("Percentage: "+percentage);
            System.out.println("Minimum Marks: "+min);
            System.out.println("Maxinum Marks: "+max);
            System.out.println("__________________________________");
        }
        else{
             System.out.println("Name: " + studentNames[i]);
                System.out.println("Rollnumber: " + idNumbers[i]);
                System.out.println("Department Name: " + depatName[i]);
                System.out.println("JavaMarks: " + javaMarks[i]);
                System.out.println("HTML Marks: " + htmlMarks[i]);
                System.out.println("SQL Marks: " + sqlMarks[i]);
                System.out.println("JavaScript Marks: " + jsMarks[i]);
                System.out.println("Total Marks: " + sum);
                System.out.println("Average Marks: " + average);
                System.out.println("Percentage: " + percentage);
                System.out.println("Minimum Marks: " + min);
                System.out.println("Maximum Marks: " + max);
                System.out.println("Fail");
                System.out.println("__________________________________");

            }
	}

    }
}
