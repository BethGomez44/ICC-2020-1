package alglin;

/**
 * Representa una matriz de mxn con entradas en los reales.
 *
 */
public class Matriz {

    private double[][] datos;
    private int m, n;

    /**
     * Crea una matriz de mxn donde todas las entradas son cero.
     *
     * @param m el número de filas
     * @param n el número de columnas
     */
    public Matriz(int m, int n) {
        if ( m > 0 && n > 0 ) {
            this.m = m;
            this.n = n;
            datos = new double[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                datos[i][j] = 0;
                }
            }
        }
    }

    /**
     * Regresa la entrada en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param i la fila de la entrada deseada
     * @param j la columna de la entrada deseada
     * @return la entrada i,j
     */
    public double obtenerEntrada(int i, int j) {
        return datos[i][j];
    }

    /**
     * Inserta el dato dado en la i-ésima fila y j-ésima columna de esta matriz.
     *
     * @param dato el número que se insertará en esta matriz
     * @param i    la fila donde se insertará <code>dato</code>
     * @param j    la columna donde se insertará <code>dato</code>
     */
    public void asignarEntrada(double dato, int i, int j) {
        datos[i][j] = dato;
    }

    /**
     * Suma esta matriz con otra. Regresa <code>null</code> si las matrices no tienen las mismas
     * dimensiones.
     *
     * @param otra la otra matriz con la cual se sumará esta
     * @return una matriz nueva que resulta de sumar esta con <code>otra</code>
     */
    public Matriz sumar(Matriz otra) {
    if ( m == otra.m && n == otra.n) {

    Matriz umb = new Matriz(m,n);

        for (int i = 0; i < m; i++ ) {
            for (int j = 0; j < n; j++ ) {
            umb.asignarEntrada(this.datos[i][j] + otra.datos[i][j], i, j);
            }    
        }
        return umb;
    }
    return null;
    }

    /**
     * Multiplica esta matriz por un escalar.
     *
     * @param c el escalar real
     * @return una matriz nueva que resulta de multiplicar esta por <code>c</code>
     */
    public Matriz escalar(double c) {
    if (c > 0) {

        Matriz umb = new Matriz(m,n);

        for (int i = 0; i < m; i++ ) {
            for (int j = 0; j < n; j++ ) {
            umb.asignarEntrada((this.datos[i][j]*c), i, j);
            }
        }
        return umb;
    }
    return null;
    }

    /**
     * Elimina una fila de esta matriz.
     *
     * @param k la fila a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima fila de esta matriz
     */
    public Matriz eliminarFila(int k) {
        int x = 0;
        Matriz umb = new Matriz(m-1,n);
        for (int i = 0; i < m; i++) { 

            for (int j = 0; j < n; j++) {
                if (i != k) {
                    umb.datos[x][j]=this.datos[i][j];
                } 
            }
            if (i != k){
                x += 1;
            }
        }
        return umb;
    }

    /**
     * Elimina una columna de esta matriz.
     *
     * @param k la columna a eliminar
     * @return una matriz nueva que resulta de eliminar la k-ésima columna de esta matriz
     */
    public Matriz eliminarColumna(int k) {
         int x = 0;
        Matriz umb = new Matriz(m,n-1);
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {
                if (j != k) {
                    umb.datos[i][j-x]=this.datos[i][j];
                } else {
                    x = 1;
                }
            }
            x  = 0;
        }
        return umb;
    }

    /**
     * Calcula el determinante de esta matriz.
     *
     * @return el determinante de esta matriz
     */
    public double determinante() {
        for (int k=0; k<n-1; k++) {
            for (int i=k+1; i<n; i++) {
                for (int j=k+1; j<n; j++) {
                    datos[i][j]-=datos[i][k]*datos[k][j]/datos[k][k];
                }
            }
        }
        double deter=1.0;
        for (int i=0; i<n; i++) {
            deter+=datos[i][i];
        }
        return deter;
    }
    /**
     * Regresa los datos de esta matriz de tal forma que las columnas están separadas por un espacio
     * y las filas están separadas por un salto de línea. Por ejemplo: <br>
     * "2.0 3.0 0.0 1.0 <br>
     * &nbsp;4.0 0.0 9.0 8.0 <br>
     * &nbsp;5.0 7.0 2.0 4.0"
     *
     * @return la representación en <code>String</code> de esta matriz
     */
    @Override
    public String toString() {
        if (datos != null) {
            String cad = new String();
            for (int i = 0; i < m; i++) {
                for (int j= 0; j < n; j++) {
                    cad += datos[i][j];
                if (j < n-1) {
                    cad += " ";
                } 
            }
            cad += "\n";
            }
            return cad;
        }
        return null;
    }

    /**
     * Regresa <code>true</code> si y sólo si <code>obj</code> es una instancia de 
     * {@link alglin.Matriz} y las matrices son iguales entrada por entrada.
     *
     * @param obj el objeto a comparar
     * @return <code>true</code> si <code>this</code> y <code>obj</code> son iguales entrada por
     *         entrada
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matriz otra = (Matriz) obj;
        if (m != otra.m || n != otra.n) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (datos[i][j] != otra.datos[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}