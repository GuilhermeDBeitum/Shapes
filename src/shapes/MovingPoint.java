/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Xpointer
 */
public class MovingPoint implements Moving {
    private int x;
    private int y;
    private int velX;
    private int velY;
    
    public final double getX() { return x; }
    
    public final void setX(int x) { this.x = x; }
    
    public final double getY() { return y; }
    
    public final void setY(int y) { this.y = y; }
    
    public final double getVelX() { return velX; }
    
    public final void setVelX(int velX) { this.velX = velX; }
            
    public final double getVelY() { return velY; }
    
    public final void setVelY(int velY) { this.velY = velY; }
    
    public final void movingPoint(int x, int y, int velX, int velY){this.x = x; this.y =y; this.velX = velX; this.velY = velY;}
  
    @Override
    public String toString() {
    return " x = " + getX() + " y = " + getY() + " velX = " + getVelX() + " velY = " + getVelY();
    }

    @Override
    public void moveUp(){
    { this.y = y + 1;}
    }

    @Override
    public void moveDown(){
    {this.y = y - 1;}
    }

    @Override
    public void moveLeft(){
    {this.x = x - 1;}
    }
    
    @Override
    public void moveRight(){
    {this.x = x + 1;}
    }
}
