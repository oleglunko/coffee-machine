package ru.oleglunko.coffeemachine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoffeeMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer currentBeanWeight;

    private Integer currentWaterVolume;

    private Integer currentMilkVolume;

    private Integer maxBeanContainerCapacity;

    private Integer maxWaterTankVolume;

    private Integer maxMilkTankVolume;

    public CoffeeMachine() {
    }

    public CoffeeMachine(Integer id, String name, Integer currentBeanWeight, Integer currentWaterVolume, Integer currentMilkVolume, Integer maxBeanContainerCapacity, Integer maxWaterTankVolume, Integer maxMilkTankVolume) {
        this.id = id;
        this.name = name;
        this.currentBeanWeight = currentBeanWeight;
        this.currentWaterVolume = currentWaterVolume;
        this.currentMilkVolume = currentMilkVolume;
        this.maxBeanContainerCapacity = maxBeanContainerCapacity;
        this.maxWaterTankVolume = maxWaterTankVolume;
        this.maxMilkTankVolume = maxMilkTankVolume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentBeanWeight() {
        return currentBeanWeight;
    }

    public void setCurrentBeanWeight(Integer currentBeanWeight) {
        this.currentBeanWeight = currentBeanWeight;
    }

    public Integer getCurrentWaterVolume() {
        return currentWaterVolume;
    }

    public void setCurrentWaterVolume(Integer currentWaterVolume) {
        this.currentWaterVolume = currentWaterVolume;
    }

    public Integer getCurrentMilkVolume() {
        return currentMilkVolume;
    }

    public void setCurrentMilkVolume(Integer currentMilkVolume) {
        this.currentMilkVolume = currentMilkVolume;
    }

    public Integer getMaxBeanContainerCapacity() {
        return maxBeanContainerCapacity;
    }

    public void setMaxBeanContainerCapacity(Integer maxBeanContainerCapacity) {
        this.maxBeanContainerCapacity = maxBeanContainerCapacity;
    }

    public Integer getMaxWaterTankVolume() {
        return maxWaterTankVolume;
    }

    public void setMaxWaterTankVolume(Integer maxWaterTankVolume) {
        this.maxWaterTankVolume = maxWaterTankVolume;
    }

    public Integer getMaxMilkTankVolume() {
        return maxMilkTankVolume;
    }

    public void setMaxMilkTankVolume(Integer maxMilkTankVolume) {
        this.maxMilkTankVolume = maxMilkTankVolume;
    }
}
