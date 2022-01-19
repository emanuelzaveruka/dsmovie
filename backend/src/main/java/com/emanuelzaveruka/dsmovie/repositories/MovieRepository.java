package com.emanuelzaveruka.dsmovie.repositories;

import com.emanuelzaveruka.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
