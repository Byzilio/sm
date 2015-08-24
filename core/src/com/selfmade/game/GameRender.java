package com.selfmade.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.levels.TestLevel;

public class GameRender {
	
	TestLevel level;
	
	public GameRender(GameWorld gameWorld){
		level = gameWorld.getLevel();
	}
	
	public void draw(SpriteBatch batch){
		for(int i = 0;i < level.size();i++){
			level.getObject(i).draw(batch);
		}
	}
}
