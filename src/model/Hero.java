package model;

import processing.core.PApplet;

public class Hero extends Ship implements Runnable{

	
	PApplet app;
	
	public Hero(PApplet app) {
		super(app);
		//this.app=app;
		this.posX=50;
		this.posY=450;
		this.speedX=1;
		this.speedY=1;
				
	}
	
	
	void paint() {
		app.stroke(0, 255, 255);
		app.fill(255);
		app.rectMode(PApplet.CENTER);
		app.rect(this.posX, this.posY, 50,20);
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
		
		switch(app.keyCode) {
		
		case PApplet.LEFT:
			if(app.width > 25) {
			this.posX+=this.speedX;
			}
			break;
			
		case PApplet.RIGHT:
			if(app.width < app.width-25) {
				this.posX+=this.speedX;
				}
			break;
			
		default:
			this.posX=50;
			break;
			
			
		}
	}
	
	
}
