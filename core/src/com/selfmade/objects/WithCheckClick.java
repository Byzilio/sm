package com.selfmade.objects;

import java.io.PrintWriter;
import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.selfmade.helper.InputAction;
import com.selfmade.screens.GameScreen;

public abstract class WithCheckClick extends AGameObject{
	
	public boolean isClick(GameScreen screen){
		
		FileHandle handle = Gdx.files.local("log.txt");

		
		HashMap<Integer,InputAction> touches;
		touches = screen.getTouchs();
		for(InputAction touch:touches.values()){
			if ( (touch.getScreenX()>=getX()*screen.getScale()) && (touch.getScreenY()>=getY()*screen.getScale()) && ( touch.getScreenX()<=(getX()*screen.getScale()+getWidth()*screen.getScale()) ) && (touch.getScreenY()<=(getY()*screen.getScale()+getHeight()*screen.getScale()) ) ){
				/*Gdx.app.log("ScreenX", touch.getScreenX()+"");
				Gdx.app.log("ScreenY", touch.getScreenY()+"");
				Gdx.app.log("X", getX()+"");
				Gdx.app.log("Y", getY()+"");
				Gdx.app.log("Height", getHeight()+"");
				Gdx.app.log("Width", getWidth()+"");
				*/
				handle.writeString("#########################\n", true);
				
				handle.writeString("ScreenX "+touch.getScreenX()+"\n", true);
				handle.writeString("ScreenY "+touch.getScreenY()+"\n", true);
				handle.writeString("X "+getX()+"\n", true);
				handle.writeString("Y "+getY()+"\n", true);
				handle.writeString("Height "+getHeight()+"\n", true);
				handle.writeString("Width "+getWidth()+"\n", true);
				
				
				return true;
			}
		}
		return false;
	}
	
	
}
