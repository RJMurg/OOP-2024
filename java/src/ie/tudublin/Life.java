package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet{

    LifeBoard LifeBoard; 

    public void setup(){
        LifeBoard = new LifeBoard(50, 50, this);
    }

    public void settings(){
        size(500, 500);
    }

    public void draw(){

        LifeBoard.update();
        LifeBoard.render();
    }
}
