package com.selfmade.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public class TestLogObject implements IGameObject {

	@Override
	public void update(GameScreen screen) {
		Gdx.app.log("TestObject", "Update");
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		Gdx.app.log("TestObject", "x="+x+" y="+y+" scale="+scale);
		batch.draw(new Texture("badlogic.jpg"), x, y);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

}
