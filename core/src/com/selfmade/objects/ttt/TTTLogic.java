package com.selfmade.objects.ttt;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.selfmade.game.ALevel;
import com.selfmade.objects.AGameObject;
import com.selfmade.screens.GameScreen;

public class TTTLogic extends AGameObject {

	private TTTObject objects[];
	private int howplayer;
	
	
	public TTTLogic(ALevel level,int x,int y) {
		setX(x);
		setY(y);
		
		objects = new TTTObject[9];
		objects[0] = new TTTObject(x    ,y,100,100);
		objects[1] = new TTTObject(x+100,y,100,100);
		objects[2] = new TTTObject(x+200,y,100,100);
		objects[3] = new TTTObject(x    ,y+100,100,100);
		objects[4] = new TTTObject(x+100,y+100,100,100);
		objects[5] = new TTTObject(x+200,y+100,100,100);
		objects[6] = new TTTObject(x    ,y+200,100,100);
		objects[7] = new TTTObject(x+100,y+200,100,100);
		objects[8] = new TTTObject(x+200,y+200,100,100);
		
		howplayer = 1;
		
		for(TTTObject object:objects){
			level.addActor(object);
		}
		
	}
	
	@Override
	public void update(GameScreen screen) {
		
		
		if( (objects[0].getStatus()==objects[1].getStatus()) && (objects[1].getStatus()==objects[2].getStatus()) && (objects[0].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[0].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		if( (objects[3].getStatus()==objects[4].getStatus()) && (objects[4].getStatus()==objects[5].getStatus()) && (objects[3].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[3].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		if( (objects[6].getStatus()==objects[7].getStatus()) && (objects[7].getStatus()==objects[8].getStatus()) && (objects[6].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[6].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		
		
		
		if( (objects[6].getStatus()==objects[3].getStatus()) && (objects[3].getStatus()==objects[0].getStatus()) && (objects[6].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[6].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		if( (objects[7].getStatus()==objects[4].getStatus()) && (objects[4].getStatus()==objects[1].getStatus()) && (objects[7].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[7].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		if( (objects[8].getStatus()==objects[5].getStatus()) && (objects[5].getStatus()==objects[2].getStatus()) && (objects[8].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[8].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		
		
		
		
		
		
		if( (objects[0].getStatus()==objects[4].getStatus()) && (objects[4].getStatus()==objects[8].getStatus()) && (objects[0].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[0].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		if( (objects[6].getStatus()==objects[4].getStatus()) && (objects[4].getStatus()==objects[2].getStatus()) && (objects[2].getStatus()!=0) ){
			screen.getLevel().addActor(new TTTWinner(getX(),getY(),objects[2].getStatus()));
			for(int i = 0;i < 9;i++){
				screen.getLevel().removeActor(objects[i]);
			}
			screen.getLevel().removeActor(this);
		}
		
		
		
		for(TTTObject object:objects){
			if((object.isClick(screen)) && (!object.isChanged())){
				if(howplayer == 1){
					object.setCross();
					howplayer = 2;
					return;
				}
				if(howplayer == 2){
					object.setToe();
					howplayer = 1;
					return;
				}
			}
		}
		
		
	}

	@Override
	public void draw(int x, int y, float scale, SpriteBatch batch) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
