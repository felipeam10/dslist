 package com.gamesdevsup.dslist.repositories;

 import com.gamesdevsup.dslist.entities.GameList;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
