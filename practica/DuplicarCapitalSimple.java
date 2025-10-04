package practica;

public class DuplicarCapitalSimple {

    public static void main(String[] args) {
        // 1. Definición de variables y parámetros
        double capitalInicial = 1000.0;
        double tasaInteresAnual = 0.05; // Ejemplo: 5%
        
        double capitalObjetivo = capitalInicial * 2;
        double capitalActual = capitalInicial;
        int anios = 0;

        // 2. Bucle For para simular el crecimiento anual
        // La condición de continuación es: mientras el capital actual sea menor que el objetivo
        for (anios = 1; capitalActual < capitalObjetivo; anios++) {
            
            // Cálculo del interés compuesto
            capitalActual = capitalActual * (1 + tasaInteresAnual);
            
            // Opcional: imprimir el crecimiento por año (comentar para una versión más simple)
            // System.out.println("Año " + anios + ": " + capitalActual);
        }

        // 3. Resultado
        // El -1 es porque el bucle incrementa 'anios' una vez más antes de terminar
        int aniosParaDuplicar = anios - 1; 

        System.out.println("El capital se doblará al término de: " + aniosParaDuplicar + " años.");
    }
}
