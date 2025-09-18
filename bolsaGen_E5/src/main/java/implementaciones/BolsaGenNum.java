package implementaciones;

import excepciones.BolsaException;
import implementaciones.BolsaGen;
/**
 *
 * @author Pablo
 */
public class BolsaGenNum<T extends Number> extends BolsaGen <T> {

    public BolsaGenNum(int tamBolsa) {
        super(tamBolsa);
    }
    public double suma() {
    String s = toString();
    s = s.replace("[","").replace("]","");  
    String[] parts = s.split(",\\s*");       
    int suma = 0;
    for (String num : parts) {
    suma += Integer.parseInt(num);
    }
    return suma;
    }
    
    public double promedio(){
        return suma()/obtenNumObjetos();
    }
}
