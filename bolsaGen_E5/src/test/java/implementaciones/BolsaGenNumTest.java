package implementaciones;

import implementaciones.BolsaGenNum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba de la clase BolsaGenNum
 * @author E5
 */
public class BolsaGenNumTest {
    /**
     * Prueba del metodo suma()
     * Agrega elementos al arreglo y los suma
     * @return El valor de los elementos del arreglo
     */
    @Test
    public void testsuma(){
        BolsaGenNum<Number> bolsa = new BolsaGenNum<>(5);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(2);
        double expResult = 10.0;
        double result = bolsa.suma();
        assertEquals(expResult, result,0);
    }
    /**
     * Prueba del metodo promedio()
     * Agrega elementos al arreglo y calcula el promedio
     * @return El valor de los elementos del arreglo
     */
    @Test
    public void testPromedio() {
        BolsaGenNum<Number> bolsa = new BolsaGenNum<>(10);
        bolsa.agrega(1);
        bolsa.agrega(1);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(3);
        bolsa.agrega(3);
        bolsa.agrega(3);
        bolsa.agrega(4);
        double expResult = 2.2;
        double result = bolsa.promedio();
        assertEquals(expResult, result, 0);
    }
    /**
     * Prueba del metodo mayores()
     * Agrega y obtiene los numeros mayores al promedio
     * @return El valor mayor al promedio
     */
    @Test
    public void testMayores() {
        BolsaGenNum<Number> bolsa = new BolsaGenNum<>(10);
        bolsa.agrega(1);
        bolsa.agrega(1);
        bolsa.agrega(1);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(2);
        bolsa.agrega(3);
        bolsa.agrega(3);
        bolsa.agrega(3);
        bolsa.agrega(4);
        double expResult = 4;
        double result = bolsa.mayores();
        assertEquals(expResult, result);
    }
}
