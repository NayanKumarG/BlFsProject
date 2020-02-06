package com.bridgelabz.behavioral.observerpattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
MyTopic topic = new MyTopic();
/*
 * creating pobservers
 */
Observer obj1 = new MyTopicSubscribers("Obj1");
Observer obj2 = new MyTopicSubscribers("Obj2");
Observer obj3 = new MyTopicSubscribers("Obj3");

/*
 * register observers
 */

topic.regeister(obj1);
topic.regeister(obj2);
topic.regeister(obj3);

/*
 * attach observer to subject
 */
obj1.setSubject(topic);
obj2.setSubject(topic);
obj3.setSubject(topic);

obj1.update();

topic.postMessage("NewMessage");

	}

}
