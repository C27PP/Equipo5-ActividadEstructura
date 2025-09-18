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
        if (vacia()) {
        throw new BolsaException("La bolsa está vacía");
    }
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
        if (vacia()) {
        throw new BolsaException("La bolsa está vacía");
    }
        return suma()/obtenNumObjetos();
    }
    
   public int mayores() {
    if (vacia()) {
        throw new BolsaException("La bolsa está vacía");
    }
    double prom = promedio();
    int contador = 0;
    String s = toString();
    s = s.replace("[","").replace("]","");
    String[] parts = s.split(",\\s*");
    for (String num : parts) {
        int valor = Integer.parseInt(num);
        if (valor > prom) {
            contador++;
        }
    }
    return contador;
}
}
