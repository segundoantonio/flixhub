package pt.com.springproject.flixhub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String loadFormPage() {
        return "movies/form";
    }
}
