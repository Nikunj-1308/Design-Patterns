package edu.umb.cs680.Car;

import java.util.List;

public interface DistanceMetric {
	public abstract double distance(List<Double> point1, List<Double> point2);
}
