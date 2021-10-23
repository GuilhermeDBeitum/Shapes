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

    public class Circle extends Shape {

            protected double ray;

            public Circle (double ray) {
                this.ray = ray;
            }

            public final double getRay() { return ray; }
            
	    public final void setRay(Double ray) { this.ray = ray; }
            
            public final double getArea() { return (3.14 * ray)*2; } 
            
            public final double getPerimeter() { return 2*(3.14)*ray; } 
    }
