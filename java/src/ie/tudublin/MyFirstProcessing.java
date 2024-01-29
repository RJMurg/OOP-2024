package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		// TO DO
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		background(255, 0, 0);

		fill(255, 255, 0);
		stroke(255, 255, 0);
		circle(250, 250, 450);

		fill(0, 255, 255);
		stroke(0, 255, 255);
		triangle(25, 475, 250, 25, 475, 475);

		fill(255);
		stroke(255);
		ellipse(250, 250, 200, 100);

		fill(0);
		stroke(0);
		circle(250, 250, 75);
	}
}
