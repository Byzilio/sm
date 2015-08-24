package com.selfmade.objects.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.GameWorld;
import com.selfmade.game.Pair;
import com.selfmade.objects.GameObject;

public class TestButton extends GameObject{
	
	int x,y,sizeX,sizeY;
	
	public TestButton(int x, int y, int sizeX, int sizeY){
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public void update(GameWorld gameWorld){
		if( isClick(gameWorld) ) Gdx.app.log("TestButton","OnClick"); 
		
	}
	public void draw(SpriteBatch batch){
		Gdx.app.log("TestButton","draw");
	}
	
	public boolean isClick(GameWorld gameWorld){
		Pair<?> pair;
		for(int i = 0;i<gameWorld.sizeInput();i++){
			pair = gameWorld.getInput(i);
			if( 
					(x <= (Integer) pair.getX()) && (x+sizeX >= (Integer) pair.getX())  && 
					(y <= (Integer) pair.getY()) && (y+sizeY >= (Integer) pair.getY())   
			) return true;
		}
		return false;
	}
}
