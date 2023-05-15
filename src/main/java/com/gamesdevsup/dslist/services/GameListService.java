package com.gamesdevsup.dslist.services;

import com.gamesdevsup.dslist.dto.GameListDTO;
import com.gamesdevsup.dslist.entities.Game;
import com.gamesdevsup.dslist.entities.GameList;
import com.gamesdevsup.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
