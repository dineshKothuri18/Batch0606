import java.util.*;


public class Food{
    Scanner sc=new Scanner(System.in);
    public static HashMap<String,Integer> m=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        m.put("Dosa",200);
        m.put("Idly",300);
        m.put("Special Dosa",400);
        m.put("special idly",500);
        for(String r:m.keySet()){
            System.out.println(r+"  "+m.get(r));
        }
        System.out.printf("1.add the item%n2.delete the item%n3.update the item%n");
        int s=sc.nextInt();
        if(s==1){
            addd();
        }
        else if (s==2) {
            delete();
        } else if (s==3) {
            updatee();
        }


    }
    public static void addd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the itemname and the cost");
        String a=sc.nextLine();
        int b=sc.nextInt();
        m.put(a,b);
        for(String r:m.keySet()){
            System.out.println(r+"  "+m.get(r));
        }

    }
    public static void updatee(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the old itemname:  ");
        String old=sc.nextLine();
        System.out.print("enter the new itemname:  ");
        String new1= sc.nextLine();
        System.out.print("enter the old itemcost:  ");
        int oldc=sc.nextInt();
        System.out.print("enter the new itemcost:  ");
        int newc=sc.nextInt();

        m.replace(old,oldc,newc);
        for(String r:m.keySet()){
            System.out.println(r+"  "+m.get(r));
        }
    }
    public static void delete(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the itemname that you want to delete:  ");
        String d=sc.nextLine();
        m.remove(d);
        for(String r:m.keySet()){
            System.out.println(r+"  "+m.get(r));
        }
    }
}