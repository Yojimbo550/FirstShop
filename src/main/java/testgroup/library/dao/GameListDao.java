package testgroup.library.dao;

import testgroup.library.model.Game;

import java.util.List;

public interface GameListDao {
    List<Game> allGames(int page);
    void add(Game game);
    void delete(Game game);
    void edit(Game game);
    Game getById(int id);
    int gameCount();
}

//BD
