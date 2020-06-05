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
public class ZigzagTurtle extends Turtle implements Runnable{
    
  public ZigzagTurtle (int x, int y, ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  public void avanza(int x){
      for (int i = 0; i < x; i++) {
          super.turn(45);
          super.forward(40);
          super.turn(-90);
          super.forward(40);
         super.turn(45);
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
  
  public void run(){
      avanza(7);
turnRight();
avanza(10);
turn(90);
avanza(7);

      

  }
    }

