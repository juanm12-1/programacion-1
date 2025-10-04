package practica;

import java.util.Random;

public class DatosDeEmpresa {
    public static void main(String[] args) {
        final int LIMITE_ALTO = 300000;
        final int LIMITE_BAJO = 100000;
        final int NUM_EMPLEADOS = 50;

        int salarioAlto = 0;
        int salarioMedio = 0;
        int salarioBajo = 0;

        Random random = new Random();

        System.out.println("--- Simulación de salarios y clasificación (50 empleados) ---");

        // Generamos salarios aleatorios entre 50.000 y 500.000
        for (int i = 0; i < NUM_EMPLEADOS; i++) {
            int salario = random.nextInt(451_000) + 50_000; // rango [50.000, 500.000]

            // Clasificación
            if (salario > LIMITE_ALTO) {
                salarioAlto++;
            } else if (salario >= LIMITE_BAJO) {
                salarioMedio++;
            } else {
                salarioBajo++;
            }

            // Mostrar salario del empleado
            System.out.println("Empleado " + (i + 1) + ": " + salario + " ptas");
        }

        // Resultados
        System.out.println("\n==============");
        System.out.println("Análisis salarial:");
        System.out.println("==============");
        System.out.println("a) Empleados con salario alto  (> " + LIMITE_ALTO + " ptas): " + salarioAlto);
        System.out.println("b) Empleados con salario medio (" + LIMITE_BAJO + " - " + LIMITE_ALTO + " ptas): " + salarioMedio);
        System.out.println("c) Empleados con salario bajo  (< " + LIMITE_BAJO + " ptas): " + salarioBajo);
        System.out.println("Total empleados: " + (salarioAlto + salarioMedio + salarioBajo) + " / " + NUM_EMPLEADOS);
    }
}
