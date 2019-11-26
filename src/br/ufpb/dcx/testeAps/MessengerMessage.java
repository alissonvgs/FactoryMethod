package br.ufpb.dcx.testeAps;

import javax.swing.JOptionPane;

public class MessengerMessage implements Message{
	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, "[Facebook] Messenger: " + message);
		
	}


}
