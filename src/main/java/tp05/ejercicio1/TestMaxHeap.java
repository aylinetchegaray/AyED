package tp05.ejercicio1;

public class TestMaxHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> heap = new MaxHeap<>();

        System.out.println("---Carga de la MaxHeap---");
        // frozamos el percolate_up
        Integer[] valores = {40, 70, 30, 50, 90, 80, 60};
        for (Integer v : valores) {
            heap.agregar(v);
        }

        System.out.print("Estado inicial: ");
        System.out.println(" ");
        heap.imprimir();
        // Salida esperada: 90 70 80 40 50 60 30

        int estado = 1;
        int eliminacion = 3;

        while (estado <= eliminacion) {
            System.out.println("\n---Eliminación n°" + estado+ "---");
            System.out.println("Se extrae el: " + heap.tope());
            heap.eliminar();
            System.out.print("Estado tras eliminar: ");
            System.out.println(" ");
            heap.imprimir();

            estado++;
        }
        /*Salida 1: 80 70 60 40 50 30 (80 sube a la raíz)
         Salida 2: 70 50 60 40 30 (70 sube a la raíz)
         Salida 3: 60 50 30 40 (60 sube a la raíz)
        */
    }
}