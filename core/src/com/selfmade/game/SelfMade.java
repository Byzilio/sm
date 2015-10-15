package com.selfmade.game;

import com.badlogic.gdx.Game;
import com.selfmade.screens.GameScreen;

public class SelfMade extends Game {
	
	@Override
	public void create () {
		ALevel level = new TestLogLevel();
		this.setScreen(new GameScreen(level,this));
	}

	@Override
	public void render() {
    	super.render();
    }
	
}
