package Pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {

	Timer kollision;
	
	public BallKollision(){
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask(){
			
			public void run(){
				
				if(Var.ballY + 50 >= Var.height){
					Var.balldirY = -1;
				}
				if(Var.ballY <= 0){
					Var.balldirY = 1;
				}
				if(Var.ballX + 20 >= Var.width){
					Var.ballX = Var.width / 2 -10;
					Var.ballY = Var.height / 2 - 10;
					
					Var.balldirX = -1;
					Var.playerPoints +=1;
				}
				
				if(Var.ballX <= 0){
					Var.ballX =Var.width /2-10;
					Var.ballY = Var.height/2 -10;
					Var.balldirX = 1;
					Var.gegnerPoints +=1;
				}
				
				if(Var.ballX < Var.x +25 && Var.ballX > Var.x && Var.ballY -20 < Var.y +150 && Var.ballY > Var.y){
					Var.balldirX = 1;
				}
				
				if(Var.ballX < Var.gegnerX && Var.ballX > Var.gegnerX - 25 && Var.ballY -20 < Var.gegnerY +150 && Var.ballY > Var.gegnerY){
					Var.balldirX = -1;
				}
				
			}
		}, 0, 4);
	}
}
