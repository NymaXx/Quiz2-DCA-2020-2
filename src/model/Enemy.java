package model;

import processing.core.PApplet;

public class Enemy extends Ship implements Runnable{

		public int counter;
	Enemy(PApplet app, float posX, float posY) {
		super(app);
		this.posX=posX;
		this.posY=posY;
		this.speedX=-3;
		
		this.counter=0;
		this.speedY=42;
		
		
	}
	
	void paint() {
		app.stroke(255,0,144);
		app.fill(102,0,161);
		app.ellipseMode(PApplet.CORNER);
		app.ellipse(this.posX, this.posY, 50,20);
		app.text(counter,90,20);
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			this.posX+=this.speedX;
			
			if (this.posX < 0 || this.posX > app.width-50) {
				this.speedX *= -1;
			}
			
			if(app.frameCount% 180 == 0) {
				
				this.posY+=this.speedY;
				Thread.sleep(2000);
				
				//System.out.println(this.posY);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	
	
	
	}
	
	
	


