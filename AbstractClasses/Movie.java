package AbstractClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Movie {
    private String title;
    private String director;
    private double duration;

    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }

    public abstract String getGenre();

    public abstract String getPlot();

    public abstract double getRating();

    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println("Genre: " + getGenre());
        System.out.println("Plot: " + getPlot());
        System.out.println("Rating: " + getRating() + "/10");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();

        while (true) {
            System.out.println("Enter movie type (action/comedy/drama) or 'done' to finish: ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("done")) {
                break;
            }

            System.out.println("Enter movie title: ");
            String title = scanner.nextLine();

            System.out.println("Enter director: ");
            String director = scanner.nextLine();

            System.out.println("Enter duration (in hours): ");
            double duration = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter rating (out of 10): ");
            double rating = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter plot: ");
            String plot = scanner.nextLine();

            switch (type.toLowerCase()) {
                case "action":
                    movies.add(new ActionMovie(title, director, duration, rating, plot));
                    break;
                case "comedy":
                    movies.add(new ComedyMovie(title, director, duration, rating, plot));
                    break;
                case "drama":
                    movies.add(new DramaMovie(title, director, duration, rating, plot));
                    break;
                default:
                    System.out.println("Invalid movie type");
                    break;
            }
        }

        scanner.close();

        System.out.println("\nMovies in your collection:");
        for (Movie movie : movies) {
            movie.displayDetails();
            System.out.println();
        }
    }
}
class ActionMovie extends Movie {
    private double rating;
    private String plot;

    public ActionMovie(String title, String director, double duration, double rating, String plot) {
        super(title, director, duration);
        this.rating = rating;
        this.plot = plot;
    }


    public String getGenre() {
        return "Action";
    }
    public String getPlot() {
        return plot;
    }


    public double getRating() {
        return rating;
    }
}
class ComedyMovie extends Movie {
    private double rating;
    private String plot;

    public ComedyMovie(String title, String director, double duration, double rating, String plot) {
        super(title, director, duration);
        this.rating = rating;
        this.plot = plot;
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public String getPlot() {
        return plot;
    }

    @Override
    public double getRating() {
        return rating;
    }
}
class DramaMovie extends Movie {
    private double rating;
    private String plot;

    public DramaMovie(String title, String director, double duration, double rating, String plot) {
        super(title, director, duration);
        this.rating = rating;
        this.plot = plot;
    }

    @Override
    public String getGenre() {
        return "Drama";
    }

    @Override
    public String getPlot() {
        return plot;
    }

    @Override
    public double getRating() {
        return rating;
    }
}