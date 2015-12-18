package com.selfmade.game;

import com.badlogic.gdx.graphics.Texture;
import com.selfmade.objects.menu.GoToTTT;
import com.selfmade.objects.panzer.ActionButton;

public class SimpleMenu extends ALevel{
	
	public SimpleMenu(){
		addActor(new GoToTTT(0,100,500,500));
		addActor(new ActionButton(0,0,100,100,new Texture("badlogic.jpg")));
	}
	
}
