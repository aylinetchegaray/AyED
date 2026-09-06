package tp01.ejercicio3;
import tp01.ejercicio2.ListaGenerica;
import tp01.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
    private ListaGenerica<T> datos;

    public PilaGenerica() {
        this.datos = new ListaEnlazadaGenerica<T>();
    }

    public void apilar(T elem) {
        this.datos.agregarInicio(elem);
    }

    public T desapilar() {
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