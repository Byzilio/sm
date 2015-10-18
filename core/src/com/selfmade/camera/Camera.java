package com.selfmade.camera;

import java.util.List;

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
		for(AGameObject actor : actors){
			actor.draw(actor.getX()-x, actor.getY()-y, scale, batch);
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
