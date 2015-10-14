package com.selfmade.helper;

import java.util.ArrayList;

import com.badlogic.gdx.InputProcessor;


public class InputHandler implements InputProcessor{

	private ArrayList<InputAction> points;
	
	
	public InputHandler(){
		points = new ArrayList<InputAction>();
	}
	
	public ArrayList<InputAction> getTouchs(){
		return (ArrayList<InputAction>) points.clone();
	}
	
	@Override
	public boolean keyDown(int keycode) {
		points.add(new InputAction(keycode));
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		for (int i=0;i<points.size();i++){
			if (points.get(i).getKeycode()==keycode) {
				points.remove(i);
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		points.add(new InputAction(screenX,screenY,pointer,button));
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		points.remove(pointer);
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		points.get(pointer).setCoordinates(screenX, screenY);
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
