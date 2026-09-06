package tp01.ejercicio3;
import tp01.ejercicio2.ListaGenerica;
import tp01.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica<T> {
    private ListaGenerica<T> datos;

    public ColaGenerica() {
        this.datos = new ListaEnlazadaGenerica<T>();
    }

    public void encolar(T elem) {
        this.datos.agregarFinal(elem);
    }

    public T desencolar() {
        if (this.esVacia()) {
            return null;
        }

        T elem = this.tope();
        this.datos.eliminarEn(1);
        return elem;
    }

    public T tope() {
        return this.datos.elemento(1);
    }

    public boolean esVacia() {
        return this.datos.esVacia();
    }
}