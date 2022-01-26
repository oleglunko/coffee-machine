package ru.oleglunko.coffeemachine.util.exception;

public class IllegalCoffeeMachineStateException extends RuntimeException {

    public IllegalCoffeeMachineStateException(String message) {
        super(message);
    }
}
