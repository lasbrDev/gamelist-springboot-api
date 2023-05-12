package br.com.lasbr.gamelist.repositories;

import br.com.lasbr.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface GameListRepository extends JpaRepository<GameList, Long> {
    }
