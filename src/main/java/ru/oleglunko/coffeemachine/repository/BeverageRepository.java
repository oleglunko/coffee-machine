package ru.oleglunko.coffeemachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.oleglunko.coffeemachine.model.beverage.Beverage;

@Repository
public interface BeverageRepository extends JpaRepository<Beverage, Long> {
}
