package ru.oleglunko.coffeemachine.util;

import ru.oleglunko.coffeemachine.model.CoffeeMachine;
import ru.oleglunko.coffeemachine.model.beverage.Beverage;
import ru.oleglunko.coffeemachine.util.exception.IllegalCoffeeMachineStateException;

public class CoffeeMachineUtil {

    public static CoffeeMachine checkIsNotEmpty(CoffeeMachine cm, Beverage beverage) {
        checkBeanContainer(cm.getCurrentBeanWeight(), beverage.getRequiredBean());
        checkWaterTank(cm.getCurrentWaterVolume(), beverage.getRequiredWater());
        checkMilkTank(cm.getCurrentMilkVolume(), beverage.getRequiredMilk());
        return cm;
    }

    private static void checkBeanContainer(int containerCapacity, int required) {
        if (required > containerCapacity) {
            throw new IllegalCoffeeMachineStateException("Bean container is empty");
        }
    }

    private static void checkWaterTank(int tankVolume, int required) {
        if (required > tankVolume) {
            throw new IllegalCoffeeMachineStateException("Water tank is empty");
        }
    }

    private static void checkMilkTank(int tankVolume, int required) {
        if (required > tankVolume) {
            throw new IllegalCoffeeMachineStateException("Milk tank is empty");
        }
    }
}
