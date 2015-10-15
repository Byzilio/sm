package com.selfmade.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.selfmade.camera.SimpleCamera;
import com.selfmade.game.ALevel;
import com.selfmade.helper.InputAction;
import com.selfmade.helper.InputHandler;
import com.selfmade.helper.Pair;
import com.selfmade.objects.AGameObject;

public class GameScreen implements Screen{

	Game game;
	ALevel level;
	
	float delta;
	ArrayList<AGameObject> actors;
	ArrayList<InputAction> touchs;
	InputHandler input;
	SimpleCamera testCamera;
	
	public GameScreen(ALevel level,Game game){
		this.level = level;
		this.game = game;
		input = new InputHandler();
		Gdx.input.setInputProcessor(input);
		touchs = new ArrayList<InputAction>();
		testCamera = new SimpleCamera();
		actors = (ArrayList<AGameObject>) level.getAllObjects();
	}
	
	
	@Override
	public void render(float delta) {
		this.delta = delta;
		update();
		testCamera.draw(actors);
	}

	public void update(){
		touchs = input.getTouchs();
		for(InputAction touch: touchs){
			Gdx.app.log("Touch:", touch.toString());
		}
		
		for(AGameObject actor: actors){
			actor.update(this);
		}
	}
	
	public float getDelta(){
		return delta;
	}
	
	public void setLevel(ALevel level){
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
