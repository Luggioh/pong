package Pong;

import javax.swing.JFrame;

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.width, Var.height);
		Var.jf1.setTitle("Pong");
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLayout(null);
		Var.jf1.setResizable(false);
		Var.jf1.setVisible(true);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.requestFocus();
		
		Draw jlab = new Draw();
		jlab.setBounds(0, 0, Var.width, Var.height);
		jlab.setVisible(true);
		Var.jf1.add(jlab);
	}

}
