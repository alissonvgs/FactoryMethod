package br.ufpb.dcx.testeAps;

import javax.swing.JOptionPane;

public class DirectMessage implements Message {

	@Override
	public void sendMessage(String message) {
		JOptionPane.showMessageDialog(null, "[Instagram] Direct: " + message);

	}

}
