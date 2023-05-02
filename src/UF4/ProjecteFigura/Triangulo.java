package UF4.ProjecteFigura;

public class Triangulo extends Figura{

    private static int base;
    private static int h;


    /*          ahora las constructoras         */

    public Triangulo(){}

    public Triangulo(int b, int a ){
        base= b;
        h=a;
        setFigura("Triangulo");
    }
    public static int getBase() {
        return base;
    }

    public static void setBase(int base) {
        Triangulo.base = base;
    }

    public static int getH() {
        return h;
    }

    public static void setH(int h) {
        Triangulo.h = h;
    }

    /*          ahora las funciones         */

    public double CalcularArea() {
        double area = (getBase() * getH() ) / 2;
        return area;
    }
}

