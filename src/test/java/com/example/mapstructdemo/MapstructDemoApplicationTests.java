package com.example.mapstructdemo;

import com.example.mapstructdemo.domain.GenreType;
import com.example.mapstructdemo.domain.Movie;
import com.example.mapstructdemo.dto.MovieDto;
import com.example.mapstructdemo.mapper.MovieMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MapstructDemoApplicationTests {

    @Autowired
    MovieMapper mapper;

    @Test
    void testMapping() {
        Movie movie = new Movie(2, "Tenet", new Date(), null, 10, GenreType.ACTION);
        MovieDto movieDto = mapper.movieToMovieDto(movie);
        assert movieDto.getName().equals(movie.getTitle());
    }

}
