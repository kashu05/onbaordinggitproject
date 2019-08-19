package com.amdocs;

import java.beans.Customizer;
import java.util.ArrayList;

public class NewspaperAgency implements IObservable{
	
	
	private ArrayList<Observer> subscribers;
	private String name;
	
	public NewspaperAgency(String name)
	{
		subscribers= new ArrayList<Observer>();		
		this.name=name;
	}

	public void addSubscriber(Observer observer) {
	
		subscribers.add(observer);
	}

	public void removeSubscriber(Observer observer) {
		
		subscribers.remove(observer);
		
	}

	public void notifyAllSubscriber(String msg) {
		
		for(Observer customer : subscribers)
			customer.update(msg);
		
	}
	
	

}
