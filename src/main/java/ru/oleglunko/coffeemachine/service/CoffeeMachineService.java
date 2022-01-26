package ru.oleglunko.coffeemachine.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.oleglunko.coffeemachine.model.CoffeeMachine;
import ru.oleglunko.coffeemachine.repository.CoffeeMachineRepository;

@Service
public class CoffeeMachineService {

    private CoffeeMachineRepository repository;

    public CoffeeMachineService(CoffeeMachineRepository repository) {
        this.repository = repository;
    }

    public CoffeeMachine get() {
        return repository.findAll().stream()
                .findFirst()
                .orElse(null);
    }

    @Transactional
    public void updateBean() {
        CoffeeMachine machine = get();
        machine.setCurrentBeanWeight(machine.getMaxMilkTankVolume());
    }

    @Transactional
    public void updateWater() {
        CoffeeMachine machine = get();
        machine.setCurrentWaterVolume(machine.getMaxWaterTankVolume());
    }

    @Transactional
    public void updateMilk() {
        CoffeeMachine machine = get();
        machine.setCurrentMilkVolume(machine.getMaxMilkTankVolume());
    }
}
