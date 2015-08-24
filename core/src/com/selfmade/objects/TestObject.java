package com.selfmade.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.GameWorld;

public class TestObject extends GameObject {
	public void update(GameWorld gameWorld){
		Gdx.app.log("TestObject","update");
	}
	public void draw(SpriteBatch batch){
		Gdx.app.log("TestObject","draw");
	}
}
