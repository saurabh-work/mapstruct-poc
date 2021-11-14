package com.example.mapstructdemo.mapper;

import com.example.mapstructdemo.domain.Movie;
import com.example.mapstructdemo.domain.Person;
import com.example.mapstructdemo.dto.MovieDto;
import com.example.mapstructdemo.dto.MovieMap;
import com.example.mapstructdemo.dto.PersonDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;

@Mapper(componentModel = "spring")
public interface MovieMapper {
//public abstract class MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper( MovieMapper.class );

    @Mapping(source = "title", target = "name")
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "releaseDate", target = "releaseDateString", dateFormat = "dd.MM.yyyy")
    MovieDto movieToMovieDto(Movie movie);
//    @Mapping(source = "year", target = "year", defaultValue = "100")
//    @Mapping(target = "cast", defaultExpression = "java(new ArrayList<PersonDto>())")
//    @Mapping(target = "year", constant = "2020")
//    public abstract MovieDto movieToMovieDto(Movie movie);

//    @AfterMapping
//    protected void initCast(Movie movie, @MappingTarget MovieDto dto) {
//        dto.setCast(new ArrayList<>());
//    }
/**
    @InheritConfiguration(name = "movieToMovieDto")
    @Mapping(target = "year", constant = "2021")
    void updateMovieDto(Movie movie, @MappingTarget MovieDto movieDto);
//
    MovieDto movieAndPersonToMovieDto(Movie movie, Person actor);
//
    @InheritInverseConfiguration(name = "movieToMovieDto")
    Movie movieDtoToMovie(MovieDto movieDto);

    PersonDto personToPersonDto(Person person);

//    default MovieDto movieToMovieDto(Movie movie)

//    default PersonDto personToPersonDto(Person person) {
//        return null;
//    }
*/
}
