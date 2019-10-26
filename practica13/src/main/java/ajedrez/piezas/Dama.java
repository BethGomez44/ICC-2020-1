package ajedrez.piezas;

import ajedrez.Tablero;
import java.util.List;
import java.util.LinkedList;

public class Dama extends Pieza {

    /**
      * Constructor de un peón con parámetros.
      * @param color -- El color que se le asignara.
      * @param posicion -- La posición que se le asignara.
      */
    public Dama(Color color, Posicion posicion) {
        super(color, posicion);
    }

    @Override
    public List<Posicion> obtenerJugadasLegales() {
        LinkedList<Posicion> jugadas = new LinkedList<>();
        Tablero tab = Tablero.obtenerInstancia();
        int fila = obtenerPosicion().obtenerFila();
        int columna = obtenerPosicion().obtenerColumna();
        Color colorPieza = obtenerColor();

        // Creador de jugadas para la diagonal superior izquierda.
        for (int i = fila - 1, j = columna - 1; i >= 0 && j >= 0; i--, j--) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la diagonal superior derecha.
        for (int i = fila - 1, j = columna + 1; i >= 0 && j <= 7; i--, j++) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la diagonal inferior izquierda.
        for (int i = fila + 1, j = columna - 1; i <= 7 && j >= 0; i++, j--) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la diagonal inferior derecha.
        for (int i = fila + 1, j = columna + 1; i <= 7 && j >= 0; i++, j++) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la recta vertical.
        for (int i = fila + 1, j = columna; i <= 7; i++) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la recta vertical.
        for (int i = fila - 1, j = columna; i >= 0; i--) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la recta horizontal.
        for (int i = fila, j = columna - 1; j >= 0; j--) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }

        // Creador de jugadas para la recta horizontal.
        for (int i = fila, j = columna + 1; j <= 7; j++) {
        Pieza p = tab.obtenerPieza(i, j);
            if (p == null) {
                jugadas.add(new Posicion(i, j));
            } else if (p.obtenerColor() != colorPieza) {
                jugadas.add(new Posicion(i, j));
                break;
            } else {
                break;
            }
        }        
        return jugadas;
    }
}