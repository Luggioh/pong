package Pong;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {

	Timer move;
	
	public GegnerMovement(){
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){
			
			public void run(){
				if(Var.ballX >= Var.width / 2 -20){
					
				if(Var.ballY == Var.gegnerY){}
					else if(Var.ballY > Var.gegnerY + 75){
						if(Var.gegnerY <= Var.height - 200){
							Var.gegnerY +=2;
						}
					}
					else if (Var.ballY < Var.gegnerY + 75){
						if(Var.gegnerY >= 20){
							Var.gegnerY -= 2;
						}
					}
				 }
			}	
		}, 0, 10);
		
	}
}
