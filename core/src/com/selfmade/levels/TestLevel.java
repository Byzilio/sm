package com.selfmade.levels;

import java.util.ArrayList;

import com.selfmade.objects.GameObject;
import com.selfmade.objects.TestObject;
import com.selfmade.objects.buttons.TestButton;

public class TestLevel {
	ArrayList<GameObject> gameObjects;
	public TestLevel(){
		gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new TestObject());
		gameObjects.add(new TestButton(0,0,1000,1000));
	}
	public GameObject getObject(int i){
		return gameObjects.get(i);
	}
	public int size(){
		return gameObjects.size();
	}
}
