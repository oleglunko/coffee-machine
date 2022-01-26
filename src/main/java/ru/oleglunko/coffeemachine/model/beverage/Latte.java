package ru.oleglunko.coffeemachine.model.beverage;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Latte")
public class Latte extends Beverage {

    private Integer requiredBean = 7;
    private Integer requiredWater = 90;
    private Integer requiredMilk = 150;

    public Latte() {
    }

    public Latte(Long id, Integer requiredBean, Integer requiredWater, Integer requiredMilk) {
        super(id);
        this.requiredBean = requiredBean;
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
    }
}
