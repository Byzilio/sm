package com.selfmade.objects.ttt;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.WithCheckClick;
import com.selfmade.screens.GameScreen;

public class TTTObject extends WithCheckClick{

	private int status;
	private Texture textureCross; 
	private Texture textureVoid; 
	private Texture textureToe; 
	
	
	public TTTObject(int x,int y,int height,int width){
		setPosition(x,y);
		setHeight(height);
		setWidth(width);
		status = 0;
		textureVoid = new Texture("void.jpg");
		textureCross = new Texture("cross.jpg");
		textureToe = new Texture("toe.jpg");
	}
	
	
	@Override
	public void update(GameScreen screen) {
		
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		if (status == 1){
			batch.draw(textureCross, (float)x*scale, (float)y*scale, (float)getWidth()*scale, (float)getHeight()*scale);
			return;
		}
		if (status == 2){
			batch.draw(textureToe, (float)x*scale, (float)y*scale, (float)getWidth()*scale, (float)getHeight()*scale);
			return;
		}
		batch.draw(textureVoid, (float)x*scale, (float)y*scale, (float)getWidth()*scale, (float)getHeight()*scale);
	}
	
	public void setCross(){
		status = 1;
	}
	
	public void setToe(){
		status = 2; 
	}

	public int getStatus(){
		return status;
	}
	
	public boolean isChanged(){
		if(status!=0){
			return true;
		}
		return false;
	}


	@Override
	public void dispose() {
		textureCross.dispose();
		textureToe.dispose();
		textureVoid.dispose();
	}
}
