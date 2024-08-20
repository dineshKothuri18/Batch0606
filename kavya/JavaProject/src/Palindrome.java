public class Palindrome{
    public static void main(String[] args){
        int sum=0,temp,rem,n=2002;
        temp=n;
        while (n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }if(temp==sum){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}

