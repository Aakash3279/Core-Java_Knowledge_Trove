public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName(); //getClass-> java.lang.Obj and method chaining
        System.out.println(title +" is a "+ instanceType+" film");
    }

    public static Movie getMovie(String type,String title){ //factory method in software design patterns
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SciFi(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Scary Music",
                "Something Bad Happens");
    }
    public void watchAdventure(){
        System.out.println("Watching an Adventure!");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "laughing Music",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy!");
    }
}

class SciFi extends Movie{
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do bad Stuff",
                "Space guys chase Aliens",
                "Planet Blows Up!");
    }
    public void watchScifi(){
        System.out.println("Watching a Scifi!");
    }
}