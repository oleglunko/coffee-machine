package ru.oleglunko.coffeemachine.model.beverage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Espresso")
public class Espresso extends Beverage {

    private Integer requiredBean = 7;
    private Integer requiredWater = 90;
    private Integer requiredMilk = 0;

    public Espresso() {
    }

    public Espresso(Long id, Integer requiredBean, Integer requiredWater, Integer requiredMilk) {
        super(id);
        this.requiredBean = requiredBean;
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
    }
}
