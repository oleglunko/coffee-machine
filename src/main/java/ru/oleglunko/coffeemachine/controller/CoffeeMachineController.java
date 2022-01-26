package ru.oleglunko.coffeemachine.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.oleglunko.coffeemachine.model.CoffeeMachine;
import ru.oleglunko.coffeemachine.service.CoffeeMachineService;

@Api(tags = "Управление состоянием кофемашины")
@RestController
@RequestMapping("/api/coffee-machine")
public class CoffeeMachineController {

    private static final Logger log = LoggerFactory.getLogger(CoffeeMachineController.class);

    private CoffeeMachineService service;

    public CoffeeMachineController(CoffeeMachineService service) {
        this.service = service;
    }

    @ApiOperation(value = "Вывести информацию о кофемашине и ее состоянии")
    @GetMapping
    public CoffeeMachine getInfo() {
        log.info("get status info");
        return service.get();
    }

    @ApiOperation(value = "Заполнить емкость для кофе")
    @PutMapping("/bean")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBean() {
        log.info("update bean");
        service.updateBean();
    }

    @ApiOperation(value = "Заполнить емкость для воды")
    @PutMapping("/water")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateWater() {
        log.info("update water");
        service.updateWater();
    }

    @ApiOperation(value = "Заполнить емкость для молока")
    @PutMapping("/milk")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMilk() {
        log.info("update milk");
        service.updateMilk();
    }
}
