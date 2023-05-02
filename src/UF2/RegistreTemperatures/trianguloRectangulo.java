package UF2.RegistreTemperatures;

import java.util.Scanner;

public class trianguloRectangulo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int num = lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("a");

            for(int j=num;j>i;j--){
                System.out.println("b");
            }
        }
    }
}
