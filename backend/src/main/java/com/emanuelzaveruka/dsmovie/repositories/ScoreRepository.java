package com.emanuelzaveruka.dsmovie.repositories;

import com.emanuelzaveruka.dsmovie.entities.Score;
import com.emanuelzaveruka.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
