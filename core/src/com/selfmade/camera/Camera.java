package com.selfmade.camera;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.AGameObject;

public class Camera {
	int x,y;
	float scale,scaleX,scaleY;
	SpriteBatch batch;
	private int standartWidth,standartHeight;
	
	
	public Camera(){
		batch = new SpriteBatch();
		x = 0;
		y = 0;
		scale = 1;
		standartWidth = 640;
		standartHeight = 480;
	}
	
	public Camera(int x,int y){
		batch = new SpriteBatch();
		this.x = x;
		this.y = y;
		scale = 1;
		standartWidth = 640;
		standartHeight = 480;
	
	}
	
	public Camera(int x,int y,int width,int height){
		batch = new SpriteBatch();
		this.x = x;
		this.y = y;
		scale = 1;
		standartWidth = width;
		standartHeight = height;
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
	
	public void resize(int width, int height){
		//scaleX = (float)((float)width/(float)standartWidth);
		//scaleY = (float)((float)height/(float)standartHeight); 
		//scale = (float)( ( Math.sqrt(width*width+height*height) )/( Math.sqrt(standartWidth*standartWidth+standartHeight*standartHeight) ) );
	}
	
	public float getScaleX(){
		return scaleX;
	}	
	public float getScaleY(){
		return scaleY;
	}
	
	public void setScale(float scale){
		this.scale = scale;
	}
	
	public float getScale(){
		return scale;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
