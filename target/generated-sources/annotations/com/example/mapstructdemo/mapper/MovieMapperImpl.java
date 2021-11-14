package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.Movie;
import com.example.mapstructdemo.dto.MovieDto;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-14T20:36:32+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Homebrew)"
)
@Component
public class MovieMapperImpl implements MovieMapper {

    @Override
    public MovieDto movieToMovieDto(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieDto movieDto = new MovieDto();

        movieDto.setName( movie.getTitle() );
        if ( movie.getReleaseDate() != null ) {
            movieDto.setReleaseDateString( new SimpleDateFormat( "dd.MM.yyyy" ).format( movie.getReleaseDate() ) );
        }
        movieDto.setReleaseDate( movie.getReleaseDate() );
        movieDto.setAwards( stringStreamToStringSet( movie.getAwards() ) );
        movieDto.setYear( String.valueOf( movie.getYear() ) );
        if ( movie.getGenre() != null ) {
            movieDto.setGenre( movie.getGenre().name() );
        }

        return movieDto;
    }

    protected Set<String> stringStreamToStringSet(Stream<String> stream) {
        if ( stream == null ) {
            return null;
        }

        return stream
        .collect( Collectors.toCollection( HashSet<String>::new ) );
    }
}
