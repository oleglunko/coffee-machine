DELETE FROM coffee_machine;
DELETE FROM menu_item;

INSERT INTO coffee_machine (name, current_bean_weight, current_water_volume, current_milk_volume,
                           max_bean_container_capacity, max_water_tank_volume, max_milk_tank_volume)
VALUES ('Philips', 240, 1800, 800, 350, 2000, 1000);

INSERT INTO menu_item (name)
VALUES ('Americano'),
       ('Espresso'),
       ('Latte');