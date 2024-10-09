import java.util.Scanner;

public class potenciaMetodo {

    // Método para calcular la potencia
    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1; // Inicializar el resultado en 1
        for (int i = 0; i < exponente; i++) {
            resultado *= base; // Multiplicar el resultado por la base
        }
        return resultado; // Devolver el resultado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la base y el exponente
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        
        System.out.print("Ingresa el exponente: ");
        int exponente = scanner.nextInt();
        
        // Llamar al método para calcular la potencia
        int resultado = calcularPotencia(base, exponente);
        
        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
        
        // Cerrar el escáner
        scanner.close();
    }
}
