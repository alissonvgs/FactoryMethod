package br.ufpb.dcx.testeAps;

import javax.swing.JOptionPane;

public class EmailMessage implements Message {
	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, "[OutLook] Email: " + message);

	}

}
