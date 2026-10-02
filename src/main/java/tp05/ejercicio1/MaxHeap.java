package tp05.ejercicio1;
import tp01.ejercicio2.ListaGenerica;

public class MaxHeap <T extends Comparable<T>> implements ColaPrioridades<T> {
    private T[] datos;
    private int cantEltos;

    public MaxHeap() {
        this.datos = (T[]) new Comparable[100];
        this.cantEltos = 0;
    }

    public MaxHeap(ListaGenerica<T> lista) {
        this();
        lista.comenzar();

        while (!lista.fin()) {
            this.agregar(lista.proximo());
        }
    }

    @Override
    public boolean esVacia() {
        return this.cantEltos == 0;
    }

    @Override
    public boolean agregar(T dato){
        //preguntar si hay espacio
        this.datos[cantEltos] = dato;
        this.cantEltos++;

        if(cantEltos>1){
            this.percolate_up();
        }
        return true;
    }

    //agregar más variables
    private void percolate_up(){
        int dimLog = this.cantEltos-1;
        T temp= this.datos[dimLog]; //guarda el elemento a filtrar
        int padre= (dimLog - 1) / 2;
        int comparacion=this.datos[padre].compareTo(temp);

        //mientras no estemos en la raiz y el padre sea menor al elemento
        while (dimLog >0 && comparacion<0){
            this.datos[dimLog]= this.datos[padre];  //bajamos al padre
            dimLog =padre;
            padre = (dimLog - 1) / 2;

            comparacion=this.datos[padre].compareTo(temp);
        }
        this.datos[dimLog]=temp; //ubicacion del elemento
    }

    @Override
    public void eliminar() {
        if (this.esVacia()) {
            return;
        }

        //T raiz= this.datos[0];  //guardo la raiz
        int dimLog= this.cantEltos-1;
        this.datos[0]= this.datos[dimLog]; //guardo ult elemento en la raiz
        this.datos[dimLog]=null;
        this.cantEltos--;


        if(!this.esVacia() && cantEltos>1){
            this.percolate_down(0);
        }
    }

    private void percolate_down(int i) {
        int dimLog = this.cantEltos - 1;
        T candidato = this.datos[i];
        int h_mayor = (2 * i) + 1; //el mayor toma el valor del h_izq

        while (h_mayor <= dimLog) {
            // Si h_der existe dentro del arreglo y si ademas es mayor que el h_izq, h_mayor toma el valor de h_der
            if (h_mayor + 1 <= dimLog && this.datos[h_mayor + 1].compareTo(this.datos[h_mayor]) > 0) {
                h_mayor = h_mayor + 1;
            }

            if (candidato.compareTo(this.datos[h_mayor]) < 0) {
                this.datos[i] = this.datos[h_mayor];
                i = h_mayor;
                h_mayor = (2 * i) + 1;
            } else {
                break; //si el candidato es mayor o igual corta la ejecucion
            }
        }
        this.datos[i] = candidato;
    }

    public void imprimir() {
        for(int i=0; i<this.cantEltos; i++){
            System.out.println(this.datos[i]+ " ");
        }
        System.out.println();
    }

    @Override
    public T tope(){
        if(this.esVacia()){
            return null;
        }
        return this.datos[0];
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}