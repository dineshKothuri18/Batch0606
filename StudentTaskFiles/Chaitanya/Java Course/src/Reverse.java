public class Reverse
{
  public static void main(String[] args)
{
 String name="Chaitanya";
 String reverse=" ";
 for(int i=0;i<name.length();i++){
   reverse=name.charAt(i)+reverse;
}
 System.out.println("Reverse of String: "+reverse);
}
}