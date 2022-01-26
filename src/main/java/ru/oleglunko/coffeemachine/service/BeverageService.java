package ru.oleglunko.coffeemachine.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.oleglunko.coffeemachine.factory.BeverageFactory;
import ru.oleglunko.coffeemachine.model.CoffeeMachine;
import ru.oleglunko.coffeemachine.model.beverage.Beverage;
import ru.oleglunko.coffeemachine.repository.BeverageRepository;
import ru.oleglunko.coffeemachine.util.CoffeeMachineUtil;

@Service
public class BeverageService {

    private CoffeeMachineService coffeeMachineService;
    private BeverageFactory factory;
    private BeverageRepository repository;

    public BeverageService(CoffeeMachineService coffeeMachineService, BeverageRepository repository, BeverageFactory factory) {
        this.coffeeMachineService = coffeeMachineService;
        this.repository = repository;
        this.factory = factory;
    }

    @Transactional
    public void make(String type) {
        Beverage beverage = factory.createBeverageByType(type);
        CoffeeMachine cm = CoffeeMachineUtil.checkIsNotEmpty(coffeeMachineService.get(), beverage);
        prepareAndSave(beverage, cm);
    }

    private void prepareAndSave(Beverage beverage, CoffeeMachine cm) {
        cm.setCurrentBeanWeight(cm.getCurrentBeanWeight() - beverage.getRequiredBean());
        cm.setCurrentWaterVolume(cm.getCurrentWaterVolume() - beverage.getRequiredWater());
        cm.setCurrentMilkVolume(cm.getCurrentMilkVolume() - beverage.getRequiredMilk());
        repository.save(beverage);
    }
}