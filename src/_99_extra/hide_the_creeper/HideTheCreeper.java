package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    PImage creeper; 
    int creeperX = 343;
    int creeperY = 123;
    boolean isNear(int a, int b) {
    	if (abs(a - b) < 10)
    	     return true;
    	else
    	     return false;
    	}
    
    
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
    	
    	image(creeper, creeperX, creeperY);
    	if(mousePressed) {
    		fill(255, 0, 0);
    		if(isNear(creeperX, mouseX) == true && isNear(creeperY, mouseY) && mousePressed) {
            	fill(0, 255,0);
            }
    	ellipse(mouseX,mouseY,10,10);
    	}

    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
