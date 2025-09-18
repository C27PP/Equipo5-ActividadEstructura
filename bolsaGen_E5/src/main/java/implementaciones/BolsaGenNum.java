package implementaciones;

import excepciones.BolsaException;
import implementaciones.BolsaGen;
/**
 * BolsaGenNum.java
 * Clase que suma, calcula el promedio y los mayores de la bolsa
 * @author E5
 */
public class BolsaGenNum<T extends Number> extends BolsaGen <T> {
    // Constructor
    public BolsaGenNum(int tamBolsa) {
        super(tamBolsa);
    }
    /**
     * Metodo que realiza la suma de los elementos del arreglo
     * @return Regresa el valor de la suma de los elementos
     */
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
    /**
     * Metodo que calcula el promedio de los elementos del arreglo
     * @return Regresa el promedio de los elementos del arreglo
     */
    public double promedio(){
        if (vacia()) {
        throw new BolsaException("La bolsa está vacía");
        }
        return suma()/obtenNumObjetos();
    }
    /**
     * Metodo que obtiene los numeros mayores al promedio
     * @return Regresa el numero de elementos mayores al promedio
     */
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
