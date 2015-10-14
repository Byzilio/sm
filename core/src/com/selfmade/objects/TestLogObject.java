package com.selfmade.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public class TestLogObject extends IGameObject {

	public TestLogObject(){
		addInternal("test1");
	}
	
	public void update(GameScreen screen) {
		Gdx.app.log("TestObject", "Update");
		if (checkInternal("test1")) Gdx.app.log("TestObject", "internal = test1 founded");
	}

	public void draw(int x, int y, float scale, SpriteBatch batch) {
		Gdx.app.log("TestObject", "x="+x+" y="+y+" scale="+scale);
		batch.draw(new Texture("badlogic.jpg"), x, y);
	}



}
