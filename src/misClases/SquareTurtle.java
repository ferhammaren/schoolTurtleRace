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
public class SquareTurtle extends Turtle implements Runnable{
    public SquareTurtle(int x, int y, ModelDisplay modelDisplayer) 
  {
    super(x,y,modelDisplayer);
  }   
    public void avanza(int x){
        for (int i = 0; i < x; i++) {
                  
        super.forward(40);
        super.turnRight();
        super.forward(40);
        super.turnLeft();
        super.forward(40);
        super.turnLeft();
        super.forward(40);
        super.turnRight();
          try {
               Thread.sleep(((int)(Math.random()*5000)));
            } catch (InterruptedException e) {
            }

    if ((super.getYPos())==440) {
    JOptionPane.showMessageDialog(null, "Gane!! ",
"Ganador"+super.getName(), JOptionPane.WARNING_MESSAGE);      
      }
        }
    }
    
        @Override
    public void run() {
        avanza(5);
       turnRight();
   avanza(7);
      turnRight();
        avanza(10);
       
    }
    
}
