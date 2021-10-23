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
public class MovingCircle implements Moving {
    private int ray;
    MovingPoint center = new MovingPoint();

    public final double getRay() { return ray; }
    
    public final void setRay(int ray) { this.ray = ray; }
    
    public final void movingCircle(){this.center = center;}
  
    @Override
    public String toString() {
    return " CirculoMovel: " + "\n raio: " +  getRay() + "\n PontoMovel: " + center;
    }

    @Override
    public void moveUp(){}

    @Override
    public void moveDown(){}

    @Override
    public void moveLeft(){}

    @Override
    public void moveRight(){}
}