import java.util.Scanner;

public class ejercicio4 {
        /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
/*Dada una cantidad de grados centígrados se debe
mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es:
  F = 32 + (9 * C / 5).
 */

Scanner scaner = new Scanner(System.in);
System.out.println("Ingrese los centigrados : ");
int C,F;
        C = scaner.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("Su equivalente a Fahrenheit es: " + F);
        scaner.close();
}
}