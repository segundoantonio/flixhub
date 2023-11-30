package pt.com.springproject.flixhub.domain.movies;

public record RegistrationDataMovies(
        String name,
        Integer duration,
        Integer year,
        String genre
) {
}
