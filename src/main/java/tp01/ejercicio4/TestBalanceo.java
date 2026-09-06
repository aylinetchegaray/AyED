/*
4. Considere un string de caracteres S, el cual comprende únicamente los
caracteres: (,),[,],{,}.
S está balanceado si tiene alguna de las siguientes formas:
S = "" S es el string de longitud cero.
S = "(T)"
S = "[T]"
S = "{T}"
S = "TU"
Donde ambos T y U son strings balanceados. Por ejemplo, "{( ) [ ( ) ] }" está
balanceado, pero "( [ ) ]" no lo está.
*************************************************************************************
a) Indique qué estructura de datos utilizará para resolver este problema y cómo la
utilizará.
b) Implemente una clase llamada tp01.ejercicio4.TestBalanceo (pase por
máquina), cuyo objetivo es determinar si un String dado está balanceado. El String
a verificar es un parámetro de entrada (no es un dato predefinido).
*************************************************************************************/

package tp01.ejercicio4;
import tp01.ejercicio3.PilaGenerica;

public class TestBalanceo {

    public static boolean estaBalanceado(String cadena) {
        PilaGenerica<Character> pila = new PilaGenerica<>();

        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);

            if (actual == '{' || actual == '[' || actual == '(') {
                pila.apilar(actual);
            } else if (actual == '}' || actual == ']' || actual == ')') {
                if (pila.esVacia()) {
                    return false;
                }
                char tope = pila.desapilar();

                if ((actual == '}' && tope != '{') ||
                        (actual == ']' && tope != '[') ||
                        (actual == ')' && tope != '(')) {
                    return false;
                }
            }
        }
        return pila.esVacia();
    }

    public static void main(String[] args) {
        String[] pruebas = {
                "{( ) [ ( ) ] }",
                "( [ ) ]",
                "()[ ]}"
        };

        for (String cadena : pruebas) {
            if (estaBalanceado(cadena)) {
                System.out.println("El string:" + cadena + " está balanceado");
            } else {
                System.out.println("El string:" + cadena + " no está balanceado");
            }
        }
    }
}