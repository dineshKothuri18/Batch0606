public class Studentdetailss {
    public static void main(String[] args) {
        String[] stname = {"suvarchala", "deepa", "siva", "sai kiran", "mohit sai", "narasimha", "aparna", "chaitanya", "hemanth", "rahul", "sai kumar", "sumanth", "akila", "sathwika", "karishma", "kavya", "sai charan", "vijaya", "raghu"};
        int[] rollnumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        String[] batchname = {"cse", "ece", "cse", "cse", "cse", "cse", "ece", "ece", "cse", "cse", "eee", "eee", "eee", "bsc", "cse", "ece", "ece", "ece", "ece"};
        int[] java_marks = {95, 66, 20, 30, 22, 10, 33, 40, 50, 60, 70, 99, 60, 4, 44, 55, 6, 77, 8};
        int[] html_marks = {91, 90, 80, 70, 20, 30, 35, 80, 50, 21, 60, 89, 55, 40, 44, 56, 7, 77, 8};
        int[] sql_marks = {92, 70, 80, 60, 20, 30, 38, 82, 50, 63, 67, 90, 40, 42, 49, 54, 8, 57, 6};
        int[] javascript_marks = {94, 90, 80, 50, 40, 30, 20, 70, 83, 60, 52, 94, 20, 19, 14, 75, 60, 77, 5};
        String[] gradeinjava = new String[stname.length];
        String[] gradeinsql = new String[stname.length];
        String[] gradeinhtml = new String[stname.length];
        String[] gradeinjs = new String[stname.length];
        float[] percent=new float[19];
        String[] percentgrade=new String[19];
        int leastjava=100;
        int leasthtml=100;
        int leastsql=100;
        int leastjs=100;
        int maxjava=0;
        int maxhtml=0;
        int maxsql=0;
        int maxjs=0;
        float leastpercentage=100f;
        float highestpercentage=0f;
        String minname;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-8s %1s %-11s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-12s %1s%n", "Roll No","|" ,"Name","|" , "Batch","|" , "Java","|" , "HTML","|" , "SQL","|" , "JS", "|" ,"sum","|" , "Avg","|" , "Min","|" , "Max", "|" ,"Percent","|" ,"pass/fail","|");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<stname.length;i++) {
            int d = Math.min(java_marks[i], html_marks[i]);
            int e = Math.min(sql_marks[i], javascript_marks[i]);
            int mini = Math.min(d, e);
            int g = Math.max(java_marks[i], html_marks[i]);
            int h = Math.max(sql_marks[i], javascript_marks[i]);
            int maxi = Math.max(g, h);
            int sumofmarkse = java_marks[i] + html_marks[i] + sql_marks[i] + javascript_marks[i];
            int averageofmarkse = sumofmarkse / 4;
            if (java_marks[i] >= 90) {   //jg
                gradeinjava[i] = "A+";
                gradeinsql[i] = "A+";
            } else if (java_marks[i] >= 80) {
                gradeinjava[i] = "A";
                gradeinsql[i] = "A";
            } else if (java_marks[i] >= 70) {
                gradeinjava[i] = "B";
                gradeinsql[i] = "B";
            } else if (java_marks[i] >= 60) {
                gradeinjava[i] = "C";
                gradeinsql[i] = "C";
            } else if (java_marks[i] >= 50) {
                gradeinjava[i] = "D";
                gradeinsql[i] = "D";
            } else if (java_marks[i] >= 40) {
                gradeinjava[i] = "E";
                gradeinsql[i] = "E";
            } else {
                gradeinjava[i] = "F";
                gradeinsql[i] = "F";
            }
            if (html_marks[i] >= 90) {   //htmlg
                gradeinhtml[i] = "A+";
            } else if (html_marks[i] >= 80) {
                gradeinhtml[i] = "A";
            } else if (html_marks[i] >= 70) {
                gradeinhtml[i] = "B";
            } else if (html_marks[i] >= 60) {
                gradeinhtml[i] = "C";
            } else if (html_marks[i] >= 50) {
                gradeinhtml[i] = "D";
            } else if (html_marks[i] >= 35) {
                gradeinhtml[i] = "E";
            } else {
                gradeinhtml[i] = "F";
            }
            if (sql_marks[i] >= 90) {   //sqlg
                gradeinsql[i] = "A+";
            } else if (sql_marks[i] >= 80) {
                gradeinsql[i] = "A";
            } else if (sql_marks[i] >= 70) {
                gradeinsql[i] = "B";
            } else if (sql_marks[i] >= 60) {
                gradeinsql[i] = "C";
            } else if (sql_marks[i] >= 50) {
                gradeinsql[i] = "D";
            } else if (sql_marks[i] >= 35) {
                gradeinsql[i] = "E";
            } else {
                gradeinsql[i] = "F";
            }
            if (javascript_marks[i] >= 90) {   //jsg
                gradeinjs[i] = "A+";
            } else if (javascript_marks[i] >= 80) {
                gradeinjs[i] = "A";
            } else if (javascript_marks[i] >= 70) {
                gradeinjs[i] = "B";
            } else if (javascript_marks[i] >= 60) {
                gradeinjs[i] = "C";
            } else if (javascript_marks[i] >= 50) {
                gradeinjs[i] = "D";
            } else if (javascript_marks[i] >= 35) {
                gradeinjs[i] = "E";
            } else {
                gradeinjs[i] = "F";
            }
            percent[i] = (((float) sumofmarkse) * 100) / 400;
            if(percent[i]>=90){
                percentgrade[i]="A+";
            }
            else if(percent[i]>=80){
                percentgrade[i]="A";
            }
            else if(percent[i]>=70){
                percentgrade[i]="B";
            }
            else if(percent[i]>=60){
                percentgrade[i]="C";
            }
            else if(percent[i]>50){
                percentgrade[i]="D";
            }

            else{
                percentgrade[i]="F";
            }


            if (java_marks[i] >= 35 && html_marks[i] >= 35 && sql_marks[i] >= 35 && javascript_marks[i] >= 35) {

                System.out.printf("%-8s %1s %-11s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-12s %1s%n", rollnumbers[i], "|", stname[i], "|", batchname[i], "|", java_marks[i] + "(" + gradeinjava[i] + ")", "|", html_marks[i] + "(" + gradeinhtml[i] + ")", "|", sql_marks[i] + "(" + gradeinsql[i] + ")", "|", javascript_marks[i] + "(" + gradeinjs[i] + ")", "|", sumofmarkse, "|", averageofmarkse, "|", mini, "|", maxi, "|", percent[i]+" "+percentgrade[i], "|", "pass", "|");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            } else {
                System.out.printf("%-8s %1s %-11s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-12s %1s%n", rollnumbers[i], "|", stname[i], "|", batchname[i], "|", java_marks[i] + "(" + gradeinjava[i] + ")", "|", html_marks[i] + "(" + gradeinhtml[i] + ")", "|", sql_marks[i] + "(" + gradeinsql[i] + ")", "|", javascript_marks[i] + "(" + gradeinjs[i] + ")", "|", sumofmarkse, "|", averageofmarkse, "|", mini, "|", maxi, "|", percent[i]+" "+percentgrade[i], "|", "fail", "|");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            }



        }
        for(int j=0;j<stname.length;j++){ //finding least and highest marks logic
            if (java_marks[j] < leastjava) {
                leastjava = java_marks[j];
            }
            if (html_marks[j] < leasthtml) {
                leasthtml = html_marks[j];
            }
            if (sql_marks[j] < leastsql) {
                leastsql = sql_marks[j];
            }
            if (javascript_marks[j] < leastjs) {
                leastjs = javascript_marks[j];
            }
            if (java_marks[j] > maxjava) {
                maxjava = java_marks[j];
            }
            if (html_marks[j] > maxhtml) {
                maxhtml = html_marks[j];
            }
            if (sql_marks[j] > maxsql) {
                maxsql = sql_marks[j];
            }
            if (javascript_marks[j] > maxjs) {
                maxjs = javascript_marks[j];
            }
            if (percent[j] < leastpercentage){
                leastpercentage = percent[j];
            }
            if (percent[j] > highestpercentage){
                highestpercentage = percent[j];
            }

        }
        System.out.println("__________________________________________________________________");
        System.out.println("students who got minimum and maximum marks in java                |");
        System.out.println("__________________________________________________________________");
        for(int k=0;k<stname.length;k++) {

            if (java_marks[k] == leastjava) {
                System.out.println("minimum marks in java:  " + stname[k] + " " + "got " + leastjava+" marks");
                System.out.println("__________________________________________________________________");
            }
            if (java_marks[k] == maxjava) {
                System.out.println("maximum marks in java:  " + stname[k] + " " + "got " + maxjava+" marks");

            }
        }
        System.out.println();
        System.out.println("##################################################################");
        System.out.println("__________________________________________________________________");
        System.out.println("students who got minimum and maximum marks in html ");
        System.out.println("__________________________________________________________________");
        for(int k1=0;k1<stname.length;k1++) {
            if (html_marks[k1] == leasthtml) {
                System.out.println("minimum marks in html:" + stname[k1] + " " + "got " + leasthtml+" marks ");
                System.out.println("__________________________________________________________________");
            }
            if (html_marks[k1] == maxhtml) {
                System.out.println("maximum marks in html:" + stname[k1] + " " + "got " + maxhtml+" marks ");
            }
        }
        System.out.println();
        System.out.println("##################################################################");
        System.out.println("__________________________________________________________________");

        System.out.println("student who got minimum and maximum marks in sql");
        System.out.println("__________________________________________________________________");
        for(int k2=0;k2<stname.length;k2++) {
            if (sql_marks[k2] == leastsql) {
                System.out.println("minimum marks in sql:" + stname[k2] + " " + "got " + leastsql+" marks");
                System.out.println("__________________________________________________________________");
            }
            if (sql_marks[k2] == maxsql) {
                System.out.println("maximum marks in sql:" + stname[k2] + " " + "got " + maxsql+" marks");
            }
        }
        System.out.println();
        System.out.println("##################################################################");
        System.out.println("__________________________________________________________________");
        System.out.println("student who got minimum and maximum marks in js");
        System.out.println("__________________________________________________________________");
        for(int k3=0;k3<stname.length;k3++) {
            if (javascript_marks[k3] == leastjs) {
                System.out.println("minimum marks in javascript:" + stname[k3] + " " + "got " + leastjs+" marks");
                System.out.println("__________________________________________________________________");
            }
            if (javascript_marks[k3] == maxjs) {
                System.out.println("maximum marks in javascript:" + stname[k3] + " " + "got " + maxjs+" marks");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("##################################################################");
        System.out.println("__________________________________________________________________");
        System.out.println("student who got least and highest percentage");
        System.out.println("__________________________________________________________________");

        for(int l=0;l<stname.length;l++) {
            if(percent[l]==leastpercentage) {
                System.out.println(stname[l] + "  got the least percentage-- " + leastpercentage);
            }
            if (percent[l] == highestpercentage) {
                System.out.println(stname[l] + "  got the highest percentage--- " + highestpercentage);
            }


        }



        }




    }
