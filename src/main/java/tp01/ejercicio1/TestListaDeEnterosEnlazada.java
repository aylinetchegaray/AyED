/*****************************************************************************
 *1.3. Escriba una clase llamada TestListaDeEnterosEnlazada que reciba en su
 * metodo main una secuencia de números, los agregue a un objeto de tipo
 * ListaDeEnterosEnlazada y luego imprima los elementos de dicha lista.
 ****************************************************************************/
package tp01.ejercicio1;

public class TestListaDeEnterosEnlazada {
    public static void main(String[] args) {
        ListaDeEnterosEnlazada L = new ListaDeEnterosEnlazada();
        int[] numeros = {1,2, 4, 8, 16};

        for (int numero : numeros) {
            L.agregarFinal(numero);
        }

        System.out.println("Elementos contenidos en la lista enlazada:");

        L.comenzar();

        while (!L.fin()) {
            System.out.println(L.proximo());
        }
    }
}