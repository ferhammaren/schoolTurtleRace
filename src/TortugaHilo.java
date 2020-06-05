/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import misClases.ModelDisplay;
import misClases.Turtle;
import misClases.World;

/**
 *
 * @author Maisha
 */
public class TortugaHilo extends Turtle implements Runnable {

    boolean gane;
    String nombre;
static boolean ban;
    public TortugaHilo(ModelDisplay modelDisplay, String nombre, int x, int y) {
        super(modelDisplay);
        super.setName(nombre);
        super.penUp();
        super.moveTo(x, y);
        super.penDown();
        super.turnRight();
    }

    public void run() {
        int ancho;
         ban = true;
        World mundo = (World) super.getModelDisplay();
        ancho = mundo.getWidth();
        int cont = 0;
        while (ban) {
            System.out.println("Posicion tortuga " + this.getXPos());
         //   dibujaLinea((int) (50 * Math.random()));
            forward((int) (50 * Math.random()));
            mundo.repaint();
            System.out.println(this.getName());
            try {
                //Thread.sleep((int) Math.random()*50000);
                Thread.sleep(700);
            } catch (InterruptedException e) {
            }

            System.out.println("TERMINE! " + this.getName());
            if (this.getXPos() < ancho - 10) {
                ban = true;
                gane = ban;
            } else {
                //nuncaentra a este else, la condicion del if siempre es verdadera.
                ban = false;
                gane = ban;
                System.out.println("Gane!" + this.getName());
            }
        }
    }
public void setBan(boolean b){
    ban=b;
}
    public boolean isGane() {
        return gane;
    }

    public void setGane(boolean gane) {
        this.gane = gane;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
