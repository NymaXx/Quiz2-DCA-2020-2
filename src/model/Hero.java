package model;

//import java.util.ArrayList;

import processing.core.PApplet;

public class Hero extends Ship {

	
	PApplet app;
	
	
	public Hero(PApplet app, float posX, float posY) {
		super(app);
		this.app=app;
		this.posX=posX;
		this.posY=posY;
		this.speedX=1;
		this.speedY=1;
		
	
		
				
	}
	
	
	 public void paint() {
		app.stroke(0,255,255);
		app.fill(255);
		app.rectMode(PApplet.CENTER);
		app.rect(this.posX, this.posY, 50,20);
		
		if(this.posX > 25) {
			this.speedX=1;
			}
			
			if(this.posX < 450) {
				this.speedX*=-1;
				}
		
	}
	
	
	

	

	
	
}
