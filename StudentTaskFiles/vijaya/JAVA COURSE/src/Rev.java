public class Rev{
    public static void main(String[] args){
        
        String originalstring = "FULL STACK";
        String reversedstring = "";
        
        //System.out.println("orginalString: " + orignalstring);
        
        for(int i=0;i<originalstring.length();i++){
        reversedstring = originalstring.charAt(i)+reversedstring;
        }
         System.out.println("Reversed String: "+ reversedstring);
         
        }
    }
