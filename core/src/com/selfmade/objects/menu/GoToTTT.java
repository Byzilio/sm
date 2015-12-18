package com.selfmade.objects.menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.TTTLevel;
import com.selfmade.objects.WithCheckClick;
import com.selfmade.screens.GameScreen;

public class GoToTTT extends WithCheckClick{

	private Texture texture;
	
	public GoToTTT(int x,int y,int width,int height){
		setPosition(x,y);
		setHeight(height);
		setWidth(width);

		texture = new Texture("TTT.jpg");
	}

	@Override
	public void update(GameScreen screen) {
		if(isClick(screen)){
			screen.setLevel(new TTTLevel());
		}
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		batch.draw(texture, (float)x*scale, (float)y*scale, (float)getWidth()*scale, (float)getHeight()*scale);
	}

	@Override
	public void dispose() {
		texture.dispose();
	}
	
}