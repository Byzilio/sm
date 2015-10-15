package com.selfmade.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.screens.GameScreen;

public abstract class AGameObject {
	int x,y;
	ArrayList<String> internals = new ArrayList<>();
	public abstract void update(GameScreen screen);
	public abstract void draw(int x,int y,float scale,SpriteBatch batch);
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean checkInternal(String checkableInternal) {
		for (String internal:internals)
			if(internal == checkableInternal) return true;
		return false;
	}
	public void addInternal(String internal) {
		internals.add(internal);
	}
	public void removeInternal(String internal) {
		internals.remove(internal);
	}
}
