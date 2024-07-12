public class One {
    public static void main(String[] args) {
        String[] studentNames = {"Suvarchala", "Saideepa", "Siva", "Sai kiran", "Mohit sai", "Narasimha", "Aparna", "Chaitanya", "Hemanth", "Rahul", "Sai kumar", "Sumanth", "Sathwika", "Akila", "Karishma", "Kavya", "Sai charan", "Vijaya", "Raghu"};
        int[] idNumbers = {601, 602, 603, 604, 605, 606, 607, 608, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619,620};
        String[] depatName = {"ECE", "ECE", "BSC", "BSC", "CSE", "CSE", "IT", "CSE", "ECE", "CSE", "ECE", "CSE", "ECE", "CSE", "CSE", "CSE", "CSE", "CSE", "CSE"};
        int[] javaMarks = {90, 80, 70, 60, 50, 40, 30, 20, 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20};
        int[] htmlMarks = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 20, 30, 40, 50, 60, 70, 80, 90, 10};
        int[] sqlMarks = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 10, 20, 30, 40};
        int[] jsMarks = {50, 40, 30, 20, 10, 50, 40, 30, 20, 10, 20, 30, 40, 50, 10, 20, 30, 40, 50};
        float leastpercentage = 100f;
        float highestpercentage = 0f;
        int sum;
        int average;
        int maxi = 0;
        int mini = 100;
        int minijava=100;
        int maxijava=0;
        int minisql=100;
        int maxisql=0;
        int minijs=100;
        int maxijs=0;
        float[] percentage=new float[19];
        for (int i = 0; i < studentNames.length; i++) {
            sum = javaMarks[i] + htmlMarks[i] + sqlMarks[i] + jsMarks[i];
            average = javaMarks[i] + htmlMarks[i] + sqlMarks[i] + jsMarks[i] / 4;
            percentage[i] = (sum/400f)*100f;
            int d=Math.min(javaMarks[i],htmlMarks[i]);
            int e=Math.min(sqlMarks[i],jsMarks[i]);
            int min=Math.min(d,e);
            String minSubject;
            if(min == htmlMarks[i]) {
                minSubject = "HTML";
            }else if (min == sqlMarks[i]) {
                minSubject = "SQL";
            }
            else if(min == jsMarks[i]){
                minSubject = "JavaScript";
            }
            else{
                minSubject = "Java";
            }
            int a=Math.max(javaMarks[i],htmlMarks[i]);
            int b=Math.max(sqlMarks[i],jsMarks[i]);
            int max=Math.max(a,b);
            String maxSubject;
            if(max == htmlMarks[i]) {
                maxSubject = "HTML";
            }else if (max == sqlMarks[i])
            {
                maxSubject = "SQL";
            }
            else if(max == jsMarks[i]){
                maxSubject = "JavaScript";
            }
            else{
                maxSubject = "Java";
            }
            System.out.println("Name: "+studentNames[i]);
            System.out.println("Rollnumber: "+idNumbers[i]);
            System.out.println("Department Name: "+depatName[i]);
            System.out.println("JavaMarks: "+javaMarks[i]);
            System.out.println("HTML Marks: "+htmlMarks[i]);
            System.out.println("SQL Marks: "+sqlMarks[i]);
            System.out.println("JavaScript Marks: "+jsMarks[i]);
            System.out.println("Total Marks: "+sum);
            System.out.println("Average Marks: "+average);
            System.out.println("Percentage: "+percentage[i]);
            System.out.println("Minimum Marks: "+min+" "+"in"+" "+minSubject);
            System.out.println("Maxinum Marks: "+max+" "+"in"+" "+maxSubject);
            if (percentage[i] >= 45.0) {
                System.out.println("Status of the Student:-PASS ");
            } else {
                System.out.println("Status of the Student:-FAIL");
            }
            System.out.println("__________________________________");
        }
        for(int k=0;k< studentNames.length;k++){
            if(htmlMarks[k]<mini){
                mini=htmlMarks[k];
            }
            if(htmlMarks[k]>maxi){
                maxi=htmlMarks[k];
            }
            if(javaMarks[k]<minijava){
                minijava=javaMarks[k];
            }
            if(javaMarks[k]>maxijava){
                maxijava=javaMarks[k];
            }
            if(sqlMarks[k]<minisql){
                minisql=sqlMarks[k];
            }
            if(sqlMarks[k]>maxisql){
                maxisql=sqlMarks[k];
            }
            if(jsMarks[k]<minijs){
                minijs=jsMarks[k];
            }
            if(jsMarks[k]>maxijs){
                maxijs=jsMarks[k];
            }
        }
        System.out.println("*****************************************************************************************");
        System.out.println("STUDENTS WHO GOT HIGHEST MARKS AND LEAST MARKS IN HTML");
        System.out.println("____________________________________________________________________________");
        for(int l=0;l< studentNames.length;l++){  //html min
            if(htmlMarks[l]==mini){
                System.out.println(studentNames[l]+"got least marks "+mini+" marks");
            }
            if(htmlMarks[l]==maxi){
                System.out.println(studentNames[l]+"got highest marks "+maxi+" marks");
            }
        }
        System.out.println("____________________________________________________________________________");
        System.out.println("STUDENTS WHO GOT HIGHEST AND LEAST MARKS IN JAVA");
        System.out.println("____________________________________________________________________________");
        for(int l=0;l< studentNames.length;l++){//java min
            if(javaMarks[l]==minijava){
                System.out.println(studentNames[l]+"got least marks "+minijava+" marks");
            }
            if(javaMarks[l]==maxijava){
                System.out.println(studentNames[l]+"got highest marks "+maxijava+" marks");
            }
        }
        System.out.println("____________________________________________________________________________");
        System.out.println("STUDENTS WHO GOT LEAST AND HIGHEST MARKS IN SQL");
        System.out.println("____________________________________________________________________________");
        for(int l=0;l< studentNames.length;l++){ //sql min
            if(sqlMarks[l]==minisql){
                System.out.println("List of students who got Least marks in SQL");
                System.out.println(studentNames[l]+"got least marks "+minisql+" marks");
            }
            if(sqlMarks[l]==maxisql){
                System.out.println(studentNames[l]+"got highest marks "+maxisql+" marks");
            }
        }
        System.out.println("____________________________________________________________________________");
        System.out.println("STUDENTS WHO GOT LEAST AND HIGHEST MARKS IN JAVASCRIPT");
        System.out.println("____________________________________________________________________________");
        for(int l=0;l< studentNames.length;l++){ //js min
            if(jsMarks[l]==minijs){
                System.out.println(studentNames[l]+"got least marks "+minijs+" marks");
            }
            if(jsMarks[l]==maxijs){
                System.out.println(studentNames[l]+"got highest marks "+maxijs+" marks");
            }
        }
        for(int v=0;v<studentNames.length;v++){
            if(percentage[v]<leastpercentage){
                leastpercentage=percentage[v];
            }
            if(percentage[v]>highestpercentage){
                highestpercentage=percentage[v];
            }
        }
        System.out.println("**************************************************************************************");
        System.out.println("STUDENTS WHO GOT LEAST AND HIGHEST PERCENTGAE");
        for(int h=0;h< studentNames.length;h++){
            if(percentage[h]==leastpercentage){
                System.out.println(studentNames[h]+" got the least percentage:   "+leastpercentage);
            }
            if(percentage[h]==highestpercentage){
                System.out.println(studentNames[h]+" got the highest percentage:   "+highestpercentage);
            }
        }
    }

}

