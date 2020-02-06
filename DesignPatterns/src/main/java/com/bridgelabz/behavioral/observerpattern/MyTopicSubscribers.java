package com.bridgelabz.behavioral.observerpattern;

public class MyTopicSubscribers implements Observer {

	private String name;
	private Subject topic;
	
	public MyTopicSubscribers(String name){
		this.name=name;
	}
	@Override
	public void update() {
		String msg = (String) topic.getupdate(this);
		if(msg == null){
			System.out.println(name+" No new message");
		}else
		System.out.println(name+" Consuming message:"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

}
