/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9;

import TurtleGraphics.Pen;

/**
 *
 * @author evan5090
 */
public class Rekt implements Shape {
    
    private double xPos,yPos,width, height;
    
    public class Circle implements Shape{
    
    private double xPos,yPos,radius;
    
    public Circle(){
        xPos=0;
        yPos=0;
        width=1;
        height=1;
    }
    public Circle(double x, double y, double h, double w){
        xPos=x;
        yPos=y;
        height=h;
        width=w;
    }
    public double area(){
        return height*width; 
    }
    public void draw(Pen p){
        double side = 2*Math.PI*radius/120  ;
        p.up();
        p.move(xPos+radius, yPos-side/2);
        p.setDirection(90);
        p.down();
        for(int i=0; i<120;i++){
            p.move(side);
            p.turn(3);
        }
    }
    public double getXPos(){
        return xPos;
    }
    public double getYPos(){
        return yPos;
    }

    @Override
    public double asd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getXpos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getYpos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(double xloc, double yloc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stretchBy(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
