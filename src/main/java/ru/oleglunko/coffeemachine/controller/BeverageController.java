package ru.oleglunko.coffeemachine.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.oleglunko.coffeemachine.service.BeverageService;

@Api(tags = "Напитки")
@RestController
@RequestMapping("/api/coffee-machine/beverages/")
public class BeverageController {

    private static final Logger log = LoggerFactory.getLogger(BeverageController.class);

    private BeverageService service;

    public BeverageController(BeverageService service) {
        this.service = service;
    }

    @ApiOperation(value = "Приготовить напиток")
    @PostMapping("/{type}")
    @ResponseStatus(HttpStatus.CREATED)
    public void make(
            @ApiParam(
                    name = "type",
                    type = "String",
                    value = "Доступные типы: americano, espresso, latte")
            @PathVariable String type) {
        log.info("create {}", type);
        service.make(type);
    }
}
