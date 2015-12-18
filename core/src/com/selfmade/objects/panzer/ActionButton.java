package com.selfmade.objects.panzer;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.WithCheckClick;
import com.selfmade.screens.GameScreen;

public class ActionButton extends WithCheckClick{

	private int drawX,drawY;
	private Texture texture;
	
	public ActionButton(int x,int y,int width,int height,Texture texture){
		setPosition(0,0);
		setHeight(height);
		setWidth(width);
		
		drawX = x;
		drawY = y;
	
		this.texture = texture;		
	}
	
	public void setTexture(Texture texture){
		this.texture = texture;
	}
	
	@Override
	public void update(GameScreen screen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		batch.draw(texture, (float)drawX*scale, (float)drawY*scale, (float)getWidth()*scale, (float)getHeight()*scale);
	}

	@Override
	public void dispose() {
		texture.dispose();
	}
	
	
	
}
