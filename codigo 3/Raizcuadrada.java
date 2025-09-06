import java.util.Scanner;

public class Raizcuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registre un numero:");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("No se puede calcular la raiz cuadrada de un numero negativo.");
        } else {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
        }

        scanner.close();
    }
}

    

