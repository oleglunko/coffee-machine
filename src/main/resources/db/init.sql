DROP TABLE IF EXISTS coffee_machine;
DROP TABLE IF EXISTS menu_item;
DROP TABLE IF EXISTS beverage;

CREATE TABLE IF NOT EXISTS coffee_machine
(
    id                          SERIAL PRIMARY KEY,
    name                        VARCHAR(100) NOT NULL,
    current_bean_weight         INT          NOT NULL,
    current_water_volume        INT          NOT NULL,
    current_milk_volume         INT          NOT NULL,
    max_bean_container_capacity INT          NOT NULL,
    max_water_tank_volume       INT          NOT NULL,
    max_milk_tank_volume        INT          NOT NULL

);

CREATE TABLE IF NOT EXISTS menu_item
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS beverage
(
    id             BIGSERIAL PRIMARY KEY,
    type           VARCHAR(50) NOT NULL,
    required_bean  INT         NOT NULL,
    required_water INT         NOT NULL,
    required_milk  INT         NOT NULL
)
