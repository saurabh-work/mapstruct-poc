package com.example.mapstructdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    private int id;
    private String title;
    private Date releaseDate;
//    private Person actor;
//    private List<Person> cast;
    private Stream<String> awards;
    private int year;
    private GenreType genre;
}
