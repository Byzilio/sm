package com.selfmade.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.selfmade.objects.AGameObject;
import com.selfmade.objects.TestLogObject;
import com.selfmade.objects.TestLogObject2;


public class TestLogLevel extends ALevel {

	public TestLogLevel(){
		addActor(new TestLogObject(0,0));
		addActor(new TestLogObject(1000,1000));
		addActor(new TestLogObject(-10,10));

		ArrayList<AGameObject> testActors = (ArrayList<AGameObject>) getAllWithInternal("test2");
		Gdx.app.log("TestLogLevel:", "size list with test2 == "+testActors.size());
	}
}
