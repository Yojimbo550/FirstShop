package testgroup.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import testgroup.library.model.Game;
import testgroup.library.service.GameListService;
import testgroup.library.service.GameListServiceImpl;
import java.util.List;

@Controller
public class GameListController {

    private int page;

    private GameListService gameListService = new GameListServiceImpl();

    @Autowired
    public void setGameListService(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Game game = gameListService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("game", gameListService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editGame(@ModelAttribute("game") Game game) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        gameListService.edit(game);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allGames() {
        List<Game> games = gameListService.allGames(page);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("games");
        modelAndView.addObject("gameList", games);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView greetingPage() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greetingPage");

        return modelAndView;
    }


    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public ModelAndView allGames(@RequestParam(defaultValue = "1") int page) {
        List<Game> games = gameListService.allGames(page);
        int gameCount = gameListService.gameCount();
        int pagesCount = (gameCount + 9) / 10;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("games");
        modelAndView.addObject("page", page);
        modelAndView.addObject("gameList", games);
        modelAndView.addObject("gamesCount", gameCount);
        modelAndView.addObject("pagesCount", pagesCount);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addGame(@ModelAttribute("game") Game game) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        gameListService.add(game);
        return modelAndView;
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteGame(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Game game = gameListService.getById(id);
        gameListService.delete(game);
        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView deletePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deletePage");
        return modelAndView;
    }


}
//
