package com.selfmade.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public class TestLogObject2 extends AGameObject {

	public TestLogObject2(){
		addInternal("test2");
	}
	
	public void update(GameScreen screen) {
		Gdx.app.log("TestObject2", "Update");
		if (checkInternal("test2")) Gdx.app.log("TestObject", "internal = test2 founded");
	}

	public void draw(int x, int y, float scale, SpriteBatch batch) {
		Gdx.app.log("TestObject2", "x="+x+" y="+y+" scale="+scale);
		batch.draw(new Texture("badlogic.jpg"), x, y);
	}



}