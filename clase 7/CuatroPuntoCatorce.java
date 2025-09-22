import java.util.Scanner;
public class CuatroPuntoCatorce{
    public static void main(String[] args) {
        final int PISO_MIN = 1;
        final int PISO_MAX = 25;
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Ingrese el piso actual (" + PISO_MIN + " - " + PISO_MAX + "):");
        int piso = sc.nextInt();
 
        if (piso < PISO_MIN || piso > PISO_MAX) {
            System.out.println("Piso inválido.");
            return;
        }
 
        switch (piso) {
            case PISO_MIN:
                System.out.println("Está en el piso inferior. Sólo puede SUBIR.");
                System.out.println("¿Desea SUBIR? (s/n):");
                String opcionMin = sc.next();
                switch (opcionMin.toLowerCase()) {
                    case "s":
                        System.out.println("Subiendo al piso " + (piso + 1));
                        break;
                    default:
                        System.out.println("No se realizó ninguna acción.");
                }
                break;
            case PISO_MAX:
                System.out.println("Está en el último piso. Sólo puede BAJAR.");
                System.out.println("¿Desea BAJAR? (s/n):");
                String opcionMax = sc.next();
                switch (opcionMax.toLowerCase()) {
                    case "s":
                        System.out.println("Bajando al piso " + (piso - 1));
                        break;
                    default:
                        System.out.println("No se realizó ninguna acción.");
                }
                break;
            default:
                System.out.println("Está en el piso " + piso + ". Puede SUBIR o BAJAR.");
                System.out.println("¿Desea SUBIR (s) o BAJAR (b)?:");
                String opcion = sc.next();
                switch (opcion.toLowerCase()) {
                    case "s":
                        System.out.println("Subiendo al piso " + (piso + 1));
                        break;
                    case "b":
                        System.out.println("Bajando al piso " + (piso - 1));
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
        }
    }
}