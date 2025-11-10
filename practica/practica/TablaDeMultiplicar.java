package practica;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int n = 5;

        // Usando for
        System.out.println("Tabla del " + n + " con for:");
        for (int j = 1; j <= 15; j++) {
            System.out.println(n + " x " + j + " = " + (n * j));
        }

        // Usando while
        System.out.println("\nTabla del " + n + " con while:");
        int j = 1;
        while (j <= 15) {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        }
    }
}
