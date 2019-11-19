/**
  * Clase para implementar la clase String con un arreglo de caracteres
  * @author Gomez de la Torre Heidi Lizbeth
  * @version 10/Oct/2019
  *
  */
public class Cadena {
    private char [] caracter;

    /**
      * Contructor por omision de una cadena
      *
      */
    public Cadena(){
        
        caracter = new char[100];
        char k = 'k';
        for ( int i = 0; i < caracter.length; i++) {

            caracter[i] = k;

        }
    
    }

    /**
      * Constructor de una cadena con parametros.
      * @param cadenita -- Cadena pasada como parámetro.
      *
      */
    public Cadena(char [] cadenita) {

        for ( int i = 0; i < caracter.length; i++) {

            caracter[i] = cadenita[i];

        }

    }


    /**
      * Método para remplazar caracteres
      * @param old -- Caracter que se va a remplazar
      * @param new -- Caracter nuevo
      */

    public Cadena replace ( char old, char niu ) {

        char [] nuevo = new char [caracter.length];

        for ( int i = 0; i < nuevo.length; i++ ) {

            if ( nuevo[i] == old ) {

                nuevo[i] = niu;

            } else {

                nuevo[i] = caracter[i];

            }
        }

        return new Cadena(nuevo);
    }

    /**
      * Método para calcular el tamaño de una cadena
      * @return tam -- Regresa el tamaño de la cadena
      *
     */
    public int length() {

        int tam = 0;

        for ( int i = 0; i < caracter.length; i++ ) {

            tam++;

        }

        return tam;
    }

    /**
      * Método para regresar la posicion del caracter pasado como parametro
      * @param c -- Caracter a buscar
      * @return pos -- Regresa la posición del caracter pasado por parametro
      */
    public int indexOf(char c) {

        int pos = 0;
         
        for ( int i = 0; i < caracter.length || caracter[i] != c; i++ ) {
            
            if ( caracter[i] == c) {

                pos += i;
            
            }
        }

        return pos;

    }

    /**
      * Método para regresar la posicion de la cadena pasado como parametro
      * @param cad -- Cadena que se va a buscar
      * @return pos -- Regresa la posición de la cadena pasada por parametro
      */
    public int indexOf(String cad) {
        int pos = 0;
        for ( int i = 0; i < caracter.length; i++ ) {
            if ( caracter[i] == cad.charAt(0) ) {
                int j = i;
                int e = 1;
                boolean sonIguales = true;
                do { 
                    if ( caracter[j] != cad.charAt(e) ) {
                        sonIguales = false;
                    }
                    j++;
                    e++;
                } while ( j < cad.length() && sonIguales == true );
                if ( sonIguales == false ) {
                    pos = -1;
                } else {
                    pos = i;
                }   
            }
        }

        return pos;
    }

    /**
      * Método 
      *
      */
}