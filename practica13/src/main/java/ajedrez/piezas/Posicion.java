/**
  * Clase para determinar la posicion de nuestras piezas.
  */
package ajedrez.piezas;  

public class Posicion {

    private int fila;
    private int columna;

    /**
      * Contructor de una posicion.
      * @param fila -- La fila en la que se colocara.
      * @param columna -- La columna en la que se colocara.
      */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
      * Método que nos regresará la fila de nuestra posición.
      * @return La fila.
      */
    public int obtenerFila() {
        return fila;
    }

    /**
      * Método que nos regresará la columna de nuestra posición.
      * @return La columna.
      */
    public int obtenerColumna() {
        return columna;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Posicion otra = (Posicion) obj;
        return fila == otra.fila && columna == otra.columna;
    }

    /**
      * Método que nos devolvera una cadena con las posiciones.
      * @return pos -- Las posiciones en forma de cadena.
      */
    public String toString() {
        String pos = "(";
        pos += obtenerFila() + "," + obtenerColumna() + ")";
        return pos;
    }
}