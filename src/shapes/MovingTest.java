/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.Scanner;
/**
 *
 * @author Xpointer
 */
public class MovingTest {
        public static void main(String[] args) {
        MovingCircle cm = new MovingCircle();
        MovingRectangle rm = new MovingRectangle();
        
     
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Que figura você deseja mover [c/r]?");
    
    String shape = myObj.nextLine(); 
    
    if( "c".equals(shape)){
    
    System.out.println("Insira os valores de: raio, x, y do centro, velocidade X e velocidade Y.");
    int ray = myObj.nextInt();
    cm.setRay(ray);
    int x = myObj.nextInt();
    cm.center.setX(x);
    int y = myObj.nextInt();
    cm.center.setY(y);
    int velX = myObj.nextInt();
    cm.center.setVelX(velX);
    int velY = myObj.nextInt();
    cm.center.setVelY(velY);
     
    System.out.println("Criando um círculo..."); 
    System.out.println(cm);    
    System.out.println("Movendo para cima");
    cm.center.moveUp();
    System.out.println(cm);  
    System.out.println("Movendo para direita");
    cm.center.moveRight();
    System.out.println(cm);  
    System.out.println("Movendo para baixo");
    cm.center.moveDown();
    System.out.println(cm);  
    System.out.println("Movendo para esquerda");
    cm.center.moveLeft();    
    System.out.println(cm);  
    }else if("r".equals(shape)){
    
    System.out.println("Insira os valores de: x, y da superior esquerda, x, y da inferior direita, velocidade X e velocidade Y.");
    int x = myObj.nextInt();
    rm.topLeft.setX(x);
    int y = myObj.nextInt();
    rm.topLeft.setY(y);
    int x2 = myObj.nextInt();
    rm.bottomRight.setX(x2);
    int y2 = myObj.nextInt();
    rm.bottomRight.setY(y2);
    int velX = myObj.nextInt();
    rm.topLeft.setVelX(velX);
    rm.bottomRight.setVelX(velX);
    int velY = myObj.nextInt();
    rm.topLeft.setVelY(velY);
    rm.bottomRight.setVelY(velY);
 
    System.out.println("Criando um retangulo..."); 
    System.out.println(rm);    
    System.out.println("Movendo para cima");
    rm.moveUp();
    System.out.println(rm);  
    System.out.println("Movendo para direita");
    rm.moveRight();
    System.out.println(rm);  
    System.out.println("Movendo para baixo");
    rm.moveDown();
    System.out.println(rm);  
    System.out.println("Movendo para esquerda");
    rm.moveLeft();    
    System.out.println(rm);  
    }
  }
}
