package practica;

public class ComisionVendedor {
    public static void main(String[] args) {
        double ventas = 1900000;
        double comision = 0;
        if (ventas > 1000000){
            comision = ventas * 0.05;
            System.out.println("el valor de las ventas es: $"+ ventas);
            System.out.println("Felicidades se ha  ganado una comision.");
            System.out.println("El valor de la comocion es: $"+ comision);
            }else{
                System.out.println("El valor de las ventas es: $"+ ventas);
                System.out.println("Las ventas no superaron el umbral para obtener una comision.");
        }
    }
    
}
