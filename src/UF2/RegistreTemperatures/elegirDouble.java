package UF2.RegistreTemperatures;

import java.util.Scanner;

public class elegirDouble {
    public static void main (String[] args) {
        elegirDouble programa= new elegirDouble();
        programa.inicio();
    }
    public void inicio(){
        System.out.println("Escribe un numero Real: ");
        double a = elegirDoubleTeclado();
        System.out.println("El numero Real elegido es: " + a + " .");
    }

    public double elegirDoubleTeclado(){
         Scanner lector= new Scanner(System.in);
         double numero=0;
         boolean elegido=false;
        while (!elegido){
         elegido= lector.hasNextDouble();
         if (elegido){
             numero= lector.nextDouble();
         }
         else {
             System.out.println("Lo introducido no es numero real");
             lector.next();
         }
        }
        lector.nextLine();
        return numero;
    }
}
