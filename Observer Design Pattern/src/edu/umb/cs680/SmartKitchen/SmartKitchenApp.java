package edu.umb.cs680.SmartKitchen;

public class SmartKitchenApp {
    public static void main(String[] args) {
        KitchenControllerImpl controller = new KitchenControllerImpl();

        SmartFridge fridge = new SmartFridge();
        SmartOven oven = new SmartOven();

        controller.registerDevice(fridge);
        controller.registerDevice(oven);

        controller.changeTemperature(25);
        controller.changeTemperature(150);
    }
}