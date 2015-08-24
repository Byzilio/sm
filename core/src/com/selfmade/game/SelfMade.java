package com.selfmade.game;

import com.badlogic.gdx.Game;
import com.selfmade.screens.GameScreen;

public class SelfMade extends Game {
	
	@Override
	public void create () {
		this.setScreen(new GameScreen());
	}

	@Override
	public void render() {
    	super.render();
    }
	
}
