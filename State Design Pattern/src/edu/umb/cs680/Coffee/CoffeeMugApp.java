package edu.umb.cs680.Coffee;

public class CoffeeMugApp {
    public static void main(String[] args) {
        CoffeeMug coffeeMug = new CoffeeMug();
        System.out.println(coffeeMug.currentTemperature());

        coffeeMug.heatCoffee();
        System.out.println("Heating coffee...");
        System.out.println(coffeeMug.currentTemperature());

        coffeeMug.heatCoffee();
        System.out.println("Heating coffee...");
        System.out.println(coffeeMug.currentTemperature());

        coffeeMug.heatCoffee();
        System.out.println("Heating coffee...");
        System.out.println(coffeeMug.currentTemperature());
    }
}