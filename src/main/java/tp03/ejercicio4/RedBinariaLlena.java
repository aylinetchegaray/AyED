/*
b) Cree una clase Java llamada RedBinariaLlena, dentro del paquete tp03.ejercicio4,
donde deberá implementar lo solicitado en el metodo public int retardoReenvio()
 */

package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
    private ArbolBinario<Integer> arbol;

    public RedBinariaLlena(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    public int retardoReenvio() {
        if (this.arbol == null || this.arbol.esVacio()) {
            return 0;
        }
        return calcularRetardoMaximo(this.arbol);
    }

    private int calcularRetardoMaximo(ArbolBinario<Integer> nodo) {
        // Si el nodo es hoja, su retardo de camino es su propio valor
        if (nodo.esHoja()) {
            return nodo.getDato();
        }

        int retardoIzq = 0;
        int retardoDer = 0;

        // Baja por la rama izquierda
        if (nodo.tieneHijoIzquierdo()) {
            retardoIzq = calcularRetardoMaximo(nodo.getHijoIzquierdo());
        }

        // Baja por la rama derecha
        if (nodo.tieneHijoDerecho()) {
            retardoDer = calcularRetardoMaximo(nodo.getHijoDerecho());
        }

        // El retardo acumulado es el retardo del nodo actual sumado al peor retardo de sus dos ramas hijas
        return nodo.getDato() + Math.max(retardoIzq, retardoDer);
    }
}