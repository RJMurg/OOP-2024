package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board;

    int rows;
    int cols;
    PApplet p;

    float cellWidth;
    float cellHeight;

    public LifeBoard(int rows, int cols, PApplet p){
        this.rows = rows;
        this.cols = cols;
        this.p = p;

        board = new boolean[rows][cols];
        cellWidth = p.width / (float)cols;
        cellHeight = p.height / (float)rows;
        this.randomise();
    }

    void randomise(){
        for(int row = 0 ; row < rows ; row ++){
            for(int col = 0 ; col < cols ; col ++){
                float dice = p.random(1.0f);
                board[row][col] = (dice < 0.5f);                
            }
        }
    }

    public void update(){
        
    }

    public void render(){
        p.background(0);
        p.stroke(0, 255, 255);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j]){
                    p.fill(0, 255, 00);
                    p.stroke(0, 255, 255);
                    p.rect(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
                }
                else{
                    p.stroke(0, 255, 255);
                    p.noFill();
                }
            }
        }
    }
}
