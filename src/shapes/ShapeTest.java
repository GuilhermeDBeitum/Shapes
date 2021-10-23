/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;
import java.text.DecimalFormat;
/**
 *
 * @author Xpointer
 */
public class ShapeTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(3.0);
        Rectangle r1 = new Rectangle(3.5, 6.7, "Azul", false);
        Rectangle r2 = new Rectangle(1.4, 2.3, "", true);
        Square q1 = new Square();
        
        Shape[] shapes = new Shape[5];
        
        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = r1;
        shapes[3] = r2;
        shapes[4] = q1;
        DecimalFormat formatter = new DecimalFormat("0.00");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass());
            System.out.println("Perímetro: " + formatter.format(shape.getPerimeter()));
            System.out.println("Área: " + formatter.format(shape.getArea()));
          
        }
    }
}
