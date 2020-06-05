/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carreratortugas;

import java.awt.Color;
import javax.swing.JOptionPane;
import misClases.*;

/**
 *
 * @author Mostro
 */
public class CarreraTortugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     World sekai=new World();
    
        ZigzagTurtle z1= new ZigzagTurtle(50,(sekai.getHeight()-40),sekai);
        SquareTurtle s1= new SquareTurtle(40,(sekai.getHeight()-40),sekai);
       CircleTurtle c1= new CircleTurtle(60,(sekai.getHeight()-40),sekai);
       Turtle t1=new Turtle(30,(sekai.getHeight()-40),sekai);
        SquareTurtle s2= new SquareTurtle(43,(sekai.getHeight()-40),sekai);
           z1.setName("Vreth");
           z1.setColor(Color.black);
           s1.setName("Skrymer");
           s1.setColor(Color.gray);
           c1.setName("Petri");
           c1.setColor(Color.blue);
           t1.setName("Hiddleboo");
           t1.setColor(Color.RED);
           s2.setColor(Color.GREEN);
           s2.setName("Loki");
                  Thread hilo1 = new Thread(z1);
        Thread hilo2 = new Thread(s1);
                  Thread hilo3 = new Thread(c1);
        Thread hilo4 = new Thread(t1);
                  Thread hilo5 = new Thread(s2);
                 
           Integer[] posiblesNumeros = {new Integer(2), new Integer(3), new Integer(4), new Integer(5)};
Integer numeroSeleccionado = (Integer) JOptionPane.showInputDialog(null, "Cuántas tortugas correran?", "Tortugas",
JOptionPane.INFORMATION_MESSAGE, null, posiblesNumeros,
posiblesNumeros[0]);        
switch(numeroSeleccionado){
    case 2: 

        hilo1.start();
        hilo2.start();
        break;
    case 3:
        
      hilo1.start();
        hilo2.start();
        hilo3.start();
break;
 case 4:  
       hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
     break;
 case 5: 
     hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
     break;
}
   

    }
}
