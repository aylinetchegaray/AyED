package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRedBinaria {

    public static void main(String[] args) {

        //Hojas (Nivel 2)
        ArbolBinario<Integer> hojaLL = new ArbolBinario<>(2);
        ArbolBinario<Integer> hojaLR = new ArbolBinario<>(4);
        ArbolBinario<Integer> hojaRL = new ArbolBinario<>(6);
        ArbolBinario<Integer> hojaRR = new ArbolBinario<>(1);

        // Nodos intermedios (Nivel 1)
        ArbolBinario<Integer> nodoIzq = new ArbolBinario<>(5);
        nodoIzq.agregarHijoIzquierdo(hojaLL);
        nodoIzq.agregarHijoDerecho(hojaLR);

        ArbolBinario<Integer> nodoDer = new ArbolBinario<>(8);
        nodoDer.agregarHijoIzquierdo(hojaRL);
        nodoDer.agregarHijoDerecho(hojaRR);

        // Raíz (Nivel 0)
        ArbolBinario<Integer> raiz = new ArbolBinario<>(10);
        raiz.agregarHijoIzquierdo(nodoIzq);
        raiz.agregarHijoDerecho(nodoDer);

        RedBinariaLlena red = new RedBinariaLlena(raiz);

        System.out.println("Calculando el mayor retardo de reenvío en la red...");
        int maxRetardo = red.retardoReenvio();
        System.out.println("El mayor retardo posible es: " + maxRetardo + " segundos.");

        if (maxRetardo == 24) {
            System.out.println("Prueba Exitosa. El algoritmo detectó correctamente el camino más largo.");
        } else {
            System.out.println("Error: Se esperaba 24 pero se obtuvo " + maxRetardo);
        }
    }
}