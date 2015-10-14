package com.selfmade.helper;

public class InputAction {
	int screenX, screenY, pointer, button;
	int keycode;
	public InputAction(int screenX, int screenY, int pointer, int button){
		this.screenX = screenX;
		this.screenY = screenY;
		this.pointer = pointer;
		this.button = button;
		keycode = -1;
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
		this.screenX = screenX;
		this.screenY = screenY;
	}
	public String toString(){
		if (keycode == -1) return "Touch"+pointer+":x="+screenX+" y="+screenY+" button="+button;
		else return "Keycode="+keycode;
	}
}
