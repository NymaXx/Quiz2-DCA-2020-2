package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Hero extends Ship {

	
	PApplet app;
	public ArrayList<Bullet> bullet;
	
	public Hero(PApplet app) {
		super(app);
		this.app=app;
		this.posX=app.width/2;
		this.posY=450;
		this.speedX=10;
		this.speedY=1;
		
		bullet = new ArrayList<Bullet>();
		
		
		
				
	}
	
	
	 public void paint() {
		app.stroke(0,255,255);
		app.fill(255);
		app.rectMode(PApplet.CENTER);
		app.rect(this.posX, this.posY, 50,20);
		
		
		
	}
	 
	 public void run() {
		 move();		
	 }
	 
	 
	 public void move() {
		 switch(app.keyCode) {
		 
		 case PApplet.LEFT:
		 if(this.posX > 30 && this.posX <= 770) {
				this.posX-=this.speedX;
				}
		 break;
		 
		 case PApplet.RIGHT:
				if(this.posX >= 30 && this.posX < 770) {
					this.posX+=this.speedX;
					}
				break;
				
		 }
	 }
	
}
