import java.util.Scanner;

public class Story {
    public String bookName;
    public String author;
    public String price;;
    public String isbno;
    public String review;
    public static Scanner sc = new Scanner(System.in);

    public void writingbook(){
        System.out.println("the person is writing storybook");
        System.out.println("if the person want to know the status of book completion select (Yes/No)");
        String status  = sc.nextLine();
        if(status.equals("Yes")){
            System.out.println("The person is still writing the book and the person name is SATHVIKA.A");
        }
        else{
            System.out.println("Thanks for not showing the interst");
        }
    }

    public void readingbook(){
        System.out.println("The person is reading book");
        System.out.println("As a author i want to know how do you feeling while reading this book : please select(y/n) for your opinion");
        String rating = sc.nextLine();
        if (rating == "y") {
            System.out.println("content is good!");
        }
        else {
            System.out.println("I don't want ot read it anymore bye!!!!!");
        }

    }
    public void sellingbook(){
        System.out.println("the person is selling book");
        System.out.println("If you want to buy the book please the options(Yes/No)");
        String options = sc.nextLine();
        if(options.equals("Yes")){
            System.out.println("The cost of book is just $450,89 only");
        }
        else {
            System.out.println("Please Don't scan me and leave it there");
        }

    }
    public void buyingbook(){
        System.out.println("the person is buying a story book");
        System.out.println("The cost of this book is just $450 thanks for buying");
    }


}
