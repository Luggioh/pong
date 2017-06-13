package Pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {

	Timer move;
	
	public BallMovement(){
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){
			
			public void run(){
				Var.ballX += Var.balldirX;
				Var.ballY += Var.balldirY;
			}
		}, 0, 5);
	}
}
