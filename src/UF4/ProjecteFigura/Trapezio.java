package UF4.ProjecteFigura;

public class Trapezio  extends Figura{

    private static int a;
    private static int b;
    private static int h;
    public Trapezio(){}

    /*          ahora las constructoras         */
    public Trapezio (int a, int b, int h){
        this.a=a;
        this.b=b;
        this.h=h;
        setFigura("Trapezio");
    }
/*          ahora empiezan los get y set    */
    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Trapezio.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Trapezio.b = b;
    }

    public static int getH() {
        return h;
    }

    public static void setH(int h) {
        Trapezio.h = h;
    }

    /*          ahora las funciones         */

    public double CalcularArea(){
       double area = ((getA() * getB()) * getH()) / 2;
       return area;
    }
}
