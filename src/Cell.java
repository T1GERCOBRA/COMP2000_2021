<<<<<<< HEAD
import java.awt.*;
class Cell extends Rectangle {
    static int size = 35;
    public Cell(int x, int y){
    
    super(x, y, size, size);
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
=======
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

class Cell extends Rectangle {
    static int size = 35;
    char col;
    int row;

    public Cell(char inCol, int inRow, int inX, int inY) {
        super(inX, inY, size, size);
        col = inCol;
        row = inRow;
    }

    void paint(Graphics g, Point mousePos) {
        if(contains(mousePos)) {
>>>>>>> 5b502f28322cb25ccc5e01d6c2d9500aefe5dae6
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    @Override
<<<<<<< HEAD
    public boolean contains(Point p){
        if (p != null){
=======
    public boolean contains(Point p) {
        if (p != null) {
>>>>>>> 5b502f28322cb25ccc5e01d6c2d9500aefe5dae6
            return(super.contains(p));
        } else {
            return false;
        }
    }
}