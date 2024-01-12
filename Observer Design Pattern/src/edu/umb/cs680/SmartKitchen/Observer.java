package edu.umb.cs680.SmartKitchen;

public interface Observer<T> {
	public void update(Observable<T> sender, T event);
}
