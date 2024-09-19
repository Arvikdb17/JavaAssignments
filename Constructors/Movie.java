package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private double rating;

    private static int movieCount = 0;
    public Movie(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++;
    }

   public static int getMovieCount(){
        return movieCount;
   }
    @Override
    public String toString() {
        return "MovieDTO [Title=" + title + ", Director=" + director + ", Release Year=" + releaseYear + ", Rating=" + rating + "]";
    }

    public static void addAndDisplayMovies() {
        List<Movie> movies = new ArrayList<Movie>();


        movies.add(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        movies.add(new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", 1972, 9.2));
        display(movies);
    }
        public static void display(List<Movie> movies){
        for (Movie movie : movies) {
            System.out.println(movie);
        }


        System.out.println("Total number of movies created: " + Movie.getMovieCount());
    }


    public static void main(String[] args) {

        addAndDisplayMovies();
    }
}
