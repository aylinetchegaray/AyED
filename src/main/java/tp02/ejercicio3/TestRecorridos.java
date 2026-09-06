package tp02.ejercicio3;

import tp02.ejercicio1.ArbolGeneral;

public class TestRecorridos {

    public static void main(String[] args) {
        ArbolGeneral<Integer> raiz = new ArbolGeneral<>(14);

        // Rama izquierda (13)
        ArbolGeneral<Integer> nodo13 = new ArbolGeneral<>(13);
        nodo13.agregarHijo(new ArbolGeneral<>(4));
        nodo13.agregarHijo(new ArbolGeneral<>(7));
        nodo13.agregarHijo(new ArbolGeneral<>(5));

        // Rama central (25)
        ArbolGeneral<Integer> nodo25 = new ArbolGeneral<>(25);
        nodo25.agregarHijo(new ArbolGeneral<>(6));
        nodo25.agregarHijo(new ArbolGeneral<>(10));
        nodo25.agregarHijo(new ArbolGeneral<>(18));

        // Rama derecha (10)
        ArbolGeneral<Integer> nodo10 = new ArbolGeneral<>(10);
        nodo10.agregarHijo(new ArbolGeneral<>(9));
        nodo10.agregarHijo(new ArbolGeneral<>(12));
        nodo10.agregarHijo(new ArbolGeneral<>(19));

        raiz.agregarHijo(nodo13);
        raiz.agregarHijo(nodo25);
        raiz.agregarHijo(nodo10);

        RecorridosAG recorridos = new RecorridosAG();

        // Los impares del árbol son: 13, 7, 5, 25, 9, 19.
        Integer n = 6;

        System.out.println("Buscando números impares mayores a " + n + "...\n");

        System.out.println("Recorrido PreOrden (Raíz -> Hijos):");
        System.out.println(recorridos.numerosImparesMayoresQuePreOrden(raiz, n));

        System.out.println("\nRecorrido InOrden (Hijo Izq -> Raíz -> Resto):");
        System.out.println(recorridos.numerosImparesMayoresQueInOrden(raiz, n));

        System.out.println("\nRecorrido PostOrden (Hijos -> Raíz):");
        System.out.println(recorridos.numerosImparesMayoresQuePostOrden(raiz, n));

        System.out.println("\nRecorrido Por Niveles (Anchura):");
        System.out.println(recorridos.numerosImparesMayoresQuePorNiveles(raiz, n));
    }
}