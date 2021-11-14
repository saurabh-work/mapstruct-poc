package com.example.mapstructdemo.dto;

import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDto {
    private String id;
    private String name;
    private Date releaseDate;
    private String releaseDateString;
    private List<PersonDto> cast;
    private Set<String> awards;
    private PersonDto hero;

    private String year;

//    @Getter(value= AccessLevel.NONE)
//    @Setter(value=AccessLevel.NONE)
    public String genre;
}
