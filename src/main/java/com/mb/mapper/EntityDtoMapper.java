package com.mb.mapper;

import com.mb.dto.MovieDto;
import com.mb.entity.Movie;

public class EntityDtoMapper {
    public static MovieDto toDto(Movie movie){

        return new MovieDto(movie.getId(),
                movie.getTitle(),
                movie.getReleaseYear(), movie.getGenre());
    }
}
