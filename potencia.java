import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base; 
        }
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
        scanner.close();
    }
}
