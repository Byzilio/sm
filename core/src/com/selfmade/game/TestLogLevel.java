package com.selfmade.game;

import java.util.ArrayList;
import java.util.List;

import com.selfmade.objects.IGameObject;
import com.selfmade.objects.TestLogObject;

public class TestLogLevel implements ILevel {

	@Override
	public List<IGameObject> getAllObjects() {
		List<IGameObject> actors = new ArrayList<IGameObject>(); 
		actors.add(new TestLogObject());
		return actors;
	}

}
