package com.selfmade.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.GameWorld;

public abstract class GameObject {

	public abstract void update(GameWorld gameWorld);
	public abstract void draw(SpriteBatch batch);
}
