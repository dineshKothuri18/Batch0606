public class Loop{
    public static void main(String[] args){
       
        String[] studentName = {"vijaya","kavya","sumanth","sathvika","Narasimha","Hemanth ","Mohith Sai","Akhila","Sai Charan","Karishma","Aparna","Lakshmi Chaitanya","Rahul","Saikumar","Raghu ","Suvarchala","Saideepa","Siva Nageswararao","Sai Kiran"};
        //String[] javastuQual={"ECE","ECE","EEE","CSE","CSE","IT","CSE","CSE","CSE","IT","CSE","CSE","ECE","ELC","CSE","ECE","ECE","MSCS","MPCS",};
        //String[] javasubjects = {"Java,HTML,SQL,JS"};
        int[] javamarks ={50,40,10,0,80,70,9,12,10,52,28,58,72,68,12,79,56,18,90};
        int[] htmlmarks ={50,58,72,68,12,79,56,18,90,50,40,10,20,80,70,9,12,10,52};
        int[] sqlmarks ={50,30,45,50,55,60,65,79,56,18,90,50,40,10,0,80,70,9,12};
        int[] jsmarks ={50,30,45,50,55,60,65,50,55,60,65,79,56,18,90,50,40,80,70};
        int l = studentName.length;
        int min =javamarks[0];
        int max =0;
        String min_name ="";
        String max_name ="";
        for(int i=0;i<l;i++){
            if(javamarks[i]<min){
                min=javamarks[i];
                min_name =studentName[i];
            }
            if(javamarks[i]>max){
                max=javamarks[i];
                max_name =studentName[i];
           
        }
        }
        System.out.println("minimum marks in java : "+min+" "+min_name);
        System.out.println("maximum marks in java : "+max+" "+max_name);
       
        min =htmlmarks[0];
       for(int i=0;i<l;i++){
            if(htmlmarks[i]<min){
                min=htmlmarks[i];
                min_name =studentName[i];
            }
            if(htmlmarks[i]>max){
                max=htmlmarks[i];
                max_name =studentName[i];
           
        }
        }
        System.out.println("minimum marks in HTML : "+min+" "+min_name);
        System.out.println("maximum marks in HTML : "+max+" "+max_name);
       
       min =sqlmarks[0];
       for(int i=0;i<l;i++){
            if(sqlmarks[i]<min){
                min=sqlmarks[i];
                min_name =studentName[i];
            }
            if(sqlmarks[i]>max){
                max=sqlmarks[i];
                max_name =studentName[i];
           
        }
        }
        System.out.println("minimum marks in sql : "+min+" "+min_name);
        System.out.println("maximum marks in sql : "+max+" "+max_name);
      
       min =jsmarks[0];
        for(int i=0;i<l;i++){
            if(jsmarks[i]<min){
                min=jsmarks[i];
                min_name =studentName[i];
            }
            if(jsmarks[i]>max){
                max=jsmarks[i];
                max_name =studentName[i];
           
        }
        }
        System.out.println("minimum marks in js : "+min+" "+min_name);
        System.out.println("maximum marks in js : "+max+" "+max_name);
        
        float[] per =new float[20];
        per[0] = (javamarks[0]+htmlmarks[0]+sqlmarks[0]+jsmarks[0])/4f;
        float minp=per[0];
        float maxp=0;
        
        String minname = " ";
        String maxname = " ";
        for(int i=0; i<l; i++){
            per[i] = (javamarks[i]+htmlmarks[i]+sqlmarks[i]+jsmarks[i])/4f;
            if(per[i]<minp){
                minp=per[i];
                minname =studentName[i];
            }
            if(per[i]>maxp){
                maxp=per[i];
                maxname =studentName[i];
           
        }
        }
        System.out.println("minimum percentage  : "+minp+" "+minname);
        System.out.println("maximum percentage  : "+maxp+" "+maxname);
        
        for(int i=0; i<l; i++){
            if(javamarks[i]<=40)
            System.out.println("failed in java"+" "+studentName[i]+" "+javamarks[i]);
            
            if(htmlmarks[i]<=40)
            System.out.println("failed in html"+" "+studentName[i]+" "+htmlmarks[i]);
            
            if(sqlmarks[i]<=40)
            System.out.println("failed in sql"+" "+studentName[i]+" "+sqlmarks[i]);
            
            if(jsmarks[i]<=40)
            System.out.println("failed in js"+" "+studentName[i]+" "+jsmarks[i]);
        }
            for(int i=0; i<l; i++){
            if(per[i] >=50 && per[i] <60 )
                
                System.out.println("Grade:"+ " c"+" "+studentName[i]);
                
                
                else if(per[i] >=60 && per[i] <70 )
                
                    System.out.println("Grade:"+ " b"+" "+studentName[i]);
                else if(per[i] >=70 && per[i] <90 )
                
                    System.out.println("Grade:"+ " a"+" "+studentName[i]);
                else if  (per[i] >=90 )
                {
                    System.out.println("Grade:"+ " a+"+" "+studentName[i]);
                    System.out.println("Grade:"+ "distinction ");
                }
                else
                
                    System.out.println("failed"+" "+studentName[i]);
                
            }
        }

}

            
        
        
        
        
        



