package UF4.ProjecteFigura;

public class cuadrado  extends Figura{
    private static int constante;


    /*          ahora las constructoras         */
    public cuadrado(){}

    public cuadrado(int r){
        constante=r;
        setFigura("Cuadrado");
    }

    /*          ahora las funciones         */
    public static int getConstante() {
        return constante;
    }

    public static void setConstante(int constante) {
        cuadrado.constante = constante;
    }

    /*          ahora las funciones         */

    public double CalcularArea(){
        double area =Math.pow(getConstante(), 2);
        return area;
    }

}
