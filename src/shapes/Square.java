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
    public class Square extends Rectangle {
           public Square () { 
                super(1.0,1.0,"",true); 
            }
 
            protected double side;

            public final double getSide() { return side; }
            
	    public final void setSide(Double side) { this.side = base; this.side = heigth; this.side = side;}
    }
