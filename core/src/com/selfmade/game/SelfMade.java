package com.selfmade.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.selfmade.screens.GameScreen;

public class SelfMade extends Game {
	
	@Override
	public void create () {
		Gdx.app.log("Game", "Start");
		ALevel level = new TestLogLevel();
		this.setScreen(new GameScreen(level,this));
	}

	@Override
	public void render() {
    	super.render();
    }
	
}
