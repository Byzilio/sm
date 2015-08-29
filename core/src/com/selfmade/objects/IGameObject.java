package com.selfmade.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public interface IGameObject {
	public void update(GameScreen screen);
	public void draw(int x,int y,float scale,SpriteBatch batch);
	public int getX();
	public int getY();
}
