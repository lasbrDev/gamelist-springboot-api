package br.com.lasbr.gamelist.repositories;

import br.com.lasbr.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface GameRepository extends JpaRepository<Game, Long> {
    }
