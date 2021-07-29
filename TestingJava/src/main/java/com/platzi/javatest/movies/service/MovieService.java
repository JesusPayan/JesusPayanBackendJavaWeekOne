package com.platzi.javatest.movies.service;

import com.platzi.javatest.movies.data.MovieRepository;
import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;
    public MovieService(){

    }
    public MovieService(MovieRepository movieRepository){

        this.movieRepository =  movieRepository;
    }


    public Collection<Movie> findMovieByGenre(Genre genre){
        return movieRepository.findAll()
                .stream()
                .filter(movie -> movie.getGenre() == genre)
                .collect(Collectors.toList());
        //this code filters the movies by genrer
    }

    public Collection<Movie> findMoviesByLength(int length) {
    return movieRepository.findAll()
            .stream()
            .filter(movie -> movie.getMinutes() <= length)
            .collect(Collectors.toList());
    }
}
