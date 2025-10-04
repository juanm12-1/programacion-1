package practica;
import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int N = scanner.nextInt();
        int aprobados = 0;
        int i = 1; // contador para el while
        while (i <= N) {
            System.out.print("Ingrese la calificación del estudiante " + i + " (0-12): ");
            double calificacion = scanner.nextDouble();
            if (calificacion >= 5) {
                System.out.println("El estudiante aprueba");
                aprobados++;
            } else {
                System.out.println("El estudiante reprueba");
            }

            i++; // incrementamos el contador
        }

        System.out.println("Número total de aprobados: " + aprobados);

        scanner.close();
    }
}