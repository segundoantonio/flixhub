package pt.com.springproject.flixhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.com.springproject.flixhub.domain.movies.Movie;
import pt.com.springproject.flixhub.domain.movies.registrationDataMovies;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    @GetMapping("/form")
    public String loadFormPage() {
        return "movies/form";
    }

    @GetMapping
    public String loadListingPage(Model model) {
        model.addAttribute("list", movies);
        return "movies/listing";
    }

    @PostMapping
    public String registerMovies(registrationDataMovies data) {
        var movie = new Movie(data);
        movies.add(movie);


        return "redirect:/movies";
    }
}
