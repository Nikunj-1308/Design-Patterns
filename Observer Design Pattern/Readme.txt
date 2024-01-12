This is a Smart Kitchen Application usingthe Observer Design Pattern.
The application involves registering smart devices like Fridge, Oven, Microwave. And we can send an event to change the temperature of these devices.

KitchenControllerImpl implements the Observable class, so that it can use the methods defined in Observable.

Cases like:
SmartFridge: Implements Observer and reacts to temperature change in kitchen as per condition.
SmartOven: Implements Observer and reacts to temperature change in kitchen as per condition.

SmartKitchen App demonstrates how whole application runs.

TemperatureEvent: A class representing a temperature change event. It has a data member temperature, a constructor and a method.

The above behaviour benefit from Observer Design Pattern.
