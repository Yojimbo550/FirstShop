package testgroup.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testgroup.library.model.Game;
import java.util.*;

@Repository
public class GameListDaoImpl implements GameListDao {


    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override

    @SuppressWarnings("unchecked")
    public List<Game> allGames(int page) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Game").setFirstResult(10 * (page - 1)).setMaxResults(10).list();
    }

    public int gameCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from Game", Number.class).getSingleResult().intValue();
    }

    @Override
    public void add(Game game) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(game);
    }

    @Override
    public void delete(Game game) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(game);
    }

    @Override
    public void edit(Game game) {
        Session session = sessionFactory.getCurrentSession();
        session.update(game);
    }

    @Override
    public Game getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Game.class, id);
    }
}