public class NextMain {
    public static void main(String[] args) {
        Movie move = Movie.getMovie("A","Jaws");
        move.watchMovie();

        Adventure jaws = (Adventure)Movie.getMovie("A","Jaws"); //casting, if typed c case caste exception
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","AirPlane");
        Comedy comedy1 = (Comedy) comedy;
        comedy1.watchMovie();

        var airplane  = Movie.getMovie("C","Hotel Transylvania");
        airplane.watchMovie();

        var minion = new Comedy("Minions");
        minion.watchComedy();

        Object unknownObject = Movie.getMovie("S","Star Wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){ //without using this and using object class fro factory method
            Comedy c = (Comedy) unknownObject;
           // c.watchComedy();
            c.watchMovie();
        }else if(unknownObject instanceof Adventure){ // checks the instance is from adventure or not
            ((Adventure) unknownObject).watchAdventure();
        }else if(unknownObject instanceof SciFi syfi){ //pattern matching support (17 jdk) instance of operator
            syfi.watchScifi(); //extract data fro the object without casting
        }
    }
}


/*
Jaws is a Adventure film
.. Pleasent Scene
.. Scary Music
.. Something Bad Happens
Jaws is a Adventure film
.. Pleasent Scene
.. Scary Music
.. Something Bad Happens
AirPlane is a Comedy film
.. Something funny happens
.. laughing Music
.. Happy Ending
Hotel Transylvania is a Comedy film
.. Something funny happens
.. laughing Music
.. Happy Ending
Watching a Comedy!
Watching a Scifi!
 */