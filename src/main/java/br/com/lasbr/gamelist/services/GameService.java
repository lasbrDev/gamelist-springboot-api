package br.com.lasbr.gamelist.services;

import br.com.lasbr.gamelist.dto.GameDTO;
import br.com.lasbr.gamelist.dto.GameMinDTO;
import br.com.lasbr.gamelist.entities.Game;
import br.com.lasbr.gamelist.projections.GameMinProjection;
import br.com.lasbr.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

    @Service
    public class GameService {

        @Autowired
        private GameRepository gameRepository;
        @Transactional(readOnly = true)
        public GameDTO findById(Long id) {
            Game result = gameRepository.findById(id).get();
            return new GameDTO(result);
        }
        @Transactional(readOnly = true)
        public List<GameMinDTO> findAll() {
            List<Game> result = gameRepository.findAll();
            return result.stream().map(x -> new GameMinDTO(x)).toList();
        }

        public List<GameMinDTO> findByList(Long listId) {
            List<GameMinProjection> result = gameRepository.searchByList(listId);
            return  result.stream().map(x -> new GameMinDTO(x)).toList();
        }
    }
