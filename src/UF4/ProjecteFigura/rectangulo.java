package UF4.ProjecteFigura;

public class rectangulo  extends Figura{

    private static int constante1;
    private static int constante2;


    /*          ahora las constructoras         */
    public rectangulo(){}

    public rectangulo(int c1, int c2){
        constante1= c1;
        constante2= c2;
        setFigura("Rectangulo");
    }

 /*
 * ahora empiezan los get y set */

    public static int getConstante1() {
        return constante1;
    }

    public static void setConstante1(int constante1) {
        rectangulo.constante1 = constante1;
    }

    public static int getConstante2() {
        return constante2;
    }

    public static void setConstante2(int constante2) {
        rectangulo.constante2 = constante2;
    }
    /*
    * ahora empiezan las funciones*/
    public double CalcularArea(){
        double area = getConstante1()*getConstante2();
        return area;
    }
}
