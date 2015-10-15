package com.selfmade.camera;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.objects.AGameObject;

public class SimpleCamera {
	SpriteBatch batch;
	
	public SimpleCamera(){
		batch = new SpriteBatch();
	}
	
	public void draw(List<AGameObject> actors){
		batch.begin();
		for(AGameObject actor : actors){
			actor.draw(0, 0, 0, batch);
		}
		batch.end();
	}
}
