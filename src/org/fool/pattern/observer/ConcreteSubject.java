package org.fool.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	private List<Watcher> list = new ArrayList<>();
	
	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		for (Watcher watcher : list) {
			watcher.update(str);
		}
	}

}
