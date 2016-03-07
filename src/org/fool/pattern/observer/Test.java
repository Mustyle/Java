package org.fool.pattern.observer;

public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		subject.addWatcher(watcher1);
		subject.addWatcher(watcher2);
		subject.addWatcher(watcher3);
		
		subject.notifyWatchers("got 3 tickets");
		
		subject.removeWatcher(watcher2);
		
		subject.notifyWatchers("got 2 tickets, hurry");
	}
}
