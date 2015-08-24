package com.selfmade.game;

import com.badlogic.gdx.InputProcessor;

public class InputHandler implements InputProcessor {

	GameWorld gameWorld;
	public InputHandler(GameWorld gameWorld){
		this.gameWorld = gameWorld;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		Pair<Integer> touch = new Pair<Integer>(screenX,screenY);
		gameWorld.addInput(touch);
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		for(int i = 0;i<gameWorld.sizeInput();i++){
			if ( ((Integer)gameWorld.getInput(i).getX()==screenX) && ((Integer)gameWorld.getInput(i).getY()==screenY) ) gameWorld.removeInput(i);
		}
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}

