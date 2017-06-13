package Pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	//taste gedrückt halten
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			System.out.println("HI");
			Var.moveUp = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Var.moveDown = true;
		}
	}

	//taste loslassen
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP){
			Var.moveUp = false;
			System.out.println("losgelassn");
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Var.moveDown = false;
		}
		
	}

	public void keyTyped(KeyEvent e) {}
	
}
