import java.util.*;
public class Palindromewhile{
    public static void main(String[] args){
        int s=0,temp,r;
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        temp = n;
        while(n>0){
            r = n%10;
            s =(s*10)+r;
            n = n/10;
        }
if(temp==s){
    System.out.println("number is palindrome");
}
    else{
    
    System.out.println("number is  not a palindrome");
}
    }
}