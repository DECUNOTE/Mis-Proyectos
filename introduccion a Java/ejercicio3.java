import java.util.Scanner;

public class ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
/*Escribir un programa que pida una frase y la muestre toda en
mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
Scanner scanner = new Scanner(System.in); 
System.out.println("ingresa una frase");
String frase;
frase = scanner.nextLine();
String mayusculaPalabra = frase.toUpperCase();
System.out.println(mayusculaPalabra);
scanner.close();
}
}
