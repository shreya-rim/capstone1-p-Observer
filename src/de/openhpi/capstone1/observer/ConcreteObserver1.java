package de.openhpi.capstone1.observer;

public class ConcreteObserver1 extends Observer {

	ConcreteSubject subject;
	
	public ConcreteObserver1(Subject subject) {
		super(subject);
		this.subject = (ConcreteSubject)subject;
	}

	@Override
	public void update() {
		System.out.println("Observer1: " + subject.getValue());
	}
}
