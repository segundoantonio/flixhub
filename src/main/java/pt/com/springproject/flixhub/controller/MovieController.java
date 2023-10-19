package pt.com.springproject.flixhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.com.springproject.flixhub.domain.movies.registrationDataMovies;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String loadFormPage() {
        return "movies/form";
    }

    @PostMapping
    public String registerMovies(registrationDataMovies data) {
        System.out.println(data);
        return "movies/form";
    }
}
