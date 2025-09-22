package practica;

import java.util.Scanner;

public class ProductoNumero {
    public static void main(String[] args) {
        Scanner entrada = new
        Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int numero1 = entrada.nextInt();
        System.out.println("introduce el segundo numero:");
        int numero2 = entrada.nextInt();
        int producto = numero1 + numero2;
        if (producto > 30){
            System.out.println("el producto es superior a 30. los nuemros introducidos fueron:" + numero1 +"y" + numero2);
            }else{
                System.out.println("el producto no es superior a 30. el resultado es:"+ producto);
                }
                entrada.close();

    }
    
}
