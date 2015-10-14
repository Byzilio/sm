package com.selfmade.game;

import java.util.ArrayList;
import java.util.List;

import com.selfmade.objects.IGameObject;

public abstract class ILevel {	
	
	List<IGameObject> actors = new ArrayList<>();
	
	public List<IGameObject> getAllObjects(){
		return actors;
	}
	public List<IGameObject> getAllWithInternal(String checkableInternal){
		List<IGameObject> withInternals = new ArrayList<>();
		for (IGameObject actor:actors){
			if (actor.checkInternal(checkableInternal)) withInternals.add(actor); 
		}
		return withInternals;
	}
	
	public void addActor(IGameObject actor){
		actors.add(actor);
	}
	public void removeActor(IGameObject actor){
		actors.remove(actor);
	}
}
