package ClassAndObjects;

public class MovieDTO {
    String movieName;
    String heroName;
    String movieType;
    private double budget;
    static int movieCount=0;

    MovieDTO(String movieName,String heroName,String movieType,double budget){
        this.movieName=movieName;
        this.heroName=heroName;
        this.movieType=movieType;
        this.budget=budget;
        movieCount++;
    }
    String getHeroName(){
        return heroName;
    }
    String getMovieType(){
        return movieType;
    }
    int getTotalMovieCount(){
        return movieCount;
    }
    public String toString(){
        return "Movie : "+movieName+" HeroName : "+heroName+" MovieType : "+movieType+" Budget : "+budget;
    }
    public static void main(String[] args){
        MovieDTO movie1=new MovieDTO("Kgf","yash","Action",5000);
        MovieDTO movie2=new MovieDTO("Vikram","Kamal","Action",8000);
        MovieDTO movie3=new MovieDTO("I","Vikram","Action",10000);
       System.out.println(movie1.getMovieType());
       System.out.println(movie3.getHeroName());
       System.out.println(movie2);
       System.out.println(movieCount);
    }
}
