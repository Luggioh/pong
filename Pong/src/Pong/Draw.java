package Pong;

import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel {

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Var.width, Var.height);
		g.setColor(Color.WHITE);
		
		for(int i = 0; i <= 30; i++){
			g.fillRect(Var.width/2 - 5, i * 20, 10, 10);
		}
		
		g.fillRect(Var.x, Var.y, 25, 150);   //Spieler
		
		g.setColor(Color.CYAN);
		g.fillRect(Var.gegnerX, Var.gegnerY, 25, 150); //Gegner
		g.drawString("" + Var.gegnerPoints, 720, 50);
		
		g.setColor(Color.WHITE);
		g.drawString("" + Var.playerPoints, 50, 50);
		
		
		g.setColor(Color.GREEN);
		g.fillRect(Var.ballX, Var.ballY, 20, 20);
		repaint();
	}
	
}
