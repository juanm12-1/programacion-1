package practica;

import java.util.Scanner;

public class NotasInformaticasTeclado {

    public static void main(String[] args) {
        // 1. Inicializar el objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        int contadorNotables = 0;
        int numNotas;

        // Pedir al usuario el número de notas a introducir
        System.out.println("--- Detección de Notas Notables ---");
        System.out.print("¿Cuántas notas vas a introducir? ");
        
        // Capturar el número total de notas (esto define cuántas veces correrá el bucle for)
        numNotas = scanner.nextInt(); 

        System.out.println("\nIntroduce las notas (valores decimales usa la coma o punto según tu configuración):");

        // 2. Bucle 'for' para iterar el número exacto de notas
        for (int i = 1; i <= numNotas; i++) {
            
            System.out.print("Nota " + i + ": ");
            
            // Lógica para capturar la nota y manejar posibles errores de entrada
            try {
                // Capturar la nota actual (se usa double para permitir decimales)
                double notaActual = scanner.nextDouble(); 

                // 3. Condición para deducir NOTABLES (>= 7 y < 9)
                if (notaActual >= 7.0 && notaActual < 9.0) {
                    
                    System.out.println("  -> ¡NOTA NOTABLE DEDUCIDA!");
                    contadorNotables++;
                }
                
            } catch (java.util.InputMismatchException e) {
                // Manejo de error si el usuario no introduce un número
                System.err.println("¡Error! Debes introducir un valor numérico. Esta nota no se contará.");
                scanner.next(); // Limpia la entrada no válida para evitar un bucle infinito
            }
        }
        
        scanner.close(); // Cerrar el recurso Scanner al terminar
        
        // 4. Salida final al terminar de leer todas las notas
        System.out.println("\n----------------------------------------");
        System.out.println("Proceso finalizado. Total de notas NOTABLES encontradas: " + contadorNotables);
    }
}
    

