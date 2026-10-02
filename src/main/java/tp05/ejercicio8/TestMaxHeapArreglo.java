package tp05.ejercicio8;
import tp05.ejercicio1.MaxHeap;

public class TestMaxHeapArreglo {

    public static int BuscarKesimoMasGrande(Integer[] arreglo, int k) {
        MaxHeap<Integer> maxHeapArreglo = new MaxHeap<>();

        for (Integer elemento : arreglo) {
            maxHeapArreglo.agregar(elemento);
        }

        while (k > 1) {
            k = k - 1;
            maxHeapArreglo.eliminar();
        }
        return maxHeapArreglo.tope();
    }

    public static void main(String[] args) {

        Integer[] arreglo = {10, 25, 34, 5, 8, 97, 73};
        int k=3;

        int res= BuscarKesimoMasGrande(arreglo,k);
        System.out.println("El K-ésimo elemento más grande es: " + res);
    }
}