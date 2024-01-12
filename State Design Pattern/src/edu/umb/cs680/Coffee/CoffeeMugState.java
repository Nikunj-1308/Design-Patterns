package edu.umb.cs680.Coffee;

interface CoffeeMugState {
    String returnCurrentState(CoffeeMug coffeeMug);

    void heat(CoffeeMug coffeeMug);
}