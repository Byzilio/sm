package com.selfmade.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.selfmade.camera.SimpleCamera;
import com.selfmade.game.ILevel;
import com.selfmade.objects.IGameObject;

public class GameScreen implements Screen{

	Game game;
	ILevel level;
	
	float delta;
	ArrayList<IGameObject> actors;
	
	SimpleCamera testCamera;
	
	public GameScreen(ILevel level,Game game){
		this.level = level;
		this.game = game;
		testCamera = new SimpleCamera();
		actors = (ArrayList<IGameObject>) level.getAllObjects();
	}
	
	
	@Override
	public void render(float delta) {
		this.delta = delta;
		update();
		testCamera.draw(actors);
	}

	public void update(){
		for(IGameObject actor: actors){
			actor.update(this);
		}
	}
	
	public float getDelta(){
		return delta;
	}
	
	public void setLevel(ILevel level){
		game.setScreen(new GameScreen(level,game));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
