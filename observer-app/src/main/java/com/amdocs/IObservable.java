package com.amdocs;

public interface IObservable {
	
	
	public void addSubscriber( Observer observer);
	public void removeSubscriber( Observer observer);
	public void notifyAllSubscriber(String msg);

}
