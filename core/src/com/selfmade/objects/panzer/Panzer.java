package com.selfmade.objects.panzer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.ALevel;
import com.selfmade.objects.AGameObject;
import com.selfmade.screens.GameScreen;

public class Panzer extends AGameObject{

	private Texture panzerUp;
	private ActionButton buttons[];
	
	
	public Panzer(ALevel level,int x,int y,int width,int height) {
		setPosition(x,y);
		setHeight(height);
		setWidth(width);
		panzerUp = new Texture("pUp.jpg");
	
		buttons = new ActionButton[8];
	}
	
	@Override
	public void update(GameScreen screen) {
		
		
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		batch.draw(panzerUp, (float)x*scale, (float)y*scale, (float)getWidth()*scale, (float)getHeight()*scale);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
