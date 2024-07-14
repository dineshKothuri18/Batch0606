import java.util.*;


public class Main{
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items=new ArrayList<String>();
        ArrayList<Integer> itemscost=new ArrayList<Integer>();
        boolean flag = true;
        while(flag){
            System.out.println(" welcome come to ak pak karepak restaurant");
            System.out.println("menu");
            System.out.println("1.tifins");
            System.out.println("2.briyanis");
            System.out.println("3.snacks");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            
            int c = sc.nextInt();
            
            sc.nextLine();
            
            switch(c)
            {
                case 1:
                    String[] tifinitems = {"dosa","idly","poori","chapathi","upma"};
                    int[] tifinitemscost = {30,20,35,50,45};
                    for(int i =0; i<tifinitems.length; i++){
                        System.out.println((i+1)+"."+ tifinitems[i] +" "+tifinitemscost[i]);
                    }
               
                System.out.println("Enter your Dish Number");
                int dishtifin = sc.nextInt();
                System.out.println(tifinitems[dishtifin-1] +" "+tifinitemscost[dishtifin-1]);
                items.add(tifinitems[dishtifin-1]);
                itemscost.add(tifinitemscost[dishtifin-1]);
                break;
                
                case 2:
                    String[] briyanisitems ={"chicken briyani","fry piece briyani","costa briyani","wings briyani"};
                    int[] briyanisitemscost = {200,350,400,400};
                    for(int i =0; i<briyanisitems.length; i++){
                        System.out.println((i+1)+"."+ briyanisitems[i] +" "+briyanisitemscost[i]);
                    }
               
                System.out.println("Enter your Dish Number");
                int dishbriyani = sc.nextInt();
                System.out.println(briyanisitems[dishbriyani-1] +" "+briyanisitemscost[dishbriyani-1]);
                items.add(briyanisitems[dishbriyani-1]);
                itemscost.add(briyanisitemscost[dishbriyani-1]);
                break;
                
                
                case 3:
                    String[] snacksitems ={"Samosa","Pani Puri","Aloo Tikki","Chole Bhature"};
                    int[] snacksitemscost = {20,50,40,60};
                    for(int i =0; i<snacksitems.length; i++){
                        System.out.println((i+1)+"."+ snacksitems[i] +" "+snacksitemscost[i]);
                    }
               
                System.out.println("Enter your Dish Number");
                int dishsnacks = sc.nextInt();
                System.out.println(snacksitems[dishsnacks-1] +" "+snacksitemscost[dishsnacks-1]);
                items.add(snacksitems[dishsnacks-1]);
                itemscost.add(snacksitemscost[dishsnacks-1]);
                break;
                
                case 4:
                    flag = false;
                    break;
                    
                    default:
                    System.out.println("invalid number");
                    
            }
            
            
        }
        System.out.println("Enter your name");
        String n = sc.nextLine();
        System.out.println("Enter your contact");
        String c = sc.nextLine();
        System.out.println("Enter your address");
        String a = sc.nextLine();
        System.out.println("name : "+ n);
        System.out.println("contact : "+ c);
        System.out.println("address : "+ a);
        int totalbill = 0;
        for(int i=0; i<items.size(); i++){
            totalbill += itemscost.get(i);
        }
        System.out.println(items+" "+itemscost);
        System.out.println("your totalbill : "+totalbill);
        
        
        
        
        
        
    }
}