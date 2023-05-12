package br.com.lasbr.gamelist.services;

import br.com.lasbr.gamelist.dto.GameListDTO;
import br.com.lasbr.gamelist.dto.GameMinDTO;
import br.com.lasbr.gamelist.entities.GameList;
import br.com.lasbr.gamelist.repositories.GameListRepository;
import br.com.lasbr.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

    @Service
    public class GameListService {

        @Autowired
        private GameListRepository gameListRepository;

        @Transactional(readOnly = true)
        public List<GameListDTO> findAll() {
            List<GameList> result = gameListRepository.findAll();
            return result.stream().map(x -> new GameListDTO(x)).toList();
        }
    }
