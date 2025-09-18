package implementaciones;

import implementaciones.BolsaGenNum;
import excepciones.BolsaException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pablo
 */
public class BolsaGenNumTest {
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
    
    
}
