package edu.umb.cs680.SmartKitchen;

import java.util.LinkedList;
import java.util.List;

public class TemperatureEvent {
	private int temp;

	public TemperatureEvent(int temp) {
		this.temp = temp;
	}

	public int getTemperature() {
		return temp;
	}
}