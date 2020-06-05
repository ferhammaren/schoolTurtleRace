/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Maisha
 */
public class Carrera {

    TortugaHilo tor1;
    TortugaHilo tor2;
    TortugaHilo[] mistortugas;
    ThreadGroup grupo;

    public Carrera(TortugaHilo h1, TortugaHilo h2) {
        tor1 = h1;
        tor2 = h2;
        grupo = new ThreadGroup("grupo");

    }

//    public Carrera(TortugaHilo... mistortugas) {
//        this.mistortugas = mistortugas;
//    }

    public void start() {
        Thread hilo1 = new Thread(tor1);
        Thread hilo2 = new Thread(tor2);
        hilo1.start();
        hilo2.start();
        if (tor1.isGane()) {
            tor2.setBan(false);
        }
        if (tor2.isGane()) {
            tor1.setBan(false);
        }

    }
//la carrera controla quien gano, y notifica a las demas tortugas?????
//    public void arrancan() {
//        boolean noGanan = true;
//        for (TortugaHilo tortugaHilo : mistortugas) {
//            Thread hilo = new Thread(tortugaHilo);
//            hilo.start();
//        }
//
//        while (noGanan) {
//            for (TortugaHilo tortugaHilo : mistortugas) {
//                if (tortugaHilo.getXPos() < tortugaHilo.getModelDisplay().getWidth() - 10) {
//                    tortugaHilo.setGane(true);
//                    tortugaHilo.setBan(false);
//
//                }
//                if (tortugaHilo.isGane()) {
//                    noGanan = false;
//                }
//
//
//            }
//        }
//    }
}
