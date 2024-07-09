public class Reverses
{
  public static void main(String[] args)
{
 String name="Aparna";
 String reverse=" ";
 for(int i=0;i<name.length();i++){
   reverse=name.charAt(i)+reverse;
}
 System.out.println("Reverse of String: "+reverse);
}
}