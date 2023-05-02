package UF4.ProjecteFigura;

public class circulo  extends Figura{
    private static int radio;


    /*          ahora las constructoras         */
    public circulo(){}

    public circulo(int r){

        radio=r;
        setFigura("Circulo");
    }

    /*              ahora vienen los gets y sets    */

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        circulo.radio = radio;
    }

    /*          ahora las funciones         */
    public double CalcularArea(){
        double area= Math.pow(getRadio(), 2) * Math.PI;
        return area;
    }

}
