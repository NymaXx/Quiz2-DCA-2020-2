package view;
import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic log;
	
	
	public void settings() {
		size(800,500);
	}
	
	public void setup() {
		log= new Logic(this);
		
		
	}
	
	public void draw() {
		background(0);
		
	log.paint();
	new Thread(log).start();
	
		
	//para saber posicion actual del mouse, fines practicos
		text("X" + mouseX + "Y" + mouseY, mouseX, mouseY);
	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		
		log.moveHero();
		log.shoot();
		
	}

}
