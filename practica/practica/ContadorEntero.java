package practica;

import java.util.Scanner;

public class ContadorEntero { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes
        final int TERMINADOR = 9999;
        final int OBJETIVO = 1000;

        // Variables
        int numero;
        int sumatoria = 0;
        int cantidad = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        
        int masCercanoA1000 = 0;
        int diferenciaMinima = Integer.MAX_VALUE;

        System.out.println("--- Analizador de Datos (Estructura MIENTRAS) ---");
        System.out.println("Ingrese números enteros. Para finalizar, ingrese " + TERMINADOR + ".");
        
        System.out.print("Ingrese el primer número: ");
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt();
        } else {
            System.out.println("Entrada no válida. Finalizando.");
            scanner.close();
            return;
        }

        while (numero != TERMINADOR) {
            // 1. Procesamiento
            sumatoria += numero;
            cantidad++;

            // 2. Menor y Mayor
            if (numero < menor) {
                menor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }

            // 3. Cercano a 1000
            int diferenciaActual = Math.abs(numero - OBJETIVO);
            if (diferenciaActual < diferenciaMinima) {
                diferenciaMinima = diferenciaActual;
                masCercanoA1000 = numero;
            }

            System.out.print("Ingrese el siguiente número: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
            } else {
                System.out.println("\nEntrada no válida. Forzando finalización de lectura.");
                numero = TERMINADOR; 
                scanner.next(); 
            }
        }

        System.out.println("\n--- Resultados del Análisis ---");

        if (cantidad > 0) {
            System.out.println("Sumatoria de números: " + sumatoria);
            System.out.println("Cantidad de números: " + cantidad);
            System.out.println("Menor número: " + menor);
            System.out.println("Mayor número: " + mayor);
            System.out.println("Número más cercano a " + OBJETIVO + ": " + masCercanoA1000);
        } else {
            System.out.println("No se ingresaron números válidos para analizar.");
        }

        scanner.close();
    }
}
