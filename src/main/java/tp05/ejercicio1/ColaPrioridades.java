package tp05.ejercicio1;

public interface ColaPrioridades <T extends Comparable<T>> {
    boolean esVacia();
    void eliminar();
    boolean agregar(T dato);
    T tope();
}