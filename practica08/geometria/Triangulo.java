package geometria;
/**
  *Representa un polígono de tres lados.
  *Está definido por tres puntos en el plano cartesiano.
  */
  public class Triangulo {

      private Punto a1;
      private Punto b1;
      private Punto c1;

      /**
        * EQUILATERO -- Triángulo con todos sus lados de la misma longitud.
        * ESCALENO -- Triángulo con todos sus lados de longitud distinta.
        * ISOSCELES -- Triángulo con exactamente dos lados de la misma longitud.
        */

      public static final int EQUILATERO = 0;
      public static final int ESCALENO = 2;
      public static final int ISOSCELES = 1;

      /**
        * Crea un triángulo equilátero de lado 1 con vertices en
        * (0,0), (1,0) y (0.5,sin(π / 3)).
        */
      public Triangulo() {
        a1 = new Punto (0,0);
        b1 = new Punto (1,0);
        c1 = new Punto (0.5, Math.sin(Math.PI / 3));
      }

      /**
        * Crea un triángulo con los tres puntos dados
        */
      public Triangulo(Punto a, Punto b, Punto c) {
        a1 = a;
        b1 = b;
        c1 = c;
      }

      /**
        * Determina si los vértices de este triángulo están alineados.
        * @return true si los vértices están alineados
        */
      public boolean tieneVerticesAlineados() {
          return a1.estanAlineados(b1,c1);
      }

      /**
        * Regresa el tipo de este triángulo según la longitud de sus lados;
        * puede ser equilátero, isósceles o escaleno.
        * @return el tipo de este triangulo
        */
      public int tipo() {
          if (a1.distancia(b1) == b1.distancia(c1) && a1.distancia(b1) == c1.distancia(a1)) {
            return EQUILATERO;
          } else if (a1.distancia(b1) == b1.distancia(c1) || a1.distancia(b1) == c1.distancia(a1)) {
            return ISOSCELES;
          } else {
            return ESCALENO;
          }
      }

      /**
        * Obtener el punto A de nuestro triangulo;
        * @return -- Regresa el punto a
        */
      public Punto getA() {
        return a1;
      }

      /**
        * Obtener el punto B de nuestro triangulo;
        * @return -- Regresa el punto b
        */
      public Punto getB() {
        return b1;
      }

      /**
        * Obtener el punto C de nuestro triangulo;
        * @return -- Regresa el punto b
        */
      public Punto getC() {
        return c1;
      }
  }
