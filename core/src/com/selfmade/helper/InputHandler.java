package com.selfmade.helper;

import java.util.ArrayList;
import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.selfmade.camera.Camera;


public class InputHandler implements InputProcessor{

	private HashMap<Integer,InputAction> inputActions;
	private int lastIndex;
	
	Camera camera;
	
	public InputHandler(Camera camera){
		this.camera = camera;
		lastIndex = 0;
		inputActions = new HashMap<Integer,InputAction>();
	}
	
	public HashMap<Integer,InputAction> getTouchs(){
		return (HashMap<Integer, InputAction>) inputActions.clone();
	}
	
	@Override
	public boolean keyDown(int keycode) {
		inputActions.put(keycode, new InputAction(keycode));
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		/*for (int i=0;i<inputActions.size();i++){
			if (inputActions.get(i).getKeycode()==keycode) {
				inputActions.remove(i);
				return false;
			}
		}*/
		inputActions.remove(keycode);
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		inputActions.put(pointer,new InputAction(screenX,screenY,pointer,button,camera));
		Gdx.app.log("touchDown", screenX+"   "+screenY);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		inputActions.remove(pointer);
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if (inputActions.get(pointer) == null) return false;
		inputActions.get(pointer).setCoordinates(screenX, screenY);
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
