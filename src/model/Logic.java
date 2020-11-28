package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logic extends PApplet implements Runnable{

	
	public ArrayList<Enemy> enemy;
	private ArrayList<Bullet> bullet;
	public Hero hero;
	public PApplet app;
	private int dataEnemy;
	private float point;
	
	
		public Logic(PApplet app){
				this.app=app;
				dataEnemy=13;
				point=0;
				
				enemy = new ArrayList<Enemy>();
				
				bullet = new ArrayList<Bullet>();
				
				hero = new Hero(app);
				
				
				
		for (int i = 0; i < dataEnemy; i++) {
			Enemy e = new Enemy(app,60*i,30);
			enemy.add(e);
			}	
				
		
		}
			
			
		
		
	public void paint() {
	//pintado de los enemigos
		for (int i = 0; i < enemy.size(); i++) {
			enemy.get(i).paint();
			new Thread(enemy.get(i)).start();
		}
		
	//pintado del heroe
			hero.paint();
		
	//pintado del contador de puntos e indicaciones
		app.fill(255);
		app.textSize(15);
		app.text("Puntaje: "+ point ,13,20);
		app.textSize(15);
		app.text("Acierta en el punto debil de los enemigos",494,20);
		app.fill(255,0,0,70);
		app.stroke(255,0,144);
		app.ellipse(475, 8, 10, 10);
		
	//pintado de las balas
		for(int i=0; i<bullet.size(); i++) {
			 bullet.get(i);
			
			 bullet.get(i).paint();
			 bullet.get(i).setPosX(hero.getPosX());
			 new Thread(bullet.get(i)).start();	
			// System.out.println(bullet.size());
		 }
	}
	
	
	public void moveHero() {  //movimiento del Heroe
		new Thread(hero).start();
	}
	
	
	public void shoot() {  //Disparo de balas
		 
		 if(app.keyCode == 32) {
			 Bullet b = new Bullet(app);
			 bullet.add(b);
		 }
	}
	
	

	public void run() {
		// TODO Auto-generated method stub
		//System.out.println(enemy.size());
		
			 for(int e = 0; e < enemy.size(); e++) {
				 Enemy n = enemy.get(e);
				 for(int u = 0; u < bullet.size();u++) {
					 Bullet a = bullet.get(u);
				 		
					 if(PApplet.dist(n.getPosX(), n.getPosY(), a.getPosX(), a.getPosY())<= 10) {
						 enemy.remove(n);
						 bullet.remove(a);
						 point++;
						 System.out.println(enemy.size());	 
					 			}
				 			}
			 			}
					}
	
	
	/*public void delete() {
		
		for(int e = 0; e < enemy.size(); e++) {
			 Enemy n = enemy.get(e);
			 for(int u = 0; u < bullet.size();u++) {
				 Bullet a = bullet.get(u);
			 		
				 if(PApplet.dist(n.getPosX(), n.getPosY(), a.getPosX(), a.getPosY())<= 20) {
					 enemy.remove(n);
					 bullet.remove(a);
					 point++;
					 System.out.println(bullet.size());
				 			}
			 			}
		 			}
				}*/
	
	

	
}
