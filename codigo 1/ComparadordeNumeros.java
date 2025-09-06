import java.util.Scanner;

public class ComparadordeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        double numero1 = entrada.nextDouble();
        System.out.println("ingrese el segundo numero:");
        double numero2 = entrada.nextDouble();
        if(numero1>numero2){System.out.println("El primer numero("+numero1+")es el mas grande.");}
        else if (numero1<numero2) {
            System.out.println("El segundo numero("+numero2+")es el mas pequeño.");
        }else{
           System.out.println("Ambos numeros son iguales.");
            entrada.close();
            

            
        }
        
    }

    
}