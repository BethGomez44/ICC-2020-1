/**
  * Clase para leer archivos de tipo .csv
  * @author Gómez de la Torre Heidi Lizbeth
  * @version 10/Nov/2019
  */
package practica14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;

public class LectorCSV {
    /**
<<<<<<< HEAD
     * Metodo que recibe la ruta de un archivo y genera una lista de arreglos tipo
     * String con informacion obtenida a partir de un .csv
     * 
     * @param ruta ruta donde se encuentra el archivo .csv
     * @return Lista de arreglos de String con coordenadas de la forma (x,y)
     */
=======
	* Metodo que recibe la ruta de un archivo y genera una lista de arreglos tipo String con informacion obtenida a partir de un .csv
	* @param ruta ruta donde se encuentra el archivo .csv
	* @return Lista de arreglos de String con coordenadas de la forma (x,y)
	*/
>>>>>>> 1a66b5a31f504952553a6bab95388559d95ef81a
    public static List<String[]> leer(String ruta) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(ruta));
        LinkedList<String[]> linSeparadas = new LinkedList<>();

        for (String linea : lineas) {
            if (!linea.isBlank() && linea.indexOf('x') == -1 && linea.indexOf('X') == -1) {
                linSeparadas.add(linea.trim().split(","));
            }
<<<<<<< HEAD
        }
=======
        }        
>>>>>>> 1a66b5a31f504952553a6bab95388559d95ef81a

        return linSeparadas;
    }

}