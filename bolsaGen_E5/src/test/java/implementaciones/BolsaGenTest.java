package implementaciones;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * BolsaGenTest.java
 * Clase de prueba de la clase BolsaGen.
 * @author Pablo
 */
public class BolsaGenTest {
    /**
     * Prueba del constructor BolsaGen()
     * Verifica que el tamaño de la bolsa no sea negativo
     */
    @Test
    public void testBolsaGen() {
        System.out.println("BolsaGen()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
    }
    /**
     * Prueba del metodo obtenNumObjetos()
     * Se le agregan objetos y regresa el numero de objetos
     */
    @Test
    public void testobtenNumObjetos() {
        System.out.println("obtenNumObjetos()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.agrega(3);
        bolsa.agrega(4);
        // bolsa.agrega(5); Con un objeto se lanza la excepcion
        bolsa.obtenNumObjetos();
    }
    /**
     * Prueba del metodo vacia()
     * Verifica que la bolsa este vacia, si esta vacia retorna true,
     * en caso contrario retorna false
     */
    @Test
    public void testvacia() {
        System.out.println("vacia()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        boolean expResult = true;
        boolean result = bolsa.vacia();
        //bolsa.agrega(1); Si se agrega un objeto retorna falso
        assertEquals(expResult, result);
    }
    /**
     * Prueba del metodo agrega()
     * Agrega objetos a la bolsa
     */
    @Test
    public void testagrega() {
        System.out.println("agrega()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        assertEquals(2, bolsa.obtenNumObjetos());
    }
    /**
     * Prueba del metodo remueve()
     * Elimina un objeto al azar de la bolsa
     */
    @Test
    public void testremueve() {
        System.out.println("remueve()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.remueve();
        assertEquals(1, bolsa.obtenNumObjetos());
    }
    /**
     * Prueba del metodo remueveEspecifico()
     * Elimina un objeto de la bolsa
     * @return El objeto eliminado
     */
    @Test
    public void testremueveEspecifico() {
        System.out.println("remueve(T objeto)");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.remueve(1);
        assertEquals(2, bolsa.remueve(2));
    }
    /**
     * Prueba del metodo limpia()
     * Limpia la bolsa
     */
    @Test
    public void testlimpia() {
        System.out.println("limpia()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.limpia();
        assertEquals(0, bolsa.obtenNumObjetos());
    }
    /**
     * Prueba del metodo cuenta()
     * Cuenta el numero de veces que un objeto aparece
     */
    @Test
    public void testcuenta() {
        System.out.println("cuenta()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(1);
        bolsa.agrega(1);
        assertEquals(3, bolsa.cuenta(1));
    }
    /**
     * Prueba del metodo contiene()
     * Determina si un objeto esta en la bolsa
     */
    @Test
    public void testcontiene() {
        System.out.println("contiene()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        assertTrue(bolsa.contiene(2));
    }
    /**
     * Prueba del metodo obtenObjetos
     * Obtiene los objetos de la bolsa
     */
    @Test
    public void testobtenObjetos() {
        System.out.println("obtenObjetos()");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega("A");
        bolsa.agrega("B");
        bolsa.agrega("C");
        Object[] objetos = bolsa.obtenObjetos();
        assertEquals(3, objetos.length);
    }
    /**
     * Prueba del metodo toString()
     * Devuelve la representación en cadena de los elementos de la bolsa
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BolsaGen<Object> bolsa = new BolsaGen<>(4);
        bolsa.agrega(1);
        bolsa.agrega(2);
        assertEquals("[1, 2]", bolsa.toString());
    }
}
