package tp05.ejercicio1;

public class TestMinHeap {

    public static void main(String[] args) {
        MinHeap<Integer> heap = new MinHeap<>();

        // creacion de min heap
        Integer[] valores = {40, 70, 30, 50, 90, 80, 60};
        for (Integer v : valores) {
            heap.agregar(v);
        }

        System.out.println("---Carga de la MinHeap---");
        System.out.print("Estado inicial esperado (raíz 30): ");
        System.out.println(" ");
        // La raiz tiene que ser 30
        //orden esperado: 30 50 40 70 90 80 60
        heap.imprimir();

        int estado = 1;
        int eliminacion = 2;

        while (estado <= eliminacion) {
            System.out.println("\n---Eliminación n°" + estado+ "---");
            System.out.println("Se extrae el minimo: " + heap.tope());
            heap.eliminar();
            System.out.print("Estado tras eliminar: ");
            System.out.println(" ");
            heap.imprimir();

            estado++;
        }
        /*Salida 1: 40 50 60 70 90 80 (40 sube a la raíz)
         Salida 2: 50 70 60 80 90 (50 sube a la raíz)
        */

        // Vaciado completo para verificar que no haya errores de límite
        System.out.println("\n---Vaciado de la estructura---");
        while (!heap.esVacia()) {
            System.out.print(heap.tope() + " ");
            heap.eliminar();
        }
        System.out.println("\n(La estructura quedó vacía)");
    }
}