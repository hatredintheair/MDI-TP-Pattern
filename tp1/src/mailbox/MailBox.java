package mailbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Classe mailbox hérite de la classe subject
public class MailBox extends Subject{

	//constructeur
	private MailBox(){
		super();
	}
	
	private static MailBox instance = null;
	
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	
	//liste des mails
	List<Mail> mail = new ArrayList<Mail>();
	
	//ajout d'un nouveau mail et mise a jour des observateurs
	public void addMail(Mail m ){
		
		this.mail.add(m);
		this.notifyObservers();
	}

	
	public Mail getLastMail() {
		return this.mail.get(mail.size()-1);
	}


	public Integer getNbreMail() {
		return mail.size();
	}
	

	public boolean isEmpty() {
		return this.mail.isEmpty();
	}

		
	
	
}
