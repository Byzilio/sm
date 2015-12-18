package com.selfmade.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public abstract class AGameObject {
	int x,y;
	int height,width;
	
	ArrayList<String> internals = new ArrayList<>();
	public abstract void update(GameScreen screen);
	public abstract void draw(int x,int y,float scale,SpriteBatch batch);
	public abstract void dispose();
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setPosition(int x,int y){
		this.x = x;
		this.y = y;
	}
	public boolean checkInternal(String checkableInternal) {
		for (String internal:internals)
			if(internal == checkableInternal) return true;
		return false;
	}
	public void addInternal(String internal) {
		internals.add(internal);
	}
	public void removeInternal(String internal) {
		internals.remove(internal);
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
		
	
}
