import java.util.Scanner;

public class contar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i); 
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || 
                caracter == 'o' || caracter == 'u' || 
                caracter == 'A' || caracter == 'E' || 
                caracter == 'I' || caracter == 'O' || 
                caracter == 'U') {
                contador++; 
            }
        }
        System.out.println("Número de vocales: " + contador);
        scanner.close();
    }
}
