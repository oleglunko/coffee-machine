package ru.oleglunko.coffeemachine.factory;

import org.springframework.stereotype.Component;
import ru.oleglunko.coffeemachine.model.beverage.Americano;
import ru.oleglunko.coffeemachine.model.beverage.Beverage;
import ru.oleglunko.coffeemachine.model.beverage.Espresso;
import ru.oleglunko.coffeemachine.model.beverage.Latte;

@Component
public class BeverageFactory {

   public Beverage createBeverageByType(String type) {
       if (type.equalsIgnoreCase("americano")) {
           return new Americano();
       } else if (type.equalsIgnoreCase("espresso")) {
           return new Espresso();
       } else if (type.equalsIgnoreCase("latte")) {
           return new Latte();
       } else {
           throw new UnsupportedOperationException(type + "is not supported");
       }
   }
}
