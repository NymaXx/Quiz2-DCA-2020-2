package model;

import processing.core.PApplet;

public class Bullet extends PApplet implements Runnable {
		
		public PApplet app;
		public int posX;
		public int posY;
		public int speed;
		public Boolean isCollide;
	
		Bullet(PApplet app){
			this.app=app;
			this.posX=posX;
			this.speed= 4;
			this.posY=450;
			
		}
	
	
	
	
	
	
	public void run() {
		try {
			posY += this.speed;
			
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public Boolean getIsCollide() {
		return isCollide;
	}


	public void setIsCollide(Boolean isCollide) {
		this.isCollide = isCollide;
	}
	
	
		
	}


