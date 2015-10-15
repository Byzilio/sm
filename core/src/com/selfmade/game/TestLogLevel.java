package com.selfmade.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.selfmade.objects.AGameObject;
import com.selfmade.objects.TestLogObject;
import com.selfmade.objects.TestLogObject2;


public class TestLogLevel extends ALevel {

	public TestLogLevel(){
		addActor(new TestLogObject());
		addActor(new TestLogObject());
		addActor(new TestLogObject2());
		ArrayList<AGameObject> testActors = (ArrayList<AGameObject>) getAllWithInternal("test2");
		Gdx.app.log("TestLogLevel:", "size list with test2 == "+testActors.size());
	}
}
