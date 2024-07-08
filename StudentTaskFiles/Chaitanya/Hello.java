public class Hello {

    public static void main(String[] args) {

        String[] studentNames = {"Narasimha", "Hemanth", "Sumanth", "Mohith sai", "Vijay", "Kavya", "Akhila", "sai Charan", "Sathvika", "Karishma", "Aparna", "Chaitanya", "Rahul", "Saikumar", "Raghu", "Suvarchala", "Saideepa", "Siva Nageswararao", "Sai Kiran"};
        String[] stuQua = {"CSE", "IT", "EEE", "CSE", "ECE", "ECE", "CSE", "CSE", "CSE", "ECE", "IT", "CSE", "CSE", "ELC", "CSE", "ECE", "ECE", "MSCS", "MPCS"};

        int[] java = {12, 34, 56, 78, 9, 9, 87, 65, 43, 23, 45, 67, 89, 87, 76, 23, 34, 56, 67};
        int[] html = {98, 76, 54, 34, 56, 78, 90, 98, 76, 54, 34, 57, 89, 98, 76, 54, 39, 87, 65};
        int[] SQL = {87, 65, 43, 45, 67, 89, 9, 87, 65, 43, 45, 67, 89, 87, 65, 4, 76, 65, 87};
        int[] javascript = {76, 54, 32, 35, 67, 89, 9, 87, 65, 43, 23, 89, 98, 76, 54, 6, 9, 4, 8};
        
        for (int i = 0; i < studentNames.length; i++) {
            // Check if the student passes
            

            // Calculate total marks, average, and percentage
            int totalMarks = java[i] + html[i] + SQL[i] + javascript[i];
            float average = totalMarks / 4f;
            float Percentage = ((float) totalMarks / 400) * 100;

            // Print student details
            System.out.println("Names: "+ studentNames[i]);
            System.out.println("Qualification : "+stuQua[i]);
            System.out.println("Sum: " + totalMarks);
            System.out.println("Average: " + average);
            System.out.println("Percentage: " + Percentage);
            if (java[i] >= 50 && html[i] >= 50 && SQL[i] >= 50 && javascript[i] >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
             if(Percentage>=50 && Percentage<60)

        System.out.println("Obtained grade is : C ");
                 
                 else if(Percentage>=60 && Percentage<70)

        System.out.println("Obtained grade is : B ");
                
                 else if(Percentage>=70 && Percentage<90)

        System.out.println("Obtained grade is : A ");
 
                 else if(Percentage>=90)

        System.out.println("Obtained grade is : A+ and u have passed in Distinction ");


            System.out.println("===========================================");
           
        }
                int min = java[0];
                int max = java[0];
                for(int x=0; x<=18; x++){
                    if(java[x]>max)
                    max = java[x];
                    if(java[x]<min)
                    min = java[x];
                }
               System.out.println("Highest Marks in java : " + max);
               System.out.println("Least Marks in java : " + min);
    
                int min1 = html[0];
                int max1 = html[0];
                for(int y=0; y<=18; y++){
                    if(html[y]>max1)
                    max1 = html[y];
                    if(html[y]<min1)
                    min1 = html[y];
                }
                System.out.println("Highest Marks in html : " + max1);
                System.out.println("Least Marks in html : " + min1);
                int min2 = SQL[0];
                int max2 = SQL[0];
                for(int k=0; k<=18; k++){
                    if(SQL[k]>max2)
                    max2 = SQL[k];
                    if(SQL[k]<min2)
                    min2 = SQL[k];
                }
               System.out.println("Highest Marks in SQL : " + max2);
               System.out.println("Least Marks in SQL : " + min2);
                int min3 = javascript[0];
                int max3 = javascript[0];
                for(int w=0; w<=18; w++){
                    if(javascript[w]>max3)
                    max3 = javascript[w];
                    if(javascript[w]<min3)
                    min3 = javascript[w];
                }
                System.out.println("Highest Marks in javascript : " + max3);
                System.out.println("Least Marks in javascript : " + min3);
                
                System.out.println("=============================================");
               System.out.println("Student details end");
                
                  
    }
}
