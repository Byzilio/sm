package com.selfmade.camera;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.IGameObject;

public class SimpleCamera {
	SpriteBatch batch;
	
	public SimpleCamera(){
		batch = new SpriteBatch();
	}
	
	public void draw(List<IGameObject> actors){
		batch.begin();
		for(IGameObject actor : actors){
			actor.draw(0, 0, 0, batch);
		}
		batch.end();
	}
}
