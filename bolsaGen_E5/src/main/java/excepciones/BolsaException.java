package excepciones;

/**
 * BolsaException.java
 * Esta clase permite crear excepciones del tipo BolsaException
 * Las excepciones de este tipo seran lanzadas cuando ocurra un error
 * en el codigo del proyecto bolsaGen_E5
 * @author E5
 */
public class BolsaException extends RuntimeException{
    // Constructor vacio
    public BolsaException() {
        super();
    }
    /**
     * Constructor que inicializa el atributo s de la clase padre
     * @param s Parametro de mensaje de error
     */
    public BolsaException (String s) {
        super(s);
    }
}
