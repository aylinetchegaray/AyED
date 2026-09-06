package tp01.ejercicio3;

public class TestPilaYCola {
    public static void main(String[] args) {

        //PRUEBA DE PILA (LIFO)
        System.out.println("Pila Generica:");
        PilaGenerica<String> pila = new PilaGenerica<>();

        pila.apilar("Algoritmos y Estructuras de Datos");
        pila.apilar("Proyecto de Software");
        pila.apilar("Bases de Datos 2");

        System.out.println("Tope actual de la pila: " + pila.tope());
        System.out.println("Vaciando pila:");

        while (!pila.esVacia()) {
            System.out.println(" - Desapilado: " + pila.desapilar());
        }

        // PRUEBA DE COLA (FIFO)
        System.out.println("\nCola Generica: ");
        ColaGenerica<String> cola = new ColaGenerica<>();

        cola.encolar("Algoritmos y Estructuras de Datos");
        cola.encolar("Proyecto de Software");
        cola.encolar("Bases de Datos 2");

        System.out.println("Tope actual de la cola: " + cola.tope());
        System.out.println("Vaciando cola:");

        while (!cola.esVacia()) {
            System.out.println(" - Desencolado: " + cola.desencolar());
        }
    }
}