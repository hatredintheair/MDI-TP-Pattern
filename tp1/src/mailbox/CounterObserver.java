package mailbox;

import javax.swing.JLabel;

//classe counterobserver
//compte le nombre de mails reçus par la boite aux lettres
//hérite de la classe jlabel pour pouuvoir afficher l'objet
//implémente l'interface du type Observer 
public class CounterObserver extends JLabel implements IObserver {

	//méthode update 
	//affiche le nombre de mails dans la boite aux lettres
	@Override
	public void update(Subject subject) {
		int countmails = ((MailBox)subject).getNbreMail();
		super.setText(String.valueOf(countmails));		
	}

}
