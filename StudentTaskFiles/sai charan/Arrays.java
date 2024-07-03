public class Arrays{
    public static void main(String[] args){
        String[] stuNames = {"Narasimha A","Hemanth Ch","Sumanth M","Mohith Sai K","Vijaya Lakshmi P","Kavya Sri K","Akhila D","Sai Charan P","Sathvika A","Karishma Md","Aparna K","Lakshmi Chaitanya L","Rahul","Saikumar J","Raghu J","Suvarchala K","Saideepa K","Siva Nageswararao Ch","Sai Kiran V"};
        String[] StudentQualification = {"cse", "ece", "cse", "cse", "cse", "cse", "ece", "ece", "cse", "cse", "eee", "eee", "eee", "bsc", "cse", "ece", "ece", "ece", "ece"};
        
        int[] stuRollNo = {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219};
        int[] subjectJavaMarks = {10,85,95,56,59,65,74,60,68,58,89,87,70,71,80,69,63,66,99};
        int[] subjectHTMLMarks = {88,56,65,58,69,58,45,78,69,67,54,85,67,50,57,67,57,69,90};
        int[] subjectJSMarks = {99,98,69,59,67,59,59,88,89,58,45,89,78,89,58,67,98,98,58,57};
        int[] subjectSQLMarks = {99,89,89,56,78,58,98,58,45,64,68,58,59,78,89,56,67,58,67};
        
        for(int i=0; i<stuNames.length; i++){
            {
                int sum = (subjectJavaMarks[i]+subjectHTMLMarks[i]+subjectJSMarks[i]+subjectSQLMarks[i]);
                int Average = (sum/4);
                float Percentage = ((sum/400f)*100);

                System.out.println("Names :"+ stuNames[i]);
                System.out.println("RollNo :"+ stuRollNo[i]);
                System.out.println("Branch name :"+ StudentQualification[i]);
                
                System.out.println("Sum :"+ sum);
                System.out.println("Average :"+ Average);
                System.out.println("Percentage :"+ Percentage);
              
                if(Percentage<50){
                    System.out.println("overall failed");
                }
                else if(Percentage>50){
                    System.out.println("overall passed");
                }
                System.out.println("------------------");
    

            }
            
        }
          
            }
        }