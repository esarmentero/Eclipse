package libro;

/**
 * Clase para guardar la informacion de cada uno de los libros de una biblioteca
 * @author DAM
 * @version 1.0
 */

public class Libro {
	/**
	 * Atributo para informar el titulo del libro
	 */
    private String titulo;
    /**
     * Artibuto para informar el autor del libro
     */
    private String autor;
    /**
     * Atributo para informar el numero de ejemplares totales de la biblioteca
     */
    private int ejemplares;
    /**
     * Atributo para informar del numero de ejemplares prestados
     */
    private int prestados;
    
    /**
     * nueva variable
     */
    
    private String nuevo = "Nuevo";

   /**
    * Constructor vacio de la clase Libro
    */
    public Libro() {
    }

    /**
     * Constructor de la clase Libro con parametros
     * @param titulo: titulo del libro
     * @param autor: autor del libro
     * @param ejemplares: numero de libros totales de la biblioteca
     * @param prestados: numero de libros prestados
     */
    public Libro(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * @return the prestados
     */
    public int getPrestados() {
        return prestados;
    }
    
    /**
     * @param prestados the prestados to set
     */
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo booleano para comprobar si el numero de prestamos supera al de ejemplares totales
     * @return false: el numero de prestamos es mayor que el de ejemplares
     * 		   true: se devuelve el valor cuando el numero de prestamos es menor que el de ejemplares.
     * 				 Se suma uno más al valor de la variable de prestamos.
     */
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    /**
     * Metodo booleano que valida el numero de prestamos
     * @return false: en el caso de que los libros prestados sean cero
     * 		   true: valor por defecto. Se devuelve en el caso de que los libros prestados sean distintos de cero
     * 		   Ademas, se decrementa la variable prestados.
     */
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }
    /**
     * Método toString para mostrar todos los datos de la clase libro concatenados
     * @return devuelve todos los valores concatenados
     */
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
   
}
