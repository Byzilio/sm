package com.selfmade.helper;

import com.badlogic.gdx.Gdx;
import com.selfmade.camera.Camera;

public class InputAction {
	int screenX, screenY, pointer, button;
	int keycode;
	Camera camera;
	public InputAction(int screenX, int screenY, int pointer, int button, Camera camera){

		this.screenX = (int) ( ( (double)screenX + (double)camera.getX() ) );
		this.screenY = (int) ( (((double)Gdx.graphics.getHeight() - (double)screenY) + (double)camera.getY()) );
		this.pointer = pointer;
		this.button = button;
		this.camera = camera;
		keycode = -1;
		Gdx.app.log(this.toString(), "x ="+getScreenX()+" y ="+getScreenY());
		Gdx.app.log(this.toString(), "Scale ="+camera.getScale());
	}
	
	public InputAction(int keycode){
		screenX = -1;
		screenY = -1;
		pointer = -1;
		button = -1;
		this.keycode = keycode;
	}
	
	public int getScreenX(){
		return screenX;
	}
	public int getScreenY(){
		return screenY;
	}
	public int getPointer(){
		return pointer;
	}
	public int getButton(){
		return button;
	}
	public int getKeycode(){
		return keycode;
	}
	protected void setCoordinates(int screenX, int screenY){
		this.screenX = (int) ( ( (double)screenX + (double)camera.getX() ) );
		this.screenY = (int) ( (((double)Gdx.graphics.getHeight() - (double)screenY) + (double)camera.getY()) );
	}
	public String toString(){
		if (keycode == -1) return "Touch"+pointer+":x="+screenX+" y="+screenY+" button="+button;
		else return "Keycode="+keycode;
	}
}
