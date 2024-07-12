public class Word{
public static void main(String[] args){
         String word = "java";
         for( int i=0;i<word.length();i++){
             int count=0;
             for(int j=i;j<word.length();j++){
                 if(word.charAt(i)==word.charAt(j)){
                 count=count+1;
                 }
             }
            System.out.print(word.charAt(i)+" ");
            System.out.println(count) ;
         }
     }         
 }
