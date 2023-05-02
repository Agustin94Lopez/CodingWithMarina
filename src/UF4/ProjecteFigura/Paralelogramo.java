package UF4.ProjecteFigura;

public class Paralelogramo  extends Figura{

    private static int b;
    private static int h;


    /*          ahora las constructoras         */
    public Paralelogramo(){}

    public Paralelogramo(int b, int h){
        this.b=b;
        this.h=h;
        setFigura("Paralelogramo");
    }


    /*              ahora vienen los gets y sets    */

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Paralelogramo.b = b;
    }

    public static int getH() {
        return h;
    }

    public static void setH(int h) {
        Paralelogramo.h = h;
    }


    /*          ahora las funciones         */
    public double CalcularArea(){
        double area= getB()*getH();
        return area;
    }
}
