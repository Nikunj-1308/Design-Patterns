package edu.umb.cs680.Tracker;

public interface Observer<T> {
	public void update(Observable<T> sender, T event);
}