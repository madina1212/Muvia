import java.util.*;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director("Douglas", "Maskinnon");
        Director director2 = new Director("Sone", "Director");
        Director director3 = new Director("Peter","Jackson");
        Director director4 = new Director("Happy","Guy");
        Director director5 = new Director("Anthony","Russo");
        Director director6 = new Director("Paul","meGuiana");

        LinkedList<Cast> casts1 = new LinkedList<>();
        casts1.add(new Cast("Daniel Mays","Arthur Young"));
        casts1.add(new Cast("David Tenant","Crowley"));
        casts1.add(new Cast("Ned Denna","Hastur"));

        LinkedList<Cast> casts2 = new LinkedList<>();
        casts2.add(new Cast("Orlando Bloom", "Philo"));
        casts2.add(new Cast("Cara Delevingne", "Vignette Stonemoss"));
        casts2.add(new Cast("Simon McBurney", "Runyon Millworthy"));

        LinkedList<Cast> casts3 = new LinkedList<>();
        casts3.add(new Cast("Daniel Radcliffe","Hermione Granger"));
        casts3.add(new Cast("Emma Watson","Hermione Granger"));
        casts3.add(new Cast("Rupert Grint","Ron Weasley"));

        LinkedList<Cast> casts4 = new LinkedList<>();
        casts4.add(new Cast("Lee Pace", "Thrandiul"));
        casts4.add(new Cast("Martin Freeman", "Bilbo Baggins"));
        casts4.add(new Cast("Orlando Bloom", "Legolas"));

        LinkedList<Cast> casts5 = new LinkedList<>();
        casts5.add(new Cast("Martin Freemen", "Bilbo Beggins"));
        casts5.add(new Cast("Richard Armitage", "Thorin"));
        casts5.add(new Cast("Evangelina Lilly", "Tauriel"));

        LinkedList<Cast> casts6 = new LinkedList<>();
        casts6.add(new Cast("Chris Hems worth", "Thor"));
        casts6.add(new Cast("Mark Ruffalo", "HULK"));
        casts6.add(new Cast("Robert Downey", "Tony Stark"));


        Movie movie1 = new Movie("Good omens", 2019, "TV SERIES ", director1,casts1);
        Movie movie2 = new Movie("Carnival Row", 2019, "TV SERIES",director2,casts2);
        Movie movie3 = new Movie("Harry Poter", 2005, "MOVIE", director3,casts3);
        Movie movie4 = new Movie("The Habbit: The Desolation of Smaug", 2013, "MOVIE", director4,casts4);
        Movie movie5 = new Movie("The Habbit: The battle of the five Armies", 2013, "MOVIE", director5,casts5);
        Movie movie6 = new Movie("Avergens: Endgame", 2019, "MOVIE", director6,casts6);


        Scanner scanner = new Scanner(System.in);

        ArrayList<Movie> list = new ArrayList<>(Arrays.asList(movie1,movie2,movie3,movie4,movie5,movie6));

        MovieImpl movie = new MovieImpl();

        while (true){
            System.out.println("1. getAllMovies: 2. findMovieByName: 3. findMovieByActorName:" +
                    " 4. findMovieByYear: 5. findMovieByDirector: 6. findMovieByDescription:  7. findMovieByRole: ");
            System.out.println("8. sortByMovieName: 9.  sortByYear: 10. sortByDirector: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1 -> System.out.println(movie.getAllMovies(list));
                case 2 -> {
                    System.out.println("Enter a movie name: ");
                    String name = new Scanner(System.in).nextLine();
                    movie.findMovieByName(list, name);
                }
                case 3 -> {
                    System.out.println("Enter a Actor name: ");
                    String actor = new Scanner(System.in).nextLine();
                    movie.findMovieByActorName(list, actor);
                }
                case 4 -> {
                    System.out.println("Enter a movie year: ");
                    int year = new Scanner(System.in).nextInt();
                    movie.findMovieByYear(list, year);
                }
                case 5 -> {
                    System.out.println("Enter a Director name: ");
                    String director = new Scanner(System.in).nextLine();
                    movie.findMovieByDirector(list, director);
                }
                case 6 -> {
                    System.out.println("Enter a movie description: ");
                    String description = new Scanner(System.in).nextLine();
                    movie.findMovieByDescription(list, description);
                }
                case 7 -> {
                    System.out.println("Enter a role");
                    String role = new Scanner(System.in).nextLine();
                    movie.findMovieByRole(list, role);
                }
                case 8 -> {
                    System.out.println();
                    movie.sortByMovieName(list);
                }
                case 9 -> {
                    System.out.println();
                    movie.sortByDirector(list);
                }
                case 10 -> {
                    System.out.println();
                    movie.sortByYear(list);
                }
            }

        }

    }
}