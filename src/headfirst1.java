public class headfirst1 {

    public static void  main ( String[] args ) {
        Movie one = new Movie();
        one.title = "Shape of waters";
        one.genre = "Romance";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Thor: Ragnarok";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
    }
}

class Movie {
    String title;
    String genre;
    int rating;

    void  playIt() {
        System.out.println("Playing the moview");
    }
}