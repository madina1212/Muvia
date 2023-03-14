import java.util.List;
public interface Findable {
    List<Movie>getAllMovies(List<Movie>movies);
    void findMovieByName(List<Movie>movies, String name);
    void findMovieByActorName(List<Movie>movies, String name);
    void findMovieByYear(List<Movie> movies, int year);
    void findMovieByDirector(List<Movie>movies, String name);
    void findMovieByDescription(List<Movie>movies, String name);
    void findMovieByRole(List<Movie>movies, String role);
}
