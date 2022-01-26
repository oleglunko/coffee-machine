package ru.oleglunko.coffeemachine.model.beverage;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Beverage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer requiredBean = 0;
    private Integer requiredWater = 0;
    private Integer requiredMilk = 0;

    public Beverage() {
    }

    public Beverage(Long id) {
        this.id = id;
    }

    public Beverage(Long id, Integer requiredBean, Integer requiredWater, Integer requiredMilk) {
        this.id = id;
        this.requiredBean = requiredBean;
        this.requiredWater = requiredWater;
        this.requiredMilk = requiredMilk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRequiredBean() {
        return requiredBean;
    }

    public void setRequiredBean(Integer requiredBean) {
        this.requiredBean = requiredBean;
    }

    public Integer getRequiredWater() {
        return requiredWater;
    }

    public void setRequiredWater(Integer requiredWater) {
        this.requiredWater = requiredWater;
    }

    public Integer getRequiredMilk() {
        return requiredMilk;
    }

    public void setRequiredMilk(Integer requiredMilk) {
        this.requiredMilk = requiredMilk;
    }
}
