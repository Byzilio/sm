package com.selfmade.screens;

import java.util.ArrayList;
import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.selfmade.camera.Camera;
import com.selfmade.game.ALevel;
import com.selfmade.game.SimpleMenu;
import com.selfmade.helper.InputAction;
import com.selfmade.helper.InputHandler;
import com.selfmade.objects.AGameObject;

public class GameScreen implements Screen{

	Game game;
	ALevel level;
	
	float delta;
	ArrayList<AGameObject> actors;
	HashMap<Integer,InputAction> inputActions;
	InputHandler input;
	Camera camera;
	
	public GameScreen(ALevel level,Game game){
		Gdx.app.log("GameScreen", "Created");
		this.level = level;
		this.game = game;
		camera = new Camera();
		input = new InputHandler(camera);
		Gdx.input.setInputProcessor(input);
		inputActions = new HashMap<Integer,InputAction>();
		camera.setPosition(0, 0);
		getActorsFromLevel();
	}
	
	
	@Override
	public void render(float delta) {
		this.delta = delta;
		update();
		camera.draw(actors);
	}

	public void update(){
		inputActions = input.getTouchs();
		/*for(InputAction touch: inputActions.values()){
			Gdx.app.log("Touch:", touch.toString());
		}*/
		
		
		for(int i = 0;i < actors.size();i++){
			actors.get(i).update(this);
		}
	}
	
	public float getDelta(){
		return delta;
	}
	
	public void setLevel(ALevel level){
		game.setScreen(new GameScreen(level,game));
	}
	
	public HashMap<Integer,InputAction> getTouchs(){
		return inputActions;
	}
	public ALevel getLevel(){
		return level;
	}
	
	public void getActorsFromLevel(){
		actors = (ArrayList<AGameObject>) level.getAllObjects();
	}
	
	@Override
	public void resize(int width, int height) {
		//camera.resize(width, height);
	}

	public void setScale(float d){
		camera.setScale(d);
	}
	
	public float getScale(){
		return camera.getScale();
	}
	
	public float getScaleX(){
		return camera.getScaleX();
	}
	
	public float getScaleY(){
		return camera.getScaleY();
	}
	
	
	
	
	@Override
	public void show() {
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
		for(AGameObject actor: actors){
			actor.dispose();
		}
	}



}
