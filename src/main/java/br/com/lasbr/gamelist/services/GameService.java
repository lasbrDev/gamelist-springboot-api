package br.com.lasbr.gamelist.services;

import br.com.lasbr.gamelist.dto.GameMinDTO;
import br.com.lasbr.gamelist.entities.Game;
import br.com.lasbr.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class GameService {

        @Autowired
        private GameRepository gameRepository;
        public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            return result.stream().map(x -> new GameMinDTO(x)).toList();
        }
    }
