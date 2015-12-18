package com.selfmade.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.selfmade.objects.AGameObject;

public abstract class ALevel {	
	
	List<AGameObject> actors = new ArrayList<>();
	
	public List<AGameObject> getAllObjects(){
		return actors;
	}
	public List<AGameObject> getAllWithInternal(String checkableInternal){
		List<AGameObject> withInternals = new ArrayList<>();
		for (AGameObject actor:actors){
			if (actor.checkInternal(checkableInternal)) withInternals.add(actor); 
		}
		return withInternals;
	}
	
	public void addActor(AGameObject actor){
		actors.add(actor);
	}
	public void removeActor(AGameObject actor){
		Gdx.app.log("ALevel", ""+actor);
		actors.remove(actor);
	}
}
