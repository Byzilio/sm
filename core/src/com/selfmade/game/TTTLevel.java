package com.selfmade.game;

import com.selfmade.objects.menu.BackToMainMenu;
import com.selfmade.objects.ttt.TTTLogic;

public class TTTLevel extends ALevel{
	
	public TTTLevel(){
		addActor(new TTTLogic(this,100,100));
		addActor(new BackToMainMenu(580,420,60,60));
	}
	
}
