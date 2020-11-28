package model;

import processing.core.PApplet;

public class Ship implements Runnable{

	 protected float posX;
	 protected float posY;
	 protected float speedX;
	 protected float speedY;
	public PApplet app;
		
		Ship(PApplet app){
			this.app=app;
			this.posX=posX;
			this.posY=posY;
			this.speedX=speedX;
			this.speedY=speedY;
			
			
			
		}
		
		void paint(){
			
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

	public float getSpeedX() {
		return speedX;
	}

	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}

	public float getSpeedY() {
		return speedY;
	}

	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	

}
