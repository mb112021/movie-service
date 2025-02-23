package com.mb.repository;

import com.mb.domain.Genre;
import com.mb.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository  extends JpaRepository<Movie,Integer> {

    List<Movie> findByGenre(Genre genre);
}
