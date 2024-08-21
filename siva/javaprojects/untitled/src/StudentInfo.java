

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.OptionalDataException;

public class StudentInfo {
    public static void main(String[] args) {
        String[] stname = {"suvarchala", "deepa", "siva", "sai kiran", "mohit sai", "narasimha", "aparna", "chaitanya", "hemanth", "rahul", "sai kumar", "sumanth", "sathwika", "akila", "karishma", "kavya", "sai charan", "vijaya", "raghu"};
        String[] batchname = {"cse", "cse", "bsc", "bsc", "cse", "cse", "ece", "ece", "cse", "cse", "ece", "eee", "cse", "bsc", "cse", "ece", "ece", "cse", "ece"};

        int[] rollnumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019};
        int[] javaMarks = {90, 80, 75, 60, 40, 10, 40, 30, 15, 20, 12, 56, 22, 32, 38, 21, 44, 11, 9};
        int[] htmlMarks = {80, 90, 60, 50, 22, 32, 38, 21, 44, 11, 9, 40, 10, 40, 30, 15, 20, 0, 11};
        int[] sqlMarks = {70, 100, 55, 40, 15, 20, 0, 11, 22, 32, 38, 21, 44, 11, 0, 33, 22, 32, 12, 10};
        int[] jsMarks = {100, 70, 90, 70, 10, 40, 30, 15, 20, 11, 40, 10, 40, 30, 15, 20, 12, 56, 22};
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
            int d = Math.min(javaMarks[i], htmlMarks[i]);
            int e = Math.min(sqlMarks[i], jsMarks[i]);
            int mini = Math.min(d, e);
            int g = Math.max(javaMarks[i], htmlMarks[i]);
            int h = Math.max(sqlMarks[i], jsMarks[i]);
            int maxi = Math.max(g, h);
            int sumofmarkse = javaMarks[i] + htmlMarks[i] + sqlMarks[i] + jsMarks[i];
            int averageofmarkse = sumofmarkse / 4;
            if (javaMarks[i] >= 90) {
                gradeinjava[i] = "A+";
                gradeinsql[i] = "A+";
            } else if (javaMarks[i] >= 80) {
                gradeinjava[i] = "A";
                gradeinsql[i] = "A";
            } else if (javaMarks[i] >= 70) {
                gradeinjava[i] = "B";
                gradeinsql[i] = "B";
            } else if (javaMarks[i] >= 60) {
                gradeinjava[i] = "C";
                gradeinsql[i] = "C";
            } else if (javaMarks[i] >= 50) {
                gradeinjava[i] = "D";
                gradeinsql[i] = "D";
            } else if (javaMarks[i] >= 40) {
                gradeinjava[i] = "E";
                gradeinsql[i] = "E";
            } else {
                gradeinjava[i] = "F";
                gradeinsql[i] = "F";
            }
            if (htmlMarks[i] >= 90) {
                gradeinhtml[i] = "A+";
            } else if (htmlMarks[i] >= 80) {
                gradeinhtml[i] = "A";
            } else if (htmlMarks[i] >= 70) {
                gradeinhtml[i] = "B";
            } else if (htmlMarks[i] >= 60) {
                gradeinhtml[i] = "C";
            } else if (htmlMarks[i] >= 50) {
                gradeinhtml[i] = "D";
            } else if (htmlMarks[i] >= 35) {
                gradeinhtml[i] = "E";
            } else {
                gradeinhtml[i] = "F";
            }
            if (sqlMarks[i] >= 90) {
                gradeinsql[i] = "A+";
            } else if (sqlMarks[i] >= 80) {
                gradeinsql[i] = "A";
            } else if (sqlMarks[i] >= 70) {
                gradeinsql[i] = "B";
            } else if (sqlMarks[i] >= 60) {
                gradeinsql[i] = "C";
            } else if (sqlMarks[i] >= 50) {
                gradeinsql[i] = "D";
            } else if (sqlMarks[i] >= 35) {
                gradeinsql[i] = "E";
            } else {
                gradeinsql[i] = "F";
            }
            if (jsMarks[i] >= 90) {
                gradeinjs[i] = "A+";
            } else if (jsMarks[i] >= 80) {
                gradeinjs[i] = "A";
            } else if (jsMarks[i] >= 70) {
                gradeinjs[i] = "B";
            } else if (jsMarks[i] >= 60) {
                gradeinjs[i] = "C";
            } else if (jsMarks[i] >= 50) {
                gradeinjs[i] = "D";
            } else if (jsMarks[i] >= 35) {
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


            if (javaMarks[i] >= 35 && htmlMarks[i] >= 35 && sqlMarks[i] >= 35 &&jsMarks[i] >= 35) {

                System.out.printf("%-8s %1s %-11s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-12s %1s%n", rollnumbers[i], "|", stname[i], "|", batchname[i], "|", javaMarks[i] + "(" + gradeinjava[i] + ")", "|", htmlMarks[i] + "(" + gradeinhtml[i] + ")", "|", sqlMarks[i] + "(" + gradeinsql[i] + ")", "|", jsMarks[i] + "(" + gradeinjs[i] + ")", "|", sumofmarkse, "|", averageofmarkse, "|", mini, "|", maxi, "|", percent[i]+" "+percentgrade[i], "|", "pass", "|");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            } else {
                System.out.printf("%-8s %1s %-11s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-7s %1s %-12s %1s%n", rollnumbers[i], "|", stname[i], "|", batchname[i], "|", javaMarks[i] + "(" + gradeinjava[i] + ")", "|", htmlMarks[i] + "(" + gradeinhtml[i] + ")", "|", sqlMarks[i] + "(" + gradeinsql[i] + ")", "|", jsMarks[i] + "(" + gradeinjs[i] + ")", "|", sumofmarkse, "|", averageofmarkse, "|", mini, "|", maxi, "|", percent[i]+" "+percentgrade[i], "|", "fail", "|");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            }



        }
        for(int j=0;j<stname.length;j++){
            if (javaMarks[j] < leastjava) {
                leastjava = javaMarks[j];
            }
            if (htmlMarks[j] < leasthtml) {
                leasthtml = htmlMarks[j];
            }
            if (sqlMarks[j] < leastsql) {
                leastsql = sqlMarks[j];
            }
            if (jsMarks[j] < leastjs) {
                leastjs = jsMarks[j];
            }
            if (javaMarks[j] > maxjava) {
                maxjava = javaMarks[j];
            }
            if (htmlMarks[j] > maxhtml) {
                maxhtml = htmlMarks[j];
            }
            if (sqlMarks[j] > maxsql) {
                maxsql = sqlMarks[j];
            }
            if (jsMarks[j] > maxjs) {
                maxjs = jsMarks[j];
            }
            if (percent[j] < leastpercentage){
                leastpercentage = percent[j];
            }
            if (percent[j] > highestpercentage){
                highestpercentage = percent[j];
            }

        }
        System.out.println("");
        System.out.println("students who got minimum and maximum marks in java :: ");
        System.out.println("");
        for(int k=0;k<stname.length;k++) {

            if (javaMarks[k] == leastjava) {
                System.out.println("minimum marks in java:  " + stname[k] + " " + "got " + leastjava+" marks");
                System.out.println("");
            }
            if (javaMarks[k] == maxjava) {
                System.out.println("maximum marks in java:  " + stname[k] + " " + "got " + maxjava+" marks");

            }
        }
        System.out.println();
        System.out.println("******************************************************************");
        System.out.println("");
        System.out.println("students who got minimum and maximum marks in html :: ");
        System.out.println("");
        for(int k1=0;k1<stname.length;k1++) {
            if (htmlMarks[k1] == leasthtml) {
                System.out.println("minimum marks in html:" + stname[k1] + " " + "got " + leasthtml+" marks ");
                System.out.println("");
            }
            if (htmlMarks[k1] == maxhtml) {
                System.out.println("maximum marks in html:" + stname[k1] + " " + "got " + maxhtml+" marks ");
            }
        }
        System.out.println();
        System.out.println("******************************************************************");
        System.out.println("");

        System.out.println("student who got minimum and maximum marks in sql ::");
        System.out.println("");
        for(int k2=0;k2<stname.length;k2++) {
            if (sqlMarks[k2] == leastsql) {
                System.out.println("minimum marks in sql:" + stname[k2] + " " + "got " + leastsql+" marks");
                System.out.println("");
            }
            if (sqlMarks[k2] == maxsql) {
                System.out.println("maximum marks in sql:" + stname[k2] + " " + "got " + maxsql+" marks");
            }
        }
        System.out.println();
        System.out.println("******************************************************************");
        System.out.println("");
        System.out.println("student who got minimum and maximum marks in js ::");
        System.out.println("");
        for(int k3=0;k3<stname.length;k3++) {
            if (jsMarks[k3] == leastjs) {
                System.out.println("minimum marks in javascript:" + stname[k3] + " " + "got " + leastjs+" marks");
                System.out.println("");
            }
            if (jsMarks[k3] == maxjs) {
                System.out.println("maximum marks in javascript:" + stname[k3] + " " + "got " + maxjs+" marks");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("******************************************************************");
        System.out.println("");
        System.out.println("student who got least and highest percentage ::");
        System.out.println("");

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

