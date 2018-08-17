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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Container box = new Container(0, 0, 100, 100);
        Ball ball = new Ball(50.0f,50.0f, 5, 10, 30);
        
        for (int step = 0; step < 100; step++) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
    
}
