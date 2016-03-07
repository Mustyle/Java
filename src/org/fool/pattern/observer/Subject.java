package org.fool.pattern.observer;

public interface Subject {
	
	public void addWatcher(Watcher watcher);

	public void removeWatcher(Watcher watcher);
	
	public void notifyWatchers(String str);
}
