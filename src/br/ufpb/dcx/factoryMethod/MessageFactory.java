package br.ufpb.dcx.factoryMethod;

import javax.swing.JOptionPane;

public class MessageFactory {
	public static Message getMessage(int i) {

		switch (i) {
		case 1:
			return new DirectMessage();
		case 2:
			return new EmailMessage();
		case 3:
			return new MessengerMessage();
		}

		return null;

	}

}
