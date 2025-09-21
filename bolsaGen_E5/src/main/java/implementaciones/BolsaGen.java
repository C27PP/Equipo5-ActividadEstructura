package implementaciones;

import excepciones.BolsaException;
import java.util.Random;

/**
 * BolsaGen.java
 * Clase genérica que representa una bolsa de objetos.
 * Permite almacenar, contar, consultar, eliminar y limpiar elementos.
 * @param <T> Tipo de los objetos que contendrá la bolsa.
 * @author E5
 * Cristian Jesus Cruz Mendivil - 00000267652
 * Diego Daniel Chavez Martinez - 000000267854
 * Luis Carlos Laborin Alvarez - 00000268492
 * Juan Pablo Yepiz Leon - 00000268712
 */
public class BolsaGen <T>{
    
    private int tamBolsa;
    private int numObjetos;
    private T[] objetos;
    /**
     * Constructor de la clase Bolsa que inicializa el valor del tamaño de la bolsa
     * @param tamBolsa Tamaño de la bolsa
     */

    public BolsaGen(int tamBolsa) {
        if (tamBolsa < 0) {
            throw new BolsaException("El tamaño de la bolsa no puede ser negativo");
        }
        this.tamBolsa = tamBolsa;
        this.numObjetos = 0;
        /*
        Creacion del arreglo generico
        */
        this.objetos = (T[]) new Object[tamBolsa];
    }
    /**
     * Metodo que obtiene el numero de objetos
     * @return Numero de objetos
     */
    public int obtenNumObjetos() {
        return numObjetos;
    }
    /**
     * Verifica si la bolsa esta vacia
     * @return Verdadero si esta vacia, Falso en caso contrario
     */
    public boolean vacia() {
        return numObjetos == 0;
    }
    /**
     * Agrega un objeto a la bolsa
     * @param objeto Parametro del objeto a agregar
     */
    public void agrega(T objeto) {
        if (numObjetos >= tamBolsa) {
            throw new BolsaException("La bolsa esta llena");
        }
        objetos[numObjetos] = objeto;
        numObjetos++;
    }
    /**
     * Elimina un objeto al azar de la bolsa
     * @return El objeto eliminado
     */
    public T remueve() {
        if (vacia()) {
            throw new BolsaException("La bolsa no contiene nada");
        }
        Random rnd = new Random();
        int objetoAzar = rnd.nextInt(numObjetos);
        T objetoEliminado = objetos[objetoAzar];
        for (int i = objetoAzar; i < numObjetos-1; i++) {
            objetos[i] = objetos[i+1];
        }
        objetos[--numObjetos] = null;
        return objetoEliminado;
    }
    /**
     * Elimina un objeto de la bolsa
     * @param objeto Parametro del objeto a eliminar
     * @return El objeto eliminado
     */
    public T remueve(T objeto) {
        if (vacia()) {
            throw new BolsaException("La bolsa noc contiene nada");
        }
        for (int i = 0; i < numObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                T objetoEliminado = objetos[i];
                for (int j = i; j < numObjetos-1; j++) {
                    objetos[j] = objetos[j+1];
                }
                objetos[--numObjetos] = null;
                return objetoEliminado;
            }
        }
        return null;
    }
    /**
     * Limpia la bolsa
     */
    public void limpia() {
        for (int i = 0; i < numObjetos; i++) {
            objetos[i] = null;
        }
        numObjetos = 0;
    }
    /**
     * Cuenta el numero de veces que un objeto aparece
     * @return Numero de veces que un objeto aparece 
     */
    public int cuenta(T objeto) {
        int cont = 0;
        for (int i = 0; i < numObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                cont++;
            }
        }
        return cont;
    }
    /**
     * Determina si un objeto esta en la bolsa
     * @return Verdadero si el objeto esta en la bolsa, Falso en caso contrario
     */
    public boolean contiene(T objeto) {
        for (int i = 0; i < numObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Obtiene los objetos de la bolsa
     * @return Un arreglo con los objetos de la bolsa
     */
    public T[] obtenObjetos() {
        T[] arregloObjetos = (T[])new Object[numObjetos];
        for (int i = 0; i < numObjetos; i++) {
            arregloObjetos[i] = objetos[i];
        }
        return arregloObjetos;
    }
    /**
     * Devuelve la representación en cadena de los elementos de la bolsa
     * @return Una cadena con la lista de los objetos en la bolsa en el formato: "[objeto1, objeto2, ...]"
     */
    @Override
    public String toString() {
        return java.util.Arrays.toString(obtenObjetos());
    }
   
}
