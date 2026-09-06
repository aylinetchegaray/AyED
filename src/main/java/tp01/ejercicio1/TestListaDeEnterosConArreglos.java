/********************************************************************************
 * 1.2. Escriba una clase llamada TestListaDeEnterosConArreglos que reciba en su
 * metodo main una secuencia de números, los agregue a un objeto de tipo
 * ListaDeEnterosConArreglos y luego imprima los elementos de dicha lista.
 *********************************************************************************/

package tp01.ejercicio1;

public class TestListaDeEnterosConArreglos {
    public static void main(String[] args) {
        ListaDeEnterosConArreglos L = new ListaDeEnterosConArreglos();
        int[] numeros = {1, 2, 4, 8, 16};

        for (int numero : numeros) {
            L.agregarFinal(numero);
        }

        System.out.println("Elementos contenidos en la lista:");
        L.comenzar();

        while (!L.fin()) {
            System.out.println(L.proximo());
        }

        System.out.println("\nImpresión en sentido inverso (Metodo recursivo):");
        L.comenzar();
        imprimirInverso(L);
    }

    public static void imprimirInverso(ListaDeEnteros lista) {
        if (!lista.fin()) {
            Integer actual = lista.proximo();

            imprimirInverso(lista);

            System.out.println(actual);
            }
        }
}