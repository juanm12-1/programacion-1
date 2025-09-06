import java.util.Scanner;

public class NumeroCentral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double numero2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero:");
        double numero3 = entrada.nextDouble();
        double NumeroCentral;
        if((numero1>numero2&&numero1<numero3)||(numero1<numero2&&numero1>numero3)){
            NumeroCentral=numero1;
            }else if((numero2>numero1&&numero2<numero3)||(numero2<numero1&&numero2>numero3)) {
                NumeroCentral = numero2;
                }else{
                    NumeroCentral = numero3;}
                    System.out.println("El numero central es:"+NumeroCentral);
                    entrada.close();
                
            }
            
        

    
    }

    
