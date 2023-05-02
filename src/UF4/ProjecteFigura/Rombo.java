package UF4.ProjecteFigura;

public class Rombo  extends Figura{

    private static int dM;
    private static int dm;


    /*          ahora las constructoras         */

    public Rombo(){}

    public Rombo(int dM, int dm){
        this.dM=dM;
        this.dm=dm;
        setFigura("Rombo");
    }
/*              ahora vienen los gets y sets    */
    public static int getdM() {
        return dM;
    }

    public static void setdM(int dM) {
        Rombo.dM = dM;
    }

    public static int getDm() {
        return dm;
    }

    public static void setDm(int dm) {
        Rombo.dm = dm;
    }


    /*          ahora las funciones         */

    public double CalcularArea(){
        double area= (getdM() *getDm() ) / 2;
        return area;
    }
}
