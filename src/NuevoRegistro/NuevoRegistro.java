package NuevoRegistro;

import java.util.Scanner;


public class NuevoRegistro {
    public static void main(String[] args) {
        String opcion;
        Scanner s = new Scanner(System.in);
        System.out.println("Como quieres los resultados:");
        System.out.println("[EN] Enteros");
        System.out.println("[DE] Decimales");
        opcion= s.nextLine();

        if (opcion.equals("EN") || opcion.equals("en")) {
            int[] notes = new int[5];
            Scanner si = new Scanner(System.in);


            for (int i=0; i< notes.length; i++){
                System.out.println("Ingresa la nota: ");
                notes[i]=si.nextInt();
            }

            String op;
            Scanner sasa = new Scanner(System.in);
            System.out.println("Que nota quieres? ");
            System.out.println("[MX] Maxima");
            System.out.println("[MI] Minimo");
            System.out.println("[MT] Mitjana");
            op= sasa.nextLine();
            calcInt inte= new calcInt();
            switch (op) {
                case "MX", "mx":{
                    int max = inte.calcularMaxim(notes);
                    System.out.println("La nota màxima és " + max + ".");
                }
                case "MI", "mi":{
                    int min = inte.calcularMinim(notes);
                    System.out.println("La nota mínima és " + min + ".");
                }
                case "MT", "mt":{
                    int mitjana = inte.calcularMitjana(notes);
                    System.out.println("La mitjana de les notes és " + mitjana + ".");
                }
            }
        }
        else if (opcion.equals("DE") || opcion.equals("de")) {
            double[] notas = new double[5];
            Scanner si = new Scanner(System.in);

            for (int i=0; i< notas.length; i++){
                System.out.println("Ingresa la nota: ");
                notas[i]=si.nextDouble();
            }

            String op;
            Scanner sas = new Scanner(System.in);
            System.out.println("Que nota quieres? ");
            System.out.println("[MX] Maxima");
            System.out.println("[MI] Minimo");
            System.out.println("[MT] Mitjana");
            op= sas.nextLine();
            calcDouble doubla = new calcDouble();

            switch (op) {
                case "MX", "mx":{
                    double max = doubla.calcularMaxima(notas);
                    System.out.println("La nota màxima és " + max + ".");
                }
                case "MI", "mi":{
                    double min = doubla.calcularMinima(notas);
                    System.out.println("La nota mínima és " + min + ".");
                }
                case "MT", "mt":{
                    double mitjana = doubla.calcularMitjanaa(notas);
                    System.out.println("La mitjana de les notes és " + mitjana + ".");
                }
            }

        }
    }
}
