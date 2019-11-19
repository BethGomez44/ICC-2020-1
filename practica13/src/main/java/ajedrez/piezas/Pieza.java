package ajedrez.piezas;

import java.util.List;
import ajedrez.piezas.Posicion;

public abstract class Pieza {

    private Color color;
    private Posicion posicion;

    /**
      * Método para crear pieza con parámetros
      * @param color -- El color que se le asignará a la pieza.
      * @param posicion -- La posicion que se le asignará a la pieza.
      */
    public Pieza(Color color, Posicion posicion) {
        this.color = color;
        this.posicion = posicion;
    }

    
    public abstract List<Posicion> obtenerJugadasLegales();

    /**
      * Método que nos regresará el color de la pieza.
      * @return El color de la pieza.
      */
    public Color obtenerColor() {
        return color;
    }

    /**
      * Método que nos regresará la posición de la pieza.
      * @return La posición de la pieza.
      */
    public Posicion obtenerPosicion() {
        return posicion;
    }

    /**
      * Método que nos regresará el color de la pieza.
      * @return El color de la pieza.
      */
    public void asignarPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pieza otra = (Pieza) obj;
        return color == otra.color && posicion.equals(otra.obtenerPosicion());
    }

}