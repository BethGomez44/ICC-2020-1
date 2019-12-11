package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

/**
 * Prueba de la clase Dama
 */

public class PruebaDama {

  public static void main(String[] pps) {
    Tablero tab = Tablero.obtenerInstancia();

    Pieza p = tab.obtenerPieza(7, 3);

    System.out.println("La dama colocada en la posición: " + p.obtenerPosicion());
    System.out.println("Se puede mover a las siguientes casillas: " + p.obtenerJugadasLegales());
  }
}