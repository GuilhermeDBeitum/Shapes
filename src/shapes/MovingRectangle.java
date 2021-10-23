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
public class MovingRectangle implements Moving {

    MovingPoint topLeft;
    MovingPoint bottomRight;

    public MovingRectangle() {
        this.bottomRight = new MovingPoint();
        this.topLeft = new MovingPoint();
    }
    
    public final void movingRectangle(){this.topLeft = topLeft; this.bottomRight = bottomRight;}

    
    @Override
    public String toString() {
    return " RetanguloMovel: " + "\n Superior Esquerda: " + topLeft + "\n Inferior Direita:  " + bottomRight;
    }

    @Override
    public void moveUp(){
    topLeft.moveUp();
    bottomRight.moveUp();
    }

    @Override
    public void moveDown(){
    topLeft.moveDown();
    bottomRight.moveDown();
    }

    @Override
    public void moveLeft(){
    topLeft.moveLeft();
    bottomRight.moveLeft();
    }

    @Override
    public void moveRight(){
    topLeft.moveRight();
    bottomRight.moveRight();
    }

}