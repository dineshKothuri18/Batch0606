import java.util.ArrayList;
import java.util.Scanner;

public class Movie_data {
    public static ArrayList<Movie> cinemas;
    public static void main(String[] args) {
        Add_Details();
    }
    public static void Add_Details(){
        cinemas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i =0;
        boolean flag = true;
        while(flag) {
            Movie cinema = new Movie();
            System.out.println("Please Enter the " + (++i) + " Movie details");
            System.out.println("Please Enter the Movie Name: ");
            cinema.movie_name = sc.nextLine();
            System.out.println("Please Enter Ratings out of 5:");
            cinema.ratings = sc.nextFloat();
            System.out.println("Please Enter Directors name:");
            sc.nextLine();
            cinema.director = sc.nextLine();
            System.out.println("Please Enter Hero's Name: ");
            cinema.hero = sc.nextLine();
            System.out.println("Please Enter Heroin's Name: ");
            cinema.heroine = sc.nextLine();
            System.out.println("Please Enter the Movie collections: ");
            cinema.collections = sc.nextInt();
            cinemas.add(cinema);
            int p = 1;
            while (p == 1) {
                System.out.println("Do you wanna continue (Y/N): ");
                sc.nextLine();
                String option = sc.nextLine();
                switch (option) {
                    case "Y", "y":
                        p = 0;
                        continue;
                    case "N", "n":
                        p = 0;
                        flag = false;
                        view();
                        break;
                    default:
                        System.out.println("Enter Valid Input");
                        break;
                }
            }
        }
    }
    public static void view(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-25s|%-10s|%-15s|%-15s|%-15s|%-10s|\n", "S.No", "Movie Name", "Ratings", "Director", "Hero Name", "Heroine Name", "Collections");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        int i = 1;
        for(Movie p : cinemas){
            System.out.format("|%-5d|%-25s|%-10f|%-15s|%-15s|%-15s|%-10d|\n", (i++), p.movie_name, p.ratings, p.director, p.hero, p.heroine, p.collections);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
