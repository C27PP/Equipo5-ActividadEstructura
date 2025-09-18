
package implementaciones;

import excepciones.BolsaException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Pablo
 */
public class BolsaGenTest {
    @Test
    public void BolsaGen() {
        BolsaGen<Integer> bolsa = new BolsaGen<>(4);    
    }
    
    @Test
    public void obtenNumObjetos() {
        BolsaGen<Integer> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.agrega(3);
        bolsa.agrega(4);
        // bolsa.agrega(5); Con un objeto se lanza la excepcion
        bolsa.obtenNumObjetos();
    }
    
    @Test
    public void vacia() {
        System.out.println("Prueba del metodo vacia()");
        BolsaGen<Integer> instancia = null;
        double expResult;
        double result;
        instancia = new BolsaGen<>(1);
        //instance.agrega(1); Si se agrega un objeto falla el test
        expResult = 0;
        result = instancia.obtenNumObjetos();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void agrega() {
        
    }
}
