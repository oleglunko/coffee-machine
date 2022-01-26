package ru.oleglunko.coffeemachine.model.beverage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Americano")
public class Americano extends Beverage {

    private Integer requiredBean = 10;
    private Integer requiredWater = 120;
    private Integer requiredMilk = 0;


    public Americano() {
    }

    public Americano(Long id, Integer requiredBean, Integer requiredWater, Integer requiredMilk) {
        super(id);
        this.requiredBean = requiredBean;
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
    }
}
