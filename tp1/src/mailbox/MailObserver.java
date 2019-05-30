package mailbox;

import javax.swing.JLabel;

//classe mailobserver
//représentation graphique de la boîte aux lettres
public class MailObserver extends JLabel implements IObserver{

	//méthode update
	//affiche le sujet du dernier mail reçu sur la boîte aux lettres 
	@Override
	public void update(Subject subject) {
		Mail mail = ((MailBox)subject).getLastMail();
		super.setText(mail.getSubject());
	}

}
