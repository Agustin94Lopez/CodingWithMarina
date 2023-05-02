package UF2.RegistreTemperatures;//importem la biblioteca Scanner per a poder recolir dades de la temrinal
import java.util.Scanner;

public class CalculArees {
    private double area;
    private String figura;

  public static void main(String args[]) {

    CalculArees programa= new CalculArees();
    programa.inicio();
  }
  public void inicio() {
      Scanner s = new Scanner(System.in);
      System.out.println("De quina figura vols calcular l'area?\n");
      System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
      figura = s.nextLine();
      elegirArea();
      System.out.println("La figura elegida es " + figura + " y su area es: " + area);

  }
  public void elegirArea() {



      if (figura.equalsIgnoreCase("triangle")) {
         triangulo();
      } else if (figura.equalsIgnoreCase("quadrat")) {
          cuadrado();
      } else if (figura.equalsIgnoreCase("rectangle")) {
          rectangulo();
      } else if (figura.equalsIgnoreCase("trapezi")) {
          trapecio();
      } else if (figura.equalsIgnoreCase("rombe")) {
          rombo();
      } else if (figura.equalsIgnoreCase("paralelogram")) {
          paralelogramo();
      } else if (figura.equalsIgnoreCase("cercle")) {
          circulo();
      }
      else{

          System.out.println("Opcion incorrecta!\n");
       }

  }
    public double triangulo() {
      if (figura.equals("triangle")) {
        double b = 23.0;
        double h = 8.0;
        area = (b * h) / 2;
      }
      return area;
    }
    public double cuadrado() {
      if (figura.equals("quadrat")) {
        double r = 37.0;
        //funció matemàtica que eleva a 2 el radi
        area = Math.pow(r, 2);
      }
      return area;
    }

    //cas en que la figura = "rectangle"
    public double rectangulo() {
      if (figura.equals("rectangle")) {
        double a = 68.0;
        double b = 39.0;
        area = a * b;
      }
      return area;
    }

    //cas en que la figura = "trapezi"
    public double trapecio() {
      if (figura.equals("trapezi")) {
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        area = ((a * b) * h) / 2;
      }
      return area;
    }

    //cas en que la figura = "rombe"
    public double rombo(){
    if (figura.equals("rombe")) {
      double dM = 75.0;
      double dm = 30.0;
      area = (dM * dm) / 2;
    }
    return area;
  }

  //cas en que la figura = "paralelogram"
  public double paralelogramo(){
      if(figura.equals("paralelogram")){
        double b = 45.0;
       double h = 13.0;
       area = b * h;
       }
      return area;
   }

    //cas en que la figura = "cercle"
    public double circulo(){
      if (figura.equals("cercle")) {
          Scanner sa = new Scanner(System.in);
        System.out.println("Cual es el radio del circulo?");
        double r = sa.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        area = Math.pow(r, 2) * Math.PI;
      }
      return area;
    }

  }

