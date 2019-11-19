/**
  * Clase para crear la pieza peón.
  * @author Gómez de la Torre Heidi Lizbeth.
  * @version 22/Oct/2019
  */
package ajedrez.piezas;

import java.util.List;
import java.util.LinkedList;

public class Peon extends Pieza {

    /**
      * Constructor de un peón con parámetros.
      * @param color -- El color que se le asignara.
      * @param posicion -- La posición que se le asignara.
      */
    public Peon(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        int fila = obtenerPosicion().obtenerFila();
        int columna = obtenerPosicion().obtenerColumna();
        if (obtenerColor() == Color.BLANCO) {
            if (fila == 6) {
                jugadas.add(new Posicion(fila - 2, columna));
            }
            if (fila - 1 >= 0) {
                jugadas.add(new Posicion(fila - 1, columna));
            }
            if (fila - 1 >= 0 && columna + 1 <= 7) {
                jugadas.add(new Posicion(fila - 1, columna + 1));
            }
            if (fila - 1 >= 0 && columna - 1 >= 0) {
                jugadas.add(new Posicion(fila - 1, columna - 1));
            }
            if (fila - 1 >= 7 && columna + 1 <= 7) {
                jugadas.add(new Posicion(fila - 1, columna + 1));
            }
        }
        if (obtenerColor() == Color.NEGRO) {
            if (fila == 1) {
                jugadas.add(new Posicion(fila + 2, columna));
            }
            if (fila + 1 <= 7) {
                jugadas.add(new Posicion(fila + 1, columna));
            }
            if (fila + 1 >= 0 && columna - 1 >= 0) {
                jugadas.add(new Posicion(fila + 1, columna - 1));
            }
            if (fila + 1 <= 7 && columna + 1 <= 7) {
                jugadas.add(new Posicion(fila + 1, columna + 1));
            }
            if (fila + 1 >= 7 && columna - 1 >= 0) {
                jugadas.add(new Posicion(fila + 1, columna - 1));
            }
        }
        return jugadas;
    }
}