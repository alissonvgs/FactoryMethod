package br.ufpb.dcx.factoryMethod;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int number = Integer.parseInt( JOptionPane.showInputDialog("Choise a option.\n"
				+ "[1] Instagram -> Direct Message\n"
				+ "[2] Outlook -> Email Message\n"
				+ "[3] Facebook -> Messenger Message\n"
				+ "Alert: We don't have error treatment. Be humble."));
		String text = JOptionPane.showInputDialog("");
		Message message = MessageFactory.getMessage(number);
		message.sendMessage(text);
	}

}
