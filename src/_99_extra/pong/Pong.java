package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int xSpeed = 80;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	if(xSpeed > WIDTH){
    	    xSpeed = -xSpeed;
    	}
    }

    @Override
    public void draw() {
    	xSpeed = xSpeed + 1;
    	int x = 80;
    	x = xSpeed;
    	fill(0, 0, 255);
    	stroke(0, 0, 0);
    	ellipse(x, 60, 50, 50);
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}