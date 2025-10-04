package practica;

import java.util.Scanner;

public class InventarioTeclado {

    // Clase interna para representar la ficha de un artículo
    static class Articulo {
        char codigo;
        double precioUnitario;
        int cantidad;

        public Articulo(char codigo, double precioUnitario, int cantidad) {
            this.codigo = codigo;
            this.precioUnitario = precioUnitario;
            this.cantidad = cantidad;
        }

        public double calcularImporte() {
            return precioUnitario * cantidad;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar el número de fichas a procesar
        System.out.print("Ingrese el número total de fichas (excluyendo la 'X' de fin): ");
        int numeroFichas = scanner.nextInt();
        
        // Creamos un arreglo para almacenar los artículos ingresados
        Articulo[] fichasInventario = new Articulo[numeroFichas];

        // 2. Variables de acumulación
        int totalCantidadA = 0;
        double totalImporteA = 0.0;
        int totalCantidadB = 0;
        double totalImporteB = 0.0;

        // 3. PROCESAMIENTO CON ESTRUCTURA FOR TRADICIONAL
        // El ciclo for se ejecuta desde 0 hasta el número de fichas ingresado.
        for (int i = 0; i < numeroFichas; i++) {
            System.out.println("\n--- Ficha de Artículo #" + (i + 1) + " ---");
            
            // a) Pedir Código
            System.out.print("Código del artículo (A o B): ");
            char codigo = scanner.next().toUpperCase().charAt(0); // Convierte a mayúscula
            
            // b) Pedir Precio Unitario
            System.out.print("Precio unitario: ");
            double precio = scanner.nextDouble();
            
            // c) Pedir Número de Artículos
            System.out.print("Número de artículos: ");
            int cantidad = scanner.nextInt();

            // Crear el objeto y almacenarlo (Opcional, se podría calcular directamente)
            Articulo nuevaFicha = new Articulo(codigo, precio, cantidad);
            fichasInventario[i] = nuevaFicha;
            
            // Realizar los cálculos inmediatamente
            switch (nuevaFicha.codigo) {
                case 'A':
                    totalCantidadA += nuevaFicha.cantidad;
                    totalImporteA += nuevaFicha.calcularImporte();
                    break;
                case 'B':
                    totalCantidadB += nuevaFicha.cantidad;
                    totalImporteB += nuevaFicha.calcularImporte();
                    break;
                default:
                    System.out.println("Advertencia: Código no válido. Ficha ignorada para los cálculos.");
            }
        }
        
        scanner.close(); // Siempre cerrar el Scanner

        // 4. Impresión de Resultados
        System.out.println("\n=============================================");
        System.out.println("=== REPORTE FINAL DE INVENTARIO ===");
        System.out.println("=============================================");
        
        System.out.println("\n** Artículo A ** 🍎");
        System.out.println("Número total de artículos A: " + totalCantidadA);
        System.out.printf("Importe total de artículos A: $%.2f%n", totalImporteA);

        System.out.println("\n** Artículo B ** 📦");
        System.out.println("Número total de artículos B: " + totalCantidadB);
        System.out.printf("Importe total de artículos B: $%.2f%n", totalImporteB);
    }
}
