import java.util.Scanner;

public class DivisorDeNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero (posible divisor):");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numer(dividendo):");
        int numero2 = entrada.nextInt();

        if (numero2 % numero1 == 0) {
            System.out.println(numero1 + " es divisor de " + numero2);
        } else {
            System.out.println(numero1 + " no es divisor de " + numero2);
        }

        entrada.close();
    }
}