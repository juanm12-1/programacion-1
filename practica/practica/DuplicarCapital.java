package practica;

public class DuplicarCapital {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Definición de variables y parámetros
        double capitalInicial = 1000.0;
        double tasaInteresAnual = 0.05; // Ejemplo: 5%
        
        double capitalObjetivo = capitalInicial * 2;
        double capitalActual = capitalInicial;
        int anios = 0;
   
        for (anios = 1; capitalActual < capitalObjetivo; anios++) {
            
            // Cálculo del interés compuesto
            capitalActual = capitalActual * (1 + tasaInteresAnual);

        }

        int aniosParaDuplicar = anios - 1; 

        System.out.println("El capital se doblará al término de: " + aniosParaDuplicar + " años.");
    }
}
