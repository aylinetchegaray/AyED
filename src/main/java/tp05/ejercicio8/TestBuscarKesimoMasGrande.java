package tp05.ejercicio8;
import tp05.ejercicio1.MaxHeap;
import java.util.Arrays;

public class TestBuscarKesimoMasGrande {

    public static int BuscarKesimoMasGrande(Integer[] arreglo, int k) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo ni vacío.");
        }
        if (k <= 0 || k > arreglo.length) {
            throw new IllegalArgumentException("El valor de K es inválido para el tamaño del arreglo.");
        }

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

        try{
        int res= BuscarKesimoMasGrande(arreglo,k);
        System.out.println("Arreglo: "+ Arrays.toString(arreglo) + " y k= "+k);
        System.out.println("El K-ésimo elemento más grande es: " + res);

        System.out.println("Arreglo: "+ Arrays.toString(arreglo) + " y k= "+20);
        BuscarKesimoMasGrande(arreglo, 20);
    } catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}