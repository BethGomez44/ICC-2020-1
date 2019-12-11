package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

/**
 * Prueba para nuestra clase Peon.
 */
public class PruebaPeon {

  public static void main(String[] args) {

    Posicion pos1 = new Posicion(6, 4);
    Posicion pos2 = new Posicion(1, 1);
    Posicion pos3 = new Posicion(4, 4);
    Posicion pos4 = new Posicion(2, 1);
    Peon peonB = new Peon(Color.BLANCO, pos1);
    Peon peonN = new Peon(Color.NEGRO, pos2);

    System.out.println("Mi peón blanco se encuentra en la posición: " + peonB.obtenerPosicion());
    System.out.println("Y se puede mover a las posiciones: " + peonB.obtenerJugadasLegales());
    System.out.println(" ");
    System.out.println("Mi peón negro se encuentra en la posición: " + peonN.obtenerPosicion());
    System.out.println("Y se puede mover a las posiciones: " + peonN.obtenerJugadasLegales());
    System.out.println(" ");
    peonB.asignarPosicion(pos3);
    System.out.println("Si muevo mi peón blanco a la posición: " + peonB.obtenerPosicion());
    System.out.println("Entonces se podra mover a las posiciones: " + peonB.obtenerJugadasLegales());
    System.out.println(" ");
    peonN.asignarPosicion(pos4);
    System.out.println("Si muevo mi peón negro a la posición: " + peonN.obtenerPosicion());
    System.out.println("Entonces se podra mover a las posiciones: " + peonN.obtenerJugadasLegales());
  }
}