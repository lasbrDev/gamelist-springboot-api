package br.com.lasbr.gamelist.controllers;

import br.com.lasbr.gamelist.dto.GameDTO;
import br.com.lasbr.gamelist.dto.GameMinDTO;
import br.com.lasbr.gamelist.entities.Game;
import br.com.lasbr.gamelist.repositories.GameRepository;
import br.com.lasbr.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/games")
    public class GameController {

        @Autowired
        private GameRepository gameRepository;
        @Autowired
        private GameService gameService;

        @GetMapping("/{id}")
        public GameDTO findById(@PathVariable Long id) {
            GameDTO result = gameService.findById(id);
            return result;
        }

        @GetMapping
        public List<GameMinDTO> findAll() {
            List<GameMinDTO> result = gameService.findAll();
            return result;
        }
    }
