import java.util.Scanner;
public class pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("ingrese la base");
        int base = scanner.nextInt();
        System.out.print("ingrese el exponente");
        int exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);
        
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        scanner.close(); 
    }
}
