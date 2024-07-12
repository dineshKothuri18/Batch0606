public class Arrays{
    public static void main(String[] args){
        String[] stuNames = {"Narasimha A","Hemanth Ch","Sumanth M","Mohith Sai K","Vijaya Lakshmi P","Kavya Sri K","Akhila D","Sai Charan P","Sathvika A","Karishma Md","Aparna K","Lakshmi Chaitanya L","Rahul","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
        String[] StudentQualification = {"cse", "ece", "cse", "cse", "cse", "cse", "ece", "ece", "cse", "cse", "eee", "eee", "eee", "bsc", "cse", "ece", "ece", "ece", "ece"};
        
        int[] stuRollNo = {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219};
        int[] subjectJavaMarks = {30,85,95,56,59,65,74,60,68,58,89,87,70,71,80,69,63,66,99};
        int[] subjectHTMLMarks = {88,56,65,58,69,58,45,78,69,67,54,85,67,50,57,67,57,69,90};
        int[] subjectJSMarks = {99,98,69,59,67,59,59,88,89,58,45,89,78,89,58,67,98,98,58,57};
        int[] subjectSQLMarks = {99,89,89,56,78,58,98,58,45,64,68,58,59,78,89,56,67,58,67};
        
        for(int i=0; i<stuNames.length; i++){
            if(subjectJavaMarks[i]>=50 && subjectHTMLMarks[i]>=50 && subjectJSMarks[i]>=50 && subjectSQLMarks[i]>=50){
                int sum = (subjectJavaMarks[i]+subjectHTMLMarks[i]+subjectJSMarks[i]+subjectSQLMarks[i]);
                int Average = (sum/4);
                float Percentage = ((sum/400f)*100);
                System.out.println("Total number of students :"+ stuNames.length);
                System.out.println("Names :"+ stuNames[i]);
                System.out.println("RollNo :"+ stuRollNo[i]);
                System.out.println("Branch name :"+ StudentQualification[i]);
                System.out.println("Total number of subjects :"+ 4);
                System.out.println("Sum :"+ sum);
                System.out.println("Average :"+ Average);
                System.out.println("Percentage :"+ Percentage);
              
                if(Percentage<50){
                    System.out.println("overall failed");
                }else if(Percentage>50){
                    System.out.println("overall passed");
                }
                System.out.println("******************************************************");
    

            }
            
        }
                
                int min = subjectJavaMarks[0];
                int max = subjectJavaMarks[0];
                for(int j=0; j<=18; j++){
                    if(subjectJavaMarks[j]>max)
                    max = subjectJavaMarks[j];
                    if(subjectJavaMarks[j]<min)
                    min = subjectJavaMarks[j];
                }
             System.out.println("Max Marks in java : " + max);
    System.out.println("Min Marks in java : " + min);
    
    int min1 = subjectJSMarks[0];
                int max1 = subjectJSMarks[0];
                for(int x=0; x<=18; x++){
                    if(subjectJSMarks[x]>max1)
                    max1 = subjectJSMarks[x];
                    if(subjectJSMarks[x]<min1)
                    min1 = subjectJSMarks[x];
                }
             System.out.println("Max Marks in JS : " + max1);
    System.out.println("Min Marks in JS : " + min1);
    int min2 = subjectHTMLMarks[0];
                int max2 = subjectHTMLMarks[0];
                for(int k=0; k<=18; k++){
                    if(subjectHTMLMarks[k]>max2)
                    max2 = subjectHTMLMarks[k];
                    if(subjectHTMLMarks[k]<min2)
                    min2 = subjectHTMLMarks[k];
                }
             System.out.println("Max Marks in HTML : " + max2);
    System.out.println("Min Marks in HTML : " + min2);
      int min3 = subjectSQLMarks[0];
                int max3 = subjectSQLMarks[0];
                for(int y=0; y<=18; y++){
                    if(subjectSQLMarks[y]>max3)
                    max3 = subjectSQLMarks[y];
                    if(subjectSQLMarks[y]<min3)
                    min3 = subjectSQLMarks[y];
                }
             System.out.println("Max Marks in SQL : " + max);
    System.out.println("Min Marks in SQL : " + min);
            }
        }



   