package com.movieticketbooking.showz.usercontroller;

import com.movieticketbooking.showz.model.AdminInfo;
import com.movieticketbooking.showz.service.AdminInfoService;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
// @RequestMapping("/admin/movies")
public class AdminInfoController {

    private final AdminInfoService adminInfoService;

    // @Autowired
    public AdminInfoController(AdminInfoService adminInfoService) {
        this.adminInfoService = adminInfoService;
    }

    @GetMapping("/adminmovies")
    public String getAllMovies(Model model) {
        List<AdminInfo> movies = adminInfoService.findAllAdminInfo();
        model.addAttribute("movies", movies);
        return "adminmovies";
    }

    @GetMapping("/{movieId}")
    public String getMovieById(@PathVariable int movieId, Model model) {
        AdminInfo movie = adminInfoService.findAdminInfoById(movieId);
        model.addAttribute("movie", movie);
        return "movieDetails"; // You can create a view for displaying movie details
    }

    @GetMapping("/name")
    public String getMoviesByName(@RequestParam String movieName, Model model) {
        List<AdminInfo> movies = adminInfoService.findAdminInfoByMovieName(movieName);
        model.addAttribute("movies", movies);
        return "adminmovies";
    }

    @PostMapping("/adminmovies")
    public String addMovie(@ModelAttribute AdminInfo movie) {
        adminInfoService.saveOrUpdateAdminInfo(movie);
        return "redirect:/adminmovies"; // Redirect to the movie list after adding
    }

    @PostMapping("/{movieId}")
    public String updateMovie(@PathVariable int movieId, @ModelAttribute AdminInfo movie) {
        movie.setMovieId(movieId);
        adminInfoService.saveOrUpdateAdminInfo(movie);
        return "redirect:/adminmovies"; // Redirect to the movie list after updating
    }

    @PostMapping("/delete/{movieId}")
    public String deleteMovie(@PathVariable int movieId) {
        adminInfoService.deleteAdminInfoById(movieId);
        return "redirect:/adminmovies"; // Redirect to the movie list after deleting
    }
    
    @GetMapping("/admindashboard")
    public String admindashboard() {
        return "admindashboard";
    }
}
