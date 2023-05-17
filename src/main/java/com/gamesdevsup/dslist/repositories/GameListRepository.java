package com.gamesdevsup.dslist.repositories;

import com.gamesdevsup.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying
    @Query( nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
//    SELECT TB_BELONGING .*, TB_GAME.TITLE FROM TB_BELONGING
//        INNER JOIN TB_GAME ON TB_GAME.ID = TB_BELONGING.GAME_ID
//        WHERE LIST_ID = 2
//        ORDER BY POSITION