package UF4.ProjecteFigura;

public class Figura {
    private String figura;
    private static int id;

    /*          ahora las constructoras         */
    public Figura(){
        this.id = ++this.id;
    }
    public Figura (String f, int i){
        figura=f;
        id=++i;
    }


    /*              ahora vienen los gets y sets    */


    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    /*          ahora las funciones         */

    public double CalcularArea() {
        return 0;
    }

    public void imprimirDatos(){
        System.out.println("La figura con ID " +getId() + " es un " +getFigura() );
        System.out.println("El area de la figura " + getFigura() + " es " + CalcularArea() );
        System.out.println(" ");
        System.out.println("----------------------------------------------");

    }
}
