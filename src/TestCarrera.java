/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import misClases.World;

/**
 *
 * @author Maisha
 */
public class TestCarrera {
    public static void main(String[] args) {
        World mundo=new World();
        TortugaHilo tortuga1=new TortugaHilo(mundo,"Limon",15,15);
        TortugaHilo tortuga2=new TortugaHilo(mundo,"Manzana",15,45);
        tortuga1.setBodyColor(Color.green);
        tortuga2.setBodyColor(Color.RED);
        Carrera carrera1=new Carrera(tortuga1,tortuga2);
   //     carrera1.arrancan();
        carrera1.start();
    }
}
