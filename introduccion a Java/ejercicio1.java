import java.util.Scanner;
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        El programa deberá después mostrar el resultado de la suma*/

        Scanner leer = new Scanner(System.in); // variable para la interaccion del usuario con el programa, no olvidar importar.
        System.out.println("ingresa el primer numero y luego el siguiente"); // msj para mostrar por pantalla.
        // variables que utilizaremos tipo int (entero):.
        int num1;
        int num2;
        // asigno el valor a las variables a tra vez del sacanner;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int result = num1 + num2;
        System.out.println("el resultado de la suma es :" + result);
        leer.close();  

    }
    
}
