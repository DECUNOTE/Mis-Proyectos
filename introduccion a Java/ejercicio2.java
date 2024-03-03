import java.util.Scanner;

public class ejercicio2 {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
/* Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por pantalla.*/

    Scanner leer = new Scanner(System.in);// variable para la interaccion entre el usuario y el programa, no olvidar importar.
        System.out.println("ingresa tu nombre por favor "); // msj para mostrar por pantalla.
        //variables a usar :
        String usuario = leer.nextLine();
        System.out.println("hola!!!!! "+ usuario);
        leer.close();

    }
}
