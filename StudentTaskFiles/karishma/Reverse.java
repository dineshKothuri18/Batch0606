ublic class Reverse{
    public static void main(String[] args){
        String word = "KARISHMA";
        String rsword = "";
        char ch;
        for(int i=0; i<=10; i++){
            ch = word.charAt(i);
            
        rsword = ch + rsword;
        }
        System.out.println("Reverse String: " + rsword);
    }
}