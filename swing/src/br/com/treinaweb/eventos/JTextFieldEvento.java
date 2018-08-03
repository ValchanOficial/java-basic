package br.com.treinaweb.eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JTextFieldEvento implements KeyListener{
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		char tecla = e.getKeyChar();
		//impede de digitar números
		if(tecla >='0' && tecla <='9') {
			e.consume();
		}
	}
}