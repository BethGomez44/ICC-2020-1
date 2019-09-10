/**
  * Clase llamada Libro
  * @author Gomez de la Torre Heidi Lizbeth
  * @version 10/Sep/2019
  */

public class Libro {
  /**
    * Declaramos los atributos de la clase
    */
  private String titulo;
  private String autor;
  private int año;

    /**
      * Constructor default
      */
      public Libro () {
        titulo = (" ");
        autor = (" ");
        año = 0;
      }

    /**
     * Constructor con valores para titulo, autor y año
     * @param valTitulo valor para titulo
     * @param valAutor valor para autor
     * @param valAño valor para año
     */
      public Libro(String valTitulo, String valAutor, int valAño) {
          titulo = valTitulo;
          autor = valAutor;
          año = valAño;
      }

    /**
     * Metodo para modificar el titulo
     * @param nuevoTitulo variable tipo String para ingresar un nuevo titulo
     */
      public void modTitulo(String nuevoTitulo) {
          titulo = nuevoTitulo;
      }

    /**
     * Metodo para modificar el autor
     * @param nuevoAutor variable tipo String para ingresar un nuevo autor
     */
      public void modAutor(String nuevoAutor) {
          autor = nuevoAutor;
      }

    /**
      * Metodo para modificar el año de publicacion
      * @param nuevoAño variable tipo int para ingresar un nuevo año
      */
       public void modAño(int nuevoAño) {
          año = nuevoAño;
      }

    /**
      * Metodo para acceder al titulo
      * @return el titulo
      */
       public String obtenerTitulo() {
          return titulo;
      }

    /**
      * Metodo para acceder al autor
      * @return el autor
      */
       public String obtenerAutor() {
          return autor;
       }

    /**
      * Metodo para acceder al año de publicacion
      * @return el año
      */
       public int obtenerAño() {
          return año;
       }

}
