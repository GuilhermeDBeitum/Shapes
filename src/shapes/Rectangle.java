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
    public class Rectangle extends Shape {
            protected double base;
            protected double heigth = 1.0;
            
            public Rectangle (double base, double heigth, String cor, boolean fill) { 
                super(); 
                this.base = base;
                this.heigth = heigth;  
            }
              
            public final double getBase() { return base; }
            
	    public final void setBase(Double base) { this.base = base; }
            
            public final double getHeigth() { return heigth; }
            
            public final void setHeigth(Double heigth) { this.heigth = heigth; }
            
            public final double getArea() { return base * heigth; }
                 
            public final double getPerimeter() { return 2*(base * heigth); }
    }
