package view;

import model.Hero;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic log;
	Hero hero;
	
	public void settings() {
		size(800,500);
	}
	
	public void setup() {
		log= new Logic(this);
		hero= new Hero(this);
		new Thread(log).start();
	}
	
	public void draw() {
		background(0);
		
	log.paint();
		
	
		
		text("X" + mouseX + "Y" + mouseY, mouseX, mouseY);
	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		
		log.keys();
		
	}

}
