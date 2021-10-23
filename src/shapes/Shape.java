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
abstract class Shape {
    
        protected String color = "Vermelho";
        protected boolean fill = true;
        
        public void Shape (String color, boolean fill) {
            this.color = color;
            this.fill = fill;
        }

	public final String getColor() { return color; }
        
        public final void setColor(String color) { this.color = color; }

	public final boolean getFill() { return fill; }

	public final void setFill(boolean fill) { this.fill = fill; }  
        
        abstract double getArea();
                 
        abstract double getPerimeter();
        
    }   