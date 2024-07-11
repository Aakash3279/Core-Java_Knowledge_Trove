import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie themovie = new Movie("Star Wars");
        themovie.watchMovie(); //star wars is a Movie film

        Movie themovie1 = new Adventure("Star Trek");
        themovie1.watchMovie();

        Movie themovie2 = new Comedy("The Mask");
        themovie2.watchMovie();

        Movie themovie3 = new SciFi("Guardians of Galaxy");
        themovie3.watchMovie();

        System.out.println("_-------------------------------------------_");

        Movie defaultMovie = Movie.getMovie("Scifi","Star Wars");
        defaultMovie.watchMovie();

        System.out.println("_-------------------------------------------_");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter type (A for Adventure, C for comedy, " +
                    "S for Science fiction and Q for quit: ");
            String type = sc.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the Move title: ");
            String title = sc.nextLine();
            Movie move = Movie.getMovie(type,title);
            move.watchMovie();
        }

    }
}