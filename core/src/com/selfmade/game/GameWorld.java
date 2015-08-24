package com.selfmade.game;


import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.selfmade.levels.TestLevel;

public class GameWorld {
	
	private ArrayList<Pair> input;
	
	private TestLevel level;
	
	private float delta;
	
	
	public GameWorld(TestLevel level){
		this.level = level;
		input = new ArrayList<Pair>();
	}
	
	public void update(float delta){
	this.delta = delta;
		for(int i = 0;i < level.size();i++){
			level.getObject(i).update(this);
		}
		for(int i = 0;i < input.size();i++){
			Gdx.app.log("Touch"+i,"x="+input.get(i).getX()+"y="+input.get(i).getY());
		}
	}
	
	public int sizeInput(){
		return input.size();
	}
	
	public TestLevel getLevel(){
		return level;
	}
	
	public void addInput(Pair<?> pair){
		input.add(pair);
	}
	
	public Pair<?> getInput(int i){
		return input.get(i);
	}
	
	public void removeInput(int i){
		input.remove(i);
	}
}
