package com.selfmade.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public class TestClickObject extends WithCheckClick {
	
	Texture texture;
	
	public TestClickObject(int x,int y,int height,int width){
		setPosition(x,y);
		setHeight(height);
		setWidth(width);
		texture = new Texture("badlogic.jpg");
	}

	@Override
	public void update(GameScreen screen) {
		if(isClick(screen)){
			Gdx.app.log("TestClickObject", "isClick");
			
			x = x + 2;
			y = y + 2;
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
