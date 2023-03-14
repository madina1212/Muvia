import java.util.Comparator;
import java.util.List;
public class MovieImpl implements Findable,Sortable {
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies, String name) {
        for (Movie movie: movies){
            if(movie.getName().equals(name)){
                System.out.println(movie);
            }
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies, String name) {
        for (Movie movie:movies) {
            for (Cast cast:movie.getCast()) {
                if(cast.getActorFullName().equals(name)){
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies, int year) {
        for (Movie movie:movies) {
            if(movie.getYear()==year){
                System.out.println(movie);
            }

        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies, String name) {
        for (Movie movie:movies) {
            if(movie.getDirector().getName().equals(name)){
                System.out.println(movie);
            }
        }
    }


    @Override
    public void findMovieByDescription(List<Movie> movies, String name) {
        for (Movie movie:movies) {
            if(movie.getDescription().equals(name)){
                System.out.println(movie);
            }

        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        for (Movie movie:movies) {
            for (Cast cast: movie.getCast()) {
                if(cast.getRole().equals(role)){
                    System.out.println(cast);
                }

            }
        }

    }


    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        });

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDirector().getName().compareTo(o2.getName());
            }
        });

    }
}
