package model;

import processing.core.PApplet;

public class Bullet extends PApplet implements Runnable {
		
		public PApplet app;
		public float posX;
		public float posY;
		public float speed;
		public Boolean isCollide;
	
		Bullet(PApplet app){
			this.app=app;
			this.posX=posX;
			this.speed= 20;
			this.posY=450;
			
		}
	
	
	
	public void paint() {
		app.ellipse(this.posX, this.posY, 7, 7);
	}
	
	
	public void run() {
			this.posY -= this.speed;
		
	}



	public float getPosX() {
		return posX;
	}



	public void setPosX(float posX) {
		this.posX = posX;
	}



	public float getPosY() {
		return posY;
	}



	public void setPosY(float posY) {
		this.posY = posY;
	}



	public float getSpeed() {
		return speed;
	}



	public void setSpeed(float speed) {
		this.speed = speed;
	}



	public Boolean getIsCollide() {
		return isCollide;
	}



	public void setIsCollide(Boolean isCollide) {
		this.isCollide = isCollide;
	}
	


	
	
	
		
	}


