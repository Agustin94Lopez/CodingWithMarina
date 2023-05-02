import java.util.Scanner;

public class notaEnPalabra {
    private float nota;

    public static void main(String args[]) {

        notaEnPalabra programa = new notaEnPalabra();
        programa.Inicio();
    }

    public void Inicio() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa una nota");
        nota = Float.parseFloat(s.nextLine());

        if ((5 > nota) & (nota <= 0)) {
            Suspendida();

        }
        else if ((nota < 6.49) & (nota >= 5)) {
            Aprobado();
        }

        else if ((nota < 8.9) & (nota > 6.5)) {
           Notable();
        }
        else if ((10 >= nota) & (9 < nota)) {
            Excelente();
        }
        else {
            System.out.println("nota no valida");
        }
    }
    public void Excelente(){
        System.out.println("Excelente");
    }

    private void Suspendida() {
        System.out.println("Suspendido");
    }

    private void Aprobado() {
            System.out.println("Aprobado");
    }

    private void Notable() {
            System.out.println("Notable");
    }


}
