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
		 
		 
		 
		 
		 /* switch(app.keyCode) {
		 
		 
		 case PApplet.LEFT:
		 if(this.posX >= 30 && this.posX <= 770) {
				this.posX-=this.speedX;
				}
		 break;
		 
		 case PApplet.RIGHT:
				if(this.posX >= 30 && this.posX <= 770) {
					this.posX+=this.speedX;
					}
				break;
				
		 }*/
		 
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
	 
	 public void shoot() {
		 
		 if(app.keyCode == 32) {
			 Bullet b = new Bullet(app);
			 bullet.add(b);
			 
			 
			 for(int i=0; i<bullet.size(); i++) {
				 b=bullet.get(i);
				
				 b.paint();
				 b.setPosX(this.posX);
				 new Thread(b).start();	
				 System.out.println(bullet.size());
			 }
			
		 }
		 
		 
		 
		
		 
	 }
	 
	 
	
	
	

	

	
	
}
