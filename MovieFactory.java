import Movies.Batman;
import Movies.Movie;
import Movies.Spiderman;
import Movies.Superman;

public class MovieFactory {
    public Movie getMovie(String selectedMovie){
        if(selectedMovie.equals("Spiderman")){
            return new Spiderman();
        }else if(selectedMovie.equals("Superman")){
            return new Superman();
        }else if(selectedMovie.equals("Batman")){
            return new Batman();
        }
        return null;
    }
}
