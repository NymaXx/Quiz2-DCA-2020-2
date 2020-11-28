package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logic extends PApplet implements Runnable{

	
	private ArrayList<Enemy> enemy;
	private ArrayList<Bullet> bullet;
	private Hero hero;
	public PApplet app;
	private int dataEnemy;
	private int point;
		public Logic(PApplet app){
				this.app=app;
				dataEnemy=13;
				point=0;
				enemy = new ArrayList<Enemy>();
				bullet = new ArrayList<Bullet>();
				hero = new Hero(this);
				
		for (int i = 0; i < dataEnemy; i++) {
			Enemy e = new Enemy(app,60*i,30);
			enemy.add(e);
			new Thread(e).start();
				
				}
				
		
		
			new Thread(hero).start();			
			
		}
			
			
		
		
	public void paint() {
		
		
		for (int i = 0; i < enemy.size(); i++) {
			//enemy.get(i).setPosX(enemy.get(i).getPosX()*i);
			enemy.get(i).paint();
			
		}
		
		hero.paint();		
		app.fill(255);
		app.textSize(15);
		app.text("SCORE: "+ point ,13,20);
		
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
