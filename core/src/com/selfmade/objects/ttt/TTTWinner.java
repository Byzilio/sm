package com.selfmade.objects.ttt;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.AGameObject;
import com.selfmade.objects.WithCheckClick;
import com.selfmade.screens.GameScreen;

public class TTTWinner  extends WithCheckClick{

	private int winner;
	private Texture winCross;
	private Texture winToe; 
	
	public TTTWinner(int x,int y,int winner){
		setX(x+100);
		setY(y+100);
		this.winner = winner;
		
		winCross = new Texture("winCross.jpg");
		winToe = new Texture("winToe.jpg");
	}
	
	@Override
	public void update(GameScreen screen) {
		if(isClick(screen)){
			
		}
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		if (winner == 1){
			batch.draw(winCross, x*scale, y*scale, 300*scale, 300*scale);
		}
		if (winner == 2){
			batch.draw(winToe, x*scale, y*scale, 300*scale, 300*scale);
		}
	}

	@Override
	public void dispose() {
		winCross.dispose();
		winToe.dispose();
	}

}
