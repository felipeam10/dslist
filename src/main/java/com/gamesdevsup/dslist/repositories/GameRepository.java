package com.gamesdevsup.dslist.repositories;

import com.gamesdevsup.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
