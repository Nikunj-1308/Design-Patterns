package edu.umb.cs680.Kitchen;

public interface Observer<T> {
	public void update(Observable<T> sender, T event);
}
