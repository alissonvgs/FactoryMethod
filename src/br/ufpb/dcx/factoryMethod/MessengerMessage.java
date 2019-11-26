package br.ufpb.dcx.factoryMethod;

import javax.swing.JOptionPane;

public class MessengerMessage implements Message{
	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, "[Facebook] Messenger: " + message);
		
	}


}
