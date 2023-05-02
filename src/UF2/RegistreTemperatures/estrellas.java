package UF2.RegistreTemperatures;

public class estrellas {
 public static void main (String[] args) {
    estrellas programa= new estrellas();
    programa.inici();
 }
 public void inici(){
     estrellar(4);
     estrellar(10);
     estrellar(20);
     estrellar(10);
     estrellar(20);
     estrellar(10);
     estrellar(20);
     estrellar(10);
     estrellar(20);
     estrellar(10);
     estrellar(20);
 }
 public void estrellar (int a){

     for (int i=a; i>0; i--){

         System.out.print("*");
     }
     System.out.println("");
 }
}
