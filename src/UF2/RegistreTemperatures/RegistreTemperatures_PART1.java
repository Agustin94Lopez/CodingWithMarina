package UF2.RegistreTemperatures;

import java.util.Scanner;

public class RegistreTemperatures_PART1 {
  //Constants
  private static final int MAX_SETMANES = 52;

  //Variables globals
  private int numTemperatures = 0;
  private float[] temperatures = new float[MAX_SETMANES * 7];
  private int dia = 1;
  private int mes = 1;

  //M todes associats al problema general
  public static void main (String[] args) {
    RegistreTemperatures_PART1 programa = new RegistreTemperatures_PART1();
    programa.inici();
  }

  public void inici() {

  }

  //Mètodes associats al punt 2 
  public void mostrarMenu() {
    
     
  }

  public void tractarOpcio() {
   Scanner lector = new Scanner (System.in);
   System.out.println("Opcion: ");
   String menu =lector.nextLine();
  }

  //M todes associats al punt 3
  public void registreTemperaturesSetmanals() {

  }

  public void mostrarMitjana() {

  }

  public void mostrarDiferencia() {

  }

  public void finalitzarExecucio() {

  }
  public void llegirTemperaturaTeclat(){

  }
  public void IncrementarData(){

  }
  public void MostrarData(){

  }
  public void CalcularMitjana(){

  }
  public void DiferenciaMaxima(){
    
  }

  //Aquí és on heu de declarar els mètodes que falten
}
