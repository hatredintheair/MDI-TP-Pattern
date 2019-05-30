package mailbox;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<IObserver> list; //liste des observateurs 
	
	//constructeur 
	public Subject() {
		this.list = new ArrayList<IObserver>();
	}
	
	//ajoute un observateur
	public void attach(IObserver obs) {
		this.list.add(obs);
	}
	
	//supprime un observateur
	public void detach(IObserver obs) {
		this.list.remove(obs);
	}
	
	//mise a jour de tous les observateurs 
	public void notifyObservers() {
		this.list.forEach(obs -> obs.update(this));
	}
}
