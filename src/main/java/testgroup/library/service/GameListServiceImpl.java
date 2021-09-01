package testgroup.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.library.dao.GameListDao;
import testgroup.library.dao.GameListDaoImpl;
import testgroup.library.model.Game;

import java.util.List;

@Service
public class GameListServiceImpl implements GameListService {


    private GameListDao gameListDao = new GameListDaoImpl();

    @Autowired
    public void setGameListDao(GameListDao gameListDao) {
        this.gameListDao = gameListDao;
    }

    @Override
    @Transactional
    public List<Game> allGames(int page) {
        return gameListDao.allGames(page);
    }

    @Transactional
    @Override
    public void add(Game game) {
        gameListDao.add(game);
    }

    @Transactional
    @Override
    public void delete(Game game) {
        gameListDao.delete(game);
    }

    @Transactional
    @Override
    public void edit(Game game) {
        gameListDao.edit(game);
    }

    @Transactional
    @Override
    public Game getById(int id) {
        return gameListDao.getById(id);
    }

    @Override
    @Transactional
    public int gameCount() {
        return gameListDao.gameCount();
    }
}
