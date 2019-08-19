package com.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewspaperAgency news = new NewspaperAgency("Newspaper Agency");
		
		news.addSubscriber(new Subscriber("ramesh"));
		news.addSubscriber(new Subscriber("samesh"));
		news.addSubscriber(new Subscriber("mamesh"));
		
		news.notifyAllSubscriber("Times of India");
		
	}

}
