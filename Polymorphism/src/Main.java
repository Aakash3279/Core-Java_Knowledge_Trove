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

/*
Star Wars is a Movie film
Star Trek is a Adventure film
.. Pleasent Scene
.. Scary Music
.. Something Bad Happens
The Mask is a Comedy film
.. Something funny happens
.. laughing Music
.. Happy Ending
Guardians of Galaxy is a SciFi film
.. Bad Aliens do bad Stuff
.. Space guys chase Aliens
.. Planet Blows Up!
_-------------------------------------------_
Star Wars is a SciFi film
.. Bad Aliens do bad Stuff
.. Space guys chase Aliens
.. Planet Blows Up!
_-------------------------------------------_
Enter type (A for Adventure, C for comedy, S for Science fiction and Q for quit: s
Enter the Move title:
star wars
star wars is a SciFi film
.. Bad Aliens do bad Stuff
.. Space guys chase Aliens
.. Planet Blows Up!
Enter type (A for Adventure, C for comedy, S for Science fiction and Q for quit: q
 */