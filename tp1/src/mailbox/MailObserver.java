package mailbox;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer {

	public MailObserver(){
		setText("");
	}

	
	String text = "";
	@Override
	public void update(Subject s) {
		MailBox mailBox = (MailBox) s;
		int nbMessage = mailBox.getNumberOfMessages();
		text += mailBox.read().subject + "<br>";
		this.setText("<html><body>" + nbMessage + "<br>" + text + "</body></html>");

	}

}
