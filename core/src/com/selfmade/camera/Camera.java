package com.selfmade.camera;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.AGameObject;

public class Camera {
	int x,y;
	int scale;
	SpriteBatch batch;
	
	public Camera(){
		batch = new SpriteBatch();
		x = 0;
		y = 0;
	}
	
	public Camera(int x,int y){
		batch = new SpriteBatch();
		this.x = x;
		this.y = y;
	}
	
	public void setPosition(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(List<AGameObject> actors){
		batch.begin();
		Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f, 1f);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		for(AGameObject actor : actors){
			actor.draw(actor.getX()-x,actor.getY()-y, scale, batch);
		
		}
		batch.end();
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
