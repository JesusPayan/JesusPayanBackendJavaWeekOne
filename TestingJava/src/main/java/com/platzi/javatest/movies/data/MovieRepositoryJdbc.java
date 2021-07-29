package com.platzi.javatest.movies.data;

import com.platzi.javatest.movies.model.Genre;
import com.platzi.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {
    private JdbcTemplate jdbcTemplate;
    private static RowMapper<Movie> movieMapper;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {

        return null;
    }

    @Override
    public Collection<Movie> findAll() {


         movieMapper = new RowMapper<Movie>() {
            @Override
            public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Movie(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("minutes"),
                        Genre.valueOf(resultSet.getString("genre")));
            }
        };
        return jdbcTemplate.query("SELECT * FROM movies",movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }
}
