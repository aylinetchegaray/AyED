/**************************************************************************************************************
3.
a) Implemente en la clase RecorridosAG los siguientes métodos:

public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral <Integer> a, Integer n)
Metodo que retorna una lista con los elementos impares del árbol “a” que sean
mayores al valor “n” pasados como parámetros, recorrido en preorden.

public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral <Integer> a, Integer n)
Metodo que retorna una lista con los elementos impares del árbol “a” que sean
mayores al valor “n” pasados como parámetros, recorrido en inorden.

public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral <Integer> a, Integer n)
Metodo que retorna una lista con los elementos impares del árbol “a” que sean
mayores al valor “n” pasados como parámetros recorrido en postorden.

public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles (ArbolGeneral <Integer> a, Integer n)
Metodo que retorna una lista con los elementos impares del árbol “a” que sean
mayores al valor “n” pasados como parámetros, recorrido por niveles.
 *************************************************************************************************************/

package tp02.ejercicio3;

import tp01.ejercicio2.ListaEnlazadaGenerica;
import tp01.ejercicio2.ListaGenerica;
import tp01.ejercicio3.ColaGenerica;
import tp02.ejercicio1.ArbolGeneral;

public class RecorridosAG {

    private boolean imparMayorQue(Integer n, Integer numero){
        return numero %2 !=0 && numero > n;
    }

    //Preorder (raiz->hijos)
    public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> resultado = new ListaEnlazadaGenerica<>();
        if (a != null && !a.esVacio()) {
            preOrdenRecursivo(a, n, resultado);
        }
        return resultado;
    }

    private void preOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        Integer dato = a.getDato();
        if (imparMayorQue(n, dato)) {
            lista.agregarFinal(dato);
        }

        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            hijos.comenzar();
            while (!hijos.fin()) {
                preOrdenRecursivo(hijos.proximo(), n, lista);
            }
        }
    }

    //Inorden (primer hijo-> raiz-> resto)
    public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> resultado = new ListaEnlazadaGenerica<>();
        if (a != null && !a.esVacio()) {
            inOrdenRecursivo(a, n, resultado);
        }
        return resultado;
    }

    private void inOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            hijos.comenzar();

            if (!hijos.fin()) {
                inOrdenRecursivo(hijos.proximo(), n, lista);
            }

            Integer dato = a.getDato();
            if (imparMayorQue(n,dato)) {
                lista.agregarFinal(dato);
            }

            while (!hijos.fin()) {
                inOrdenRecursivo(hijos.proximo(), n, lista);
            }
        } else {
            Integer dato = a.getDato();
            if (imparMayorQue(n,dato)) {
                lista.agregarFinal(dato);
            }
        }
    }

    // Postorden (hijos->raiz)
    public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> resultado = new ListaEnlazadaGenerica<>();
        if (a != null && !a.esVacio()) {
            postOrdenRecursivo(a, n, resultado);
        }
        return resultado;
    }

    private void postOrdenRecursivo(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            hijos.comenzar();
            while (!hijos.fin()) {
                postOrdenRecursivo(hijos.proximo(), n, lista);
            }
        }

        Integer dato = a.getDato();
        if (imparMayorQue(n, dato)) {
            lista.agregarFinal(dato);
        }
    }

    // por niveles
    public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral<Integer> a, Integer n) {
        ListaGenerica<Integer> resultado = new ListaEnlazadaGenerica<>();

        if (a != null && !a.esVacio()) {
            ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<>();
            cola.encolar(a);

            while (!cola.esVacia()) {
                ArbolGeneral<Integer> aux = cola.desencolar();
                Integer dato = aux.getDato();

                if (imparMayorQue(n, dato)) {
                    resultado.agregarFinal(dato);
                }

                if (aux.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
                    hijos.comenzar();
                    while (!hijos.fin()) {
                        cola.encolar(hijos.proximo());
                    }
                }
            }
        }
        return resultado;
    }
}