public class Student {

    public static void main(String[] args) {

        String[] studentNames = {"Narasimha", "Hemanth", "Sumanth", "Mohith sai", "Vijay", "Kavya", "Akhila", "sai Charan", "Sathvika", "Karishma", "Aparna", "Chaitanya", "Rahul", "Saikumar", "Raghu", "Suvarchala", "Saideepa", "Siva Nageswararao", "Sai Kiran"};
        String[] stuQua = {"CSE", "IT", "EEE", "CSE", "ECE", "ECE", "CSE", "CSE", "CSE", "ECE", "IT", "CSE", "CSE", "ELC", "CSE", "ECE", "ECE", "MSCS", "MPCS"};

        int[] java={12,34,56,78,9,09,87,65,43,23,45,67,89,87,76,23,34,56,67};
        int[] html={98,76,54,34,56,78,90,98,76,54,34,57,89,98,76,54,39,87,65};
        int[] sql={87,65,43,45,67,89,09,87,65,43,45,67,89,87,65,4,76,65,87};
        int[] javascript={76,54,32,35,67,89,09,87,65,43,23,89,98,76,54,6,9,4,8}; 
        for (int i = 0; i < studentNames.length; i++) {
         if (java[i] >= 40 && html[i] >= 40 && sql[i] >= 40 && javascript[i] >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

            int add = java[i] + html[i] + sql[i] + javascript[i];
            float avg = add / 4f;
            float per = ((float) add / 400) * 100;

            System.out.println(studentNames[i]);
            System.out.println(stuQua[i]);
            System.out.println("Sum: " + add);
            System.out.println("Average: " + avg);
            System.out.println("Percentage: " + per);

            

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}