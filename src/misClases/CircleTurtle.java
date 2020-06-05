/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import javax.swing.JOptionPane;

/**
 *
 * @author Mostro
 */
public class CircleTurtle extends Turtle implements Runnable {

    public CircleTurtle(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
    }

    public void avanza(int x) {
        for (int i = 0; i < x; i++) {
           
            super.forward(15);
            for (int j = 0; j < 7; j++) {
                super.turn(7);
                super.forward(5);
            }
            super.turn(7);
            super.forward(7);
            for (int j = 0; j < 6; j++) {
                super.forward(10);
                super.turn(45);
            }
            for (int j = 0; j < 2; j++) {
                super.forward(15);
                super.turn(16);
            }

      
         try {
               Thread.sleep(((int)(Math.random()*5000)));
            } catch (InterruptedException e) {
            }
        if ((super.getYPos())==440) {
    JOptionPane.showMessageDialog(null, "Gane!! ",
"Ganador"+super.getName(), JOptionPane.WARNING_MESSAGE);      
      }}


    }

    @Override
    public void run() {
      
            avanza(8);
             
       turnRight();
       turn(18);
avanza(10);
 turn(15);
//        forward(5);
      turn(100);
//     
avanza(8);
  
    }
}

