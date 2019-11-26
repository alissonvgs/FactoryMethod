package br.ufpb.dcx.factoryMethod;

import javax.swing.JOptionPane;

public class EmailMessage implements Message {
	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, "[OutLook] Email: " + message);

	}

}
