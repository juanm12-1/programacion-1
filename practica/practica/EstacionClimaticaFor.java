package practica;

import java.util.Scanner;

public class EstacionClimaticaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos días de temperaturas deseas introducir?: ");
        int numDias = sc.nextInt();
        
        // Cierra el Scanner al final de la ejecución para buenas prácticas
        // No es estrictamente necesario en main, pero es recomendado
        
        int totalDiasValidos = 0;   // Días con datos válidos
        int errores = 0;          // Días marcados con '9' en alguna temperatura
        double sumaMax = 0;         
        double sumaMin = 0;         
        
        // Definimos la constante para el valor de error (9)
        final int VALOR_ERROR = 9;

        for (int i = 1; i <= numDias; i++) {
            System.out.println("\n--- Día " + i + " ---");
            System.out.print("Temperatura máxima: ");
            int tMax = sc.nextInt();
            System.out.print("Temperatura mínima: ");
            int tMin = sc.nextInt();
            
            // La condición de error: si alguna de las dos temperaturas es igual a 9
            if (tMax == VALOR_ERROR || tMin == VALOR_ERROR) {
                System.out.println("-> ¡Día marcado como error! (Valor 9 detectado).");
                errores++;
            } else {
                // Validación adicional: una mínima nunca debe ser mayor que una máxima
                if (tMin > tMax) {
                    System.out.println("-> ¡Error lógico! La mínima (" + tMin + ") es mayor que la máxima (" + tMax + "). Se cuenta como error.");
                    errores++;
                } else {
                    // Si el día es válido, se suma a los totales
                    totalDiasValidos++;
                    sumaMax += tMax;
                    sumaMin += tMin;
                }
            }
        }
        
        sc.close(); // Cierra el Scanner

        // Cálculo de las medias y porcentajes
        double mediaMax = (totalDiasValidos > 0) ? sumaMax / totalDiasValidos : 0;
        double mediaMin = (totalDiasValidos > 0) ? sumaMin / totalDiasValidos : 0;
        
        // El porcentaje de errores se calcula sobre el total de días introducidos (numDias)
        double porcentajeErrores = (numDias > 0) ? (errores * 100.0) / numDias : 0;
        
        // Imprimir resultados
        System.out.println("\n===== RESULTADOS ESTACIÓN CLIMÁTICA =====");
        System.out.println("Total de días solicitados: " + numDias);
        System.out.println("Número de días válidos para promedios: " + totalDiasValidos);
        System.out.printf("Media de temperaturas máximas: %.2f%n", mediaMax);
        System.out.printf("Media de temperaturas mínimas: %.2f%n", mediaMin);
        System.out.println("Número de errores (días con 9 o lógica incorrecta): " + errores);
        System.out.printf("Porcentaje de errores sobre el total de días: %.2f %%n", porcentajeErrores);
        System.out.println("==========================================");
    }
}