package pt.com.springproject.flixhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pt.com.springproject.flixhub.domain.movies.UpdatingDataMovies;
import pt.com.springproject.flixhub.domain.movies.Movie;
import pt.com.springproject.flixhub.domain.movies.MovieRepository;
import pt.com.springproject.flixhub.domain.movies.RegistrationDataMovies;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping("/form")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var movie = repository.getReferenceById(id);
            model.addAttribute("movie", movie);
        }
        return "movies/form";
    }

    @GetMapping
    public String loadListingPage(Model model) {
        model.addAttribute("list", repository.findAll());
        return "movies/listing";
    }

    @PostMapping
    @Transactional
    public String registerMovies(RegistrationDataMovies data) {
        var movie = new Movie(data);
        repository.save(movie);


        return "redirect:/movies";
    }

    @PutMapping
    @Transactional
    public String updateMovies(UpdatingDataMovies data) {
        var movie = repository.getReferenceById(data.id());
        movie.updateData(data);

        return "redirect:/movies";
    }

    @DeleteMapping
    @Transactional
    public String deleteMovie(Long id) {
        repository.deleteById(id);
        return "redirect:/movies";
    }
}
