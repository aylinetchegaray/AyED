/**2.3. Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de
 *tipo Estudiante (con apellido, nombre, legajo) y los agregue a un objeto de tipo
 * ListaEnlazadaGenerica usando los diferentes métodos de la lista y luego, imprima
 * los elementos de dicha lista usando el metodo tusDatos(). */

package tp01.ejercicio2;

public class TestListaEnlazadaGenerica {
    public static void main(String[] args) {
        ListaEnlazadaGenerica<Estudiante> listaEstudiantes = new ListaEnlazadaGenerica<>();

        Estudiante e1 = new Estudiante("Etchegaray", "Aylin", "UNRN-0000");
        Estudiante e2 = new Estudiante("Ciccarelli", "Federico", "UNRN-0001");
        Estudiante e3 = new Estudiante("Fernández", "Emiliano", "UNRN-0002");
        Estudiante e4 = new Estudiante("Lara", "Lionel", "UNRN-0003");
        Estudiante[] Estudiantes= {e2, e3, e1};

        listaEstudiantes.agregarInicio(e1);
        listaEstudiantes.agregarFinal(e4);
        listaEstudiantes.agregarEn(e3, 2);
        listaEstudiantes.agregarInicio(e2);
        listaEstudiantes.agregar(Estudiantes);

        System.out.println("Listado de Estudiantes: ");

        listaEstudiantes.comenzar();
        while (!listaEstudiantes.fin()) {
            System.out.println(listaEstudiantes.proximo().tusDatos());
        }
    }
}