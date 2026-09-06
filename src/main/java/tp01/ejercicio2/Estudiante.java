/**2.3. Clase Estudiante (con apellido, nombre, legajo)
 * con el metodo tusDatos() que imprime la informacion del objeto.*/

package tp01.ejercicio2;

public class Estudiante {
    private String apellido;
    private String nombre;
    private String legajo;

    public Estudiante(String apellido, String nombre, String legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String tusDatos() {
        return "Legajo: " + this.legajo + " | " + this.apellido + ", " + this.nombre;
    }
}