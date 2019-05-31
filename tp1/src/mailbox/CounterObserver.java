package mailbox;

import javax.swing.JLabel;

public class CounterObserver extends JLabel implements Observer {

	public CounterObserver(){
		setText("" + 0);
	}

	@Override
	public void update(Subject s) {
		MailBox mailBox = (MailBox) s;
		int nbMail = mailBox.getNumberOfMessages();
		this.setText("" + nbMail);

	}

}
