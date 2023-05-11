package com.gamesdevsup.dslist.services;

import com.gamesdevsup.dslist.dto.GameMinDTO;
import com.gamesdevsup.dslist.entities.Game;
import com.gamesdevsup.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
