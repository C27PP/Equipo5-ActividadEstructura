package implementaciones;

import excepciones.BolsaException;
import implementaciones.BolsaGen;
/**
 *
 * @author Pablo
 */
public class BolsaGenNum<T extends Number> extends BolsaGen<T>{
    
    public BolsaGenNum(int tamBolsa) {
        super(tamBolsa);
    }
    public double suma() {
        if (vacia()) {
            throw new BolsaException("La bolsa esta vacia");
        }
        double suma = 0;
        for (T elemento : obtenObjetos()) {
            suma += elemento.doubleValue();
        }
        return suma;
    }
}
