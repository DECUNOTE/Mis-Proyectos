import java.util.Scanner;

public class ejercicio5 {
            /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    /*Escribir un programa que lea un número entero por teclado y
    muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    Nota: investigar la función Math.sqrt().*/
int num1 =0;
Scanner scanner = new Scanner(System.in);
System.out.println("ingresa un numero y te eseñare algo");
num1 = scanner.nextInt();
System.out.println("El Doble es : " + Math.scalb(num1, 1));        
        System.out.println("El Triple es : " + num1 * 3);
        System.out.println("La Raiz Cuadrada es : " + Math.scalb(num1, num1));
scanner.close();
}
}
