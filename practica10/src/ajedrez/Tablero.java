package ajedrez;
import processing.core.PApplet;
/**
  * Práctica 10. Tablero de ajedrez
  * @author Gómez de la Torre Heidi Lizbeth
  * @version 03/Oct/2019
  */

  public class Tablero extends PApplet {

      public static void main (String [] args) {
          PApplet.main("ajedrez.Tablero");
          }

          /**
            * Metodo para configurar nuestro ajedrez
            */
          @Override
          public void settings() {
              size(720,720);
          }

          @Override
          public void setup() {

          }

          /**
            * Método para diseñar nuestro tablero de ajedrez
            */
          @Override
          public void draw () {
            final int negro = 0xFF000000;
            final int blanco = 0xFFFFFAF0;
            final int tabla = 700;
            int y = 180;
            int x = 90;

            for (int i = 0; i < tabla; i += 90) {
              for (int j = 0; j < tabla; j ++) {
                if ( i == 0 || i == y || i == (y + 180) || i == (y + 360) ) {
                  fill (negro);
                  rect (i, j, 90, 90);
                  fill (blanco);
                  rect (i, j+90, 90, 90);
                } else if ( i == x || i == (x += 180) ) {
                  fill (blanco);
                  rect (i , j, 90, 90);
                  fill (negro);
                  rect (i, j+90, 90, 90);
                }
                j += 180;
              }

            }

          }

  }
