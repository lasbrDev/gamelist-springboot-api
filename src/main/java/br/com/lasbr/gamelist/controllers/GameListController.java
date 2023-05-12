package br.com.lasbr.gamelist.controllers;


import br.com.lasbr.gamelist.dto.GameListDTO;
import br.com.lasbr.gamelist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/lists")
    public class GameListController {

        @Autowired
        private GameListService gameListService;

        @GetMapping
        public List<GameListDTO> findAll() {
            List<GameListDTO> result = gameListService.findAll();
            return result;
        }
    }
