package com.selfmade.game;

import com.selfmade.objects.ScaleDown;
import com.selfmade.objects.ScaleUp;
import com.selfmade.objects.TestClickObject;
import com.selfmade.objects.menu.BackToMainMenu;
import com.selfmade.objects.ttt.TTTLogic;

public class TestLogLevel extends ALevel {

	public TestLogLevel(){

		addActor(new TestClickObject(300,400,50,50));
		addActor(new TTTLogic(this,100,100));
		addActor(new ScaleDown(0,0,50,50));
		addActor(new ScaleUp(0,50,50,50));
		addActor(new BackToMainMenu(580,420,60,60));
	}
}
