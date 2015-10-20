package com.selfmade.screens;

import java.util.ArrayList;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.selfmade.camera.Camera;
import com.selfmade.game.ALevel;
import com.selfmade.helper.InputAction;
import com.selfmade.helper.InputHandler;
import com.selfmade.objects.AGameObject;

public class GameScreen implements Screen{

	Game game;
	ALevel level;
	
	float delta;
	ArrayList<AGameObject> actors;
	ArrayList<InputAction> touches;
	InputHandler input;
	Camera camera;
	
	public GameScreen(ALevel level,Game game){
		Gdx.app.log("GameScreen", "Created");
		this.level = level;
		this.game = game;
		camera = new Camera();
		input = new InputHandler(camera);
		Gdx.input.setInputProcessor(input);
		touches = new ArrayList<InputAction>();
		
		camera.setPosition(2000, 2000);
		actors = (ArrayList<AGameObject>) level.getAllObjects();
	}
	
	
	@Override
	public void render(float delta) {
		this.delta = delta;
		update();
		camera.draw(actors);
	}

	public void update(){
		touches = input.getTouchs();
		for(InputAction touch: touches){
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
	
	public ArrayList<InputAction> getTouchs(){
		return touches;
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
