package br.ufpb.dcx.testeAps;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String text = JOptionPane.showInputDialog("");
		Message message = new MessengerMessage();
		message.sendMessage(text);
	}

}
