package com.selfmade.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.GameRender;
import com.selfmade.game.GameWorld;
import com.selfmade.game.InputHandler;
import com.selfmade.levels.TestLevel;

public class GameScreen implements Screen{
	TestLevel level;
	GameWorld gameWorld;
	GameRender gameRender;
	SpriteBatch batch;
	public GameScreen(){
		level = new TestLevel();
		gameWorld = new GameWorld(level);
		gameRender = new GameRender(gameWorld);
		batch = new SpriteBatch(); 
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.app.log("Delta", ""+delta);
		Gdx.app.log("FPS", ""+1/delta);
		gameWorld.update(delta);
		gameRender.draw(batch);
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
