package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    PImage creeper; 
    int reperX = 343;
    int reperY = 123;
   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	PImage minecraft = loadImage("minecraft.png");
    	minecraft.resize(width, height);
    	background(minecraft); 
    	creeper=loadImage("creeper.png");
    	creeper.resize(5, 5);
    }

    @Override
    public void draw() {
    	image(creeper, reperX, reperY);
    	if(mousePressed) {
    		fill(255, 0, 0);
    	ellipse(mouseX,mouseY,10,10);
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
