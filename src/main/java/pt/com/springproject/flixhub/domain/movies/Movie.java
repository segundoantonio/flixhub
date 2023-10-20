package pt.com.springproject.flixhub.domain.movies;

public class Movie {

    private String name;
    private Integer duration;
    private Integer year;
    private String genre;

    public Movie(registrationDataMovies data){
        this.name = data.name();
        this.duration = data.duration();
        this.year = data.year();
        this.genre = data.genre();

    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
