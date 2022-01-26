package ru.oleglunko.coffeemachine.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.oleglunko.coffeemachine.model.MenuItem;
import ru.oleglunko.coffeemachine.repository.MenuItemRepository;

import java.util.List;

@Api(tags = "Меню")
@RestController
@RequestMapping("/api/coffee-machine/menu")
public class MenuItemController {

    private static final Logger log = LoggerFactory.getLogger(MenuItemController.class);

    private MenuItemRepository repository;

    public MenuItemController(MenuItemRepository repository) {
        this.repository = repository;
    }

    @ApiOperation(value = "Показать доступные напитки")
    @GetMapping
    public List<MenuItem> getMenu() {
        log.info("get menu");
        return repository.findAll();
    }
}
