public class Reverse{
    public static void main(String[] args){
        String name="kavya";
        String reverse=" ";
        for(int  i=0; i<name.length(); i++){
            reverse=name.charAt(i)+reverse;

        }
        System.out.println("Reverse string: "+reverse);
    }
}

