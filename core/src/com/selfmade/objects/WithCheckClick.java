package com.selfmade.objects;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.selfmade.helper.InputAction;
import com.selfmade.screens.GameScreen;

public abstract class WithCheckClick extends AGameObject{
	
	public boolean isClick(GameScreen screen){
		ArrayList<InputAction> touches;
		touches = screen.getTouchs();
		for(InputAction touch:touches){
			if ( (touch.getScreenX()>=getX()) && (touch.getScreenY()>=getY()) && ( touch.getScreenX()<=(getX()+getWidth()) ) && (touch.getScreenY()<=(getY()+getHeight()) ) ){
				Gdx.app.log("ScreenX", touch.getScreenX()+"");
				Gdx.app.log("ScreenY", touch.getScreenY()+"");
				Gdx.app.log("X", getX()+"");
				Gdx.app.log("Y", getY()+"");
				Gdx.app.log("Height", getHeight()+"");
				Gdx.app.log("Width", getWidth()+"");

				return true;
			}
		}
		return false;
	}
	
	
}
