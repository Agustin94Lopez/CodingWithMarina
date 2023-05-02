import java.util.Scanner;
public class CalculodeNotas {

    private int [] arrayNotas= new int[5];
    private String opcion;
    private boolean finaliza= false;

    public CalculodeNotas() {
    }

    public static void main(String args[]) {

        CalculodeNotas programa = new CalculodeNotas();
        programa.Inicio();
    }
    public void Inicio() {
        MostrarMenu();
    }
    public void MostrarMenu() {

            Scanner s = new Scanner(System.in);
            System.out.println("\nBienvenido al Calculo de notas");
            System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
            System.out.println("[IN] Ingresar las Notas.");
            System.out.println("[LN] Leer las notas.");
            System.out.println("[CM] Calcular minima.");
            System.out.println("[CX] Calcular maxima.");
            System.out.println("[CD] Calcular media.");
            System.out.println("[FI]finalizar ");
            System.out.println("Opción: ");
            opcion= s.nextLine();

            if (opcion.equals("LN") || opcion.equals("ln")) {
              leerDatos();
            }

            if (opcion.equals("CM") || opcion.equals("cm")){
                CalculaMin();
            }

            if (opcion.equals("CX") || opcion.equals("cx")) {
                CalculaMax();
            }
            if(opcion.equals("CD") || opcion.equals("cd")) {
                Calculamedia();
            }
            if (opcion.equals("IN") || opcion.equals("in")){
                IngresarNota();
            }
            if (opcion.equals("fi") || opcion.equals("FI")) {
                Finalizar();
            }
            if (finaliza == false){
                MostrarMenu();
            }


        }

        public void leerDatos() {
         System.out.println(" Las notas son: ");
         for (int i=0; i<arrayNotas.length; i++){
             System.out.print(arrayNotas[i] + " ");
          }
        }

        public void CalculaMin() {
          int minimo=arrayNotas[0];
          for(int i=0; i<arrayNotas.length; i++){
              if (minimo > arrayNotas[i]) {
                  minimo = arrayNotas[i];
              }
          }
          System.out.println("La nota minima es: " + minimo  );
         }

        public void CalculaMax() {
            int maximo= arrayNotas[0];
            for(int i=0; i < arrayNotas.length; i++){
                if (maximo < arrayNotas[i]) {
                    maximo = arrayNotas[i];
                }
            }
            System.out.println("La nota maxima es: " + maximo );
        }

        public void Calculamedia() {
            float media=0;
            float mediana=0;
            for(int i = 0; i < arrayNotas.length; i++) {
                media = media + arrayNotas[i];
            }
            mediana = media / arrayNotas.length;
            System.out.println("La nota media es: " + mediana  );
        }
         public void IngresarNota() {
           Scanner m = new Scanner(System.in);
           System.out.println("Vamos a ingresar las notas");
           for (int i=0; i<arrayNotas.length; i++){
               System.out.println("ingresa la nota: " );
               arrayNotas[i]= Integer.parseInt(m.nextLine());
           }

         }
         public void Finalizar(){
          finaliza= true;
         }

    }

