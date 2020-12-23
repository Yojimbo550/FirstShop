package testgroup.library.service;

import org.springframework.stereotype.Service;
import testgroup.library.model.Game;

import java.util.List;

public interface GameListService {
    List<Game> allGames(int page);
    void add(Game game);
    void delete(Game game);
    void edit(Game game);
    Game getById(int id);
    int gameCount();
}
