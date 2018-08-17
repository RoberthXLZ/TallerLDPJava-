/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Andrade
 */
public class Ball {
    
    private float x;
    private float y;
    
    private int radius;
    
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        
        this.xDelta = (float) (Math.cos(Math.toRadians(direction)) * speed);
        this.yDelta = (float) (Math.sin(Math.toRadians(direction)) * speed * -1);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    
    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }
    
    public void reflectHorizontal() {
        this.xDelta *= -1;
    }
    public void reflectVertical() {
        this.yDelta *= -1;
    }
    
    @Override
    public String toString() {
        String pos = "(" + this.x + "," + this.y + ")" +"";
        String vel = "(" + this.xDelta + "," + this.yDelta + ")" +"";
        return "Ball at " + pos + " of velocity " + vel + "\n";
        
    }
    
    
    
}
