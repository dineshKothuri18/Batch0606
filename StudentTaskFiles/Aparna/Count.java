public class Count
{
  public static void main(String[] args)
{
 String word="JAVA";
 for(int i=0;i<word.length();i++){
    int count=0;
    for(int j=i;j<word.length();j++){
     if(word.charAt(i)==word.charAt(j)){
     count++;
   }
 }
  System.out.println(word.charAt(i)+"-"+count);
}
}
}