package com.example.mapstructdemo.controller;

import com.example.mapstructdemo.domain.GenreType;
import com.example.mapstructdemo.domain.Movie;
import com.example.mapstructdemo.dto.MovieDto;
import com.example.mapstructdemo.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieMapper mapper;


    @RequestMapping("/list")
    public List<MovieDto> getMovies(@RequestParam(name = "filter", required = false) String filtr) {
        System.out.println(filtr);
        Movie movie1 = new Movie(2, "Tenet", new Date(), null, 10, GenreType.ACTION);
        Movie movie2 = new Movie(3, "Tenet3", new Date(), null, 10, GenreType.ACTION);
//        MovieMapper mapper = MovieMapper.INSTANCE;
        return Arrays.asList(mapper.movieToMovieDto(movie1));
    }

    @PostMapping("/list")
    public List<MovieDto> postMovies() {
        Movie movie1 = new Movie(3, "Matrix", new Date(), null, 10, GenreType.ACTION);
//        MovieMapper mapper = MovieMapper.INSTANCE;
        return Arrays.asList(mapper.movieToMovieDto(movie1));
    }
}
