package view;
import exception.VictoryExcep;
import model.Bullet;
import model.Enemy;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic log;
	int screen;
	
	
	public void settings() {
		size(800,500);
	}
	
	public void setup() {
		log= new Logic(this);
		screen=0;
	}
	
	
	
	public void draw() {
		background(0);
	
		
		switch(screen) {
		
		case 0:
			log.paint();
			new Thread(log).start();
			
			try {
				if(log.enemy.size()==0) {
					throw new VictoryExcep("Bien Hecho! Has ganado!");
					
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				screen=1;
			}
			
			
			
			try {
				for(int i=0; i<log.enemy.size(); i++) {
					log.enemy.get(i);
					if(log.enemy.get(i).getPosY()>=log.hero.getPosY()) {
					throw new VictoryExcep("Oh No! Has perdido!");
						}
					}
			}catch(Exception e) {
				System.out.println(e.getMessage());
				screen=2;
			}
			
			break;
			
		case 1: 
			textSize(20);
			text("Bien Hecho! Has Ganado!", width/2-70, height/2);
			textSize(15);
			text("Clic para jugar de nuevo",width/2-70, 300 );
			
			break;
			
		case 2: 
			textSize(20);
			text("Oh No! Has perdido!", width/2-70, height/2);
			textSize(15);
			text("Clic para jugar de nuevo",width/2-70, 300 );
			
			break;
		}

	}
	
	
	public void reload() {
		for(int i=0; i< log.dataEnemy; i++) {
			Enemy e = new Enemy(this, 60*i, 30);
			log.enemy.add(e);
			}
		
		for(int i=0; i< log.bullet.size(); i++) {
			Bullet b = log.bullet.get(i);
			log.bullet.remove(b);
				}
		}
	
	
	public void mousePressed() {
		if(screen==1 || screen ==2) {
			screen=0;
			reload();
			log.setPoint((float)0);
		}
	}
	
	
	public void keyPressed() {
			if(screen==0) {
					log.moveHero();
					log.shoot();
					}
				}
	
	

}
